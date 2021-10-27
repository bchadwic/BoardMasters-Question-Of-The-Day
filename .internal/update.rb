num = ARGV[0]
url = ARGV[1]

num = num.to_i
if num < 1
    puts "Invalid number"
    exit
end

if num == nil || url == nil
    puts "Usage: update.rb <num> <url>"
    exit
end

if url.match(/^https:\/\/leetcode\.com\/problems\/[\w-]+\/$/) == nil
    puts "Invalid url"
    exit
end

prb = url[30..-2].gsub!(/-/, ' ').gsub!(/\b[\w]/, &:capitalize)

replace = "[#{num}. #{prb}](#{url})"

if !File.exist?('../README.md')
    puts "File not found"
    exit
end

if !system("git checkout internal") 
    puts "Failed to checkout internal"
    exit
end

readme = File.read('../README.md')
puts readme.match(/^\[\d+\.[\w ]+\]\(.+\)$/)   
if readme.match(/^\[\d+\.[\w ]+\]\(.+\)$/) == nil
    puts "String to be replaced wasn't found"
    exit
end
readme.gsub!(/^\[\d+\.[\w ]+\]\(.+\)$/m, replace)
File.open('../README.md', 'w') { |file| file.write(readme) }

if !system("git add ../README.md") 
    puts "Failed to add file"
    exit
end

if !system("git commit -m \"Updating the Question of the Day :)\"") 
    puts "Failed to commit"
    exit
end

if !system("git push") 
    puts "Failed to push"
    exit
end

if !system("gh pr create -f") 
    puts "Failed to create pull request"
    exit
end

if !system("gh pr merge -s")
    puts "Failed to merge pull request"
    exit
end

if !system("git checkout main && git pull")
    puts "Failed to pull and return to \"main\""
    exit
end