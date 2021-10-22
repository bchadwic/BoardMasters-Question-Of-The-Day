## Why should you contribute?
1. This is a great spot to learn, build open-source talent, or impress employers in *any* language you want!
2. Every solution posted has a chance to give a new perspective to someone trying to learn more about whiteboard challenges.
3. Leverage a great community to help enhance solutions with code reviews, and peer solution comparisons 

## How to contribute:
### GitHub.com
1. Fork the repo
2. Clone to local by `git clone https://github.com/bchadwic/BoardMasters-Question-Of-The-Day.git`

### GitHub CLI
2. `gh repo fork --clone bchadwic/BoardMasters-Question-Of-The-Day`

<hr>

### Local

3. Go to the solution folder in the local .git repo that matches your language
    - if your language folder isn't there, create a folder with your solutions language as the name in all lowercase

4. A) If there is already a solution:
    - go into the file titled with the problem's name and paste your solution, feel free to add a comment with your name or an explanation
  
    B) If there isn't already a solution:
    - copy the problem's name, along with the # prefix, and use it as the new files name along with the appropriate extension for your language
      - note: if you are using an IDE, such as a JetBrains tool, it may be easier to create a plain `File` to avoid naming convention conflicts
      - ex: `1. Two Sum .c`= the `#. problem name` of https://leetcode.com/problems/two-sum/ + ` .language extension`
5. Add all and commit `git add . && git commit -m "Created by *USERNAME*"`
6. Push changes `git push`
<hr>

### GitHub.com
7. Create a pull request with from `YOUR-HOST/main` to `bchadwic/main` by clicking `Pull requests` and `New pull request`

### GitHub CLI
7. `gh pr create -f -R bchadwic/BoardMasters-Question-Of-The-Day -B main`
