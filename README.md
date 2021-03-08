# OOP2 Courseware

This Courseware-Project is for examples and sample solutions from the lecture.
You can also implement the exercise examples in this project.

In a first step you shoul get the intial "Hello World" example running in your IDE.

## With IDE support

In IntelliJ you can clone the project using: `File -> New -> Project from Version Control … -> Git`

You can also clone your GitHub repository (using cmd, or similar) and import the project using IntelliJ.

If everything went fine in your project view the folder `src/main` should be blue and the folder `src/main` should be green.
Try running the sample code in `HelloWorld`.

## In case of problems with the IntelliJ setup

Do the following steps:
- Close the open project (File -> Close Project)
- Select "OPEN"
- In the window, navigate to your project
- Select the File "build.gradle"
- In the next window select "Open as Project".

You can also use the `build.grade` file for a project setup in Eclipse or NetBeans.

## Create a private duplicate (Fork)
1. Fork this repo (top right next to star and watch)
2. Clone your fork `git clone <url>`
3. Add upstream remote to the original repo `git remote add upstream https://github.com/lunactic/oop2_working_repo.git`

## Keep your Fork synced to the orignal
1. Fetch updates from the original `git fetch upstream`
2. Check out your fork's local default branch `git checkout main`
3. Merge the changes from the upstream default branch - in this case, upstream/main - into your local default branch 
   `git merge upstream/main`
   
more help with forks [here](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/working-with-forks)

## Pleas note:

The graded homework and project work are **NOT** part of this repository.
For these there will be separate repositories/projects.