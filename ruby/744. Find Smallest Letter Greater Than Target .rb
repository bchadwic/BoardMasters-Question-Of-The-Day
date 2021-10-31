# @param {Character[]} letters
# @param {Character} target
# @return {Character}
def next_greatest_letter(letters, target)
    min = '~' # high value ascii character
    nextGreatest = '~'
    letters.each do |letter|
        if letter < min
            min = letter
        end
        if letter > target && letter < nextGreatest
            nextGreatest = letter
        end
    end
    if nextGreatest != '~'
        return nextGreatest
    end
    return min
end
