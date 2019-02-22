# git-bisect-demo
Demonstration how to use git bisect

I contains a simple java class which is used to run a test on it.
A certain commit will make the test fail.
With git bisect we can automatically find the commit which made the test fail.

## requirements
- java 1.8
- gradle
- git

## how to run
- clone the project
- checkout master (this comes with broken test)
- check git history with
`git log --online `
- figure out the commit which introduces a bug is *7024e4c* 
- figure out a working commit is *38a178c*(usually you pick something in the past you tested successfully)
- start bisect process `git bisect start`
- define a good commit `git bisect good 38a178c`
- define a bad commit `git bisect bad 9ade278`
- let git bisect find the first bad commit while automatically running test
`git bisect run gradle test`

git bisect will start checking out the good commit and run tests. Then the commit after until it finds the first commit which fails(till the bad commit you defined).

Its basically a helper to find a commit which introduced a bug/failing test. 
