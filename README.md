# GitPractice_May25_2020
This is Demo Repository


Git is Decentralized/Distributed version control sys.
Most operations in Git are local. Only few commands need n/w access.
Git is Super Fast as most operations are local
Free/open source.

The Repository:
Collection of Files Managed by Git  and History of all it is described as Repository.

Commits and Files:
All the files managed by git are called Snapshots  which are called commits
One or More File Changes


Git For Windows
Https://Git-SCM.com

git config —global user.name “your Name”
git config —global user.email “ your@email.com”

Git Commands:
(1) git init demo -> Creates Git Repository in the directory created
(2) ls -al    —> We can view all files and projects of Git Repository




Git States:
Working Directory : Contains all files and folders related to ur project.

Staging Area : Staging area is used to prepare for the next commit. Files are moved from modified working directory state to the Git staging area and finally committed to the Git Repository.

Repository (.git floder) : Contains all committed and Saved changes of Git Repository

The above 3 states are related to local git repository

4th State:
Remote state:


(4)Git Status:

git status —>  Display the status of the current Directory.


(5) ls -> Lists all the files and directories in the current  directory


(6)To add a file to Git Directory:
git add GitCommands.rt
When the above command is executed ,the file is moved to staging state and is about to be committed.
git add .
The above command will add all files in directory to the staging area.

(7)Commit command:
git commit -m  "First Commit from Demo"

(8)Command to get Home Directory:
AMB01384:demo 245742$ pwd


(9)To Exit from Commit option and return to current command prompt
Type  :qa!  and press <Enter> to abandon all changes and exit Vim

(10)  git log
Git Responds with all commits that are part of this repository.

(11) git show
It will show the last commit and a diff containing all the changes.
Note: Press q to get out of the show command


(12)git ls-files
Specifies the files that are being Tracked

Example:
AMB01384:demo 245742$ git ls-files
GitCommands.rtf
TestGit.rtf
(13) touch newfile
Adds a new file with Name “newFile” to the directory.

(14) rm newFile
Removes a file with name “newFile” in the directory

(15)  git commit -a
Express commit .
-a parameter tells Git to first add modified files to the Git Staging area.

(16)git commit -am "Express Commit"
-a parameter tells Git to first add modified files to the Git Staging area.
-am : Can add Git commit message along with modified files.

(17) git reset HEAD TestGit.rtf
Resets all the changes of this file

(18) Git Log : To display all commits in a single line
git log --oneline --graph --decorate --all
* 96daa21 (HEAD -> master) Commit
* 3316a78 Express Commit
* 4d0d62d 3rd Commit
* 1a72bae 2nd  Commit from Demo
* ec183f8 First Commit from Demo
* 9bf99e6 First Commit from Demo

(19)Git Alias : To Create our own command
git —global alias.hist “log --oneline --graph --decorate --all”
Where “hist” is the name of the new alias command.

Using Alias : git hist (Which displays same info as git log --oneline —graph and so on)


(20)Command to Rename a File:
git mv NewTestFile.txt  NewTestDemoFile.txt
git mv gitignore.txt  gitignore

(21) To Remove a file
git rm NewTestDemoFile.txt

(22) Excluding UnWanted Files and Directories:


(23) To See differences b/w commits use git diff command:
git diff ec183f8 HEAD

(24) git diff
To compare difference b/w current change with the Head

(26) To See Differences between Branches
git diff master updates
Note: Where master and updates are 2 different branches.

(25) What is HEAD?
HEAD is generally last commit to the current branch.

(26)git branch
This command gives the name of the current branch we are in .

(27)git checkout -b
For creating a new Branch with the name and switch to it.
Example For New Branch Creation:
AMB01384:demo 245742$ git checkout -b updates
M	GitCommands.rtf
Switched to a new branch 'updates'

(28) Checkout command
To switch between branches we use checkout command.
Ex: Go Switch to master branch
git checkout master


(29)Merge Branch.
In order to merge branches use “merge” command.
Example: Currently we are in master branch and want to merge changes made in “updates” branch. Use the below command.

git merge updates

Merge changes from “updates” branch to “master” branch.

(30) To Delete a branch:
git branch -d updates
git branch -a : Displays list of all branches. Made changes from master on the same line made by very-bad again to merge.


(31)Tags:
Tags are just labels that you can put on any arbitrary commit point git
Tag Command:
Light WeightTag: No Associated information about the Tag
git tag myTag
git tag --list  - Displays list of all Tags

To Delete a Tag:
git tag -d mytag

Annotated Tag:
git tag -a v1.0 -m "Release 1.0"
To display information about the Tag
git show v1.0

(32)Stashing:
Git Stash is used when we donot want to commit change right away and want to commit later and save that changes for later .

Example:
AMB01384:GitPractice 245742$ git stash
Saved working directory and index state WIP on master: e953595 added info about Tags
AMB01384:GitPractice 245742$ git stash list

Apply stash:
To apply stash and drop the stash after changes are applied use the below command.
 git stash pop

(33) RollBack to Previous Commit:
git reset cedddd  --soft   (Soft reset just changes commit to where Head is pointing . Soft reset is less destructive)
git reset  --hard cedddf (Hard reset is most desctructive . It wipes out all changes and points to HEAD)

(34)git reflog
Shows all the different actions taken in the repository. Where as git log shows only commit info.

(35)git remote -v
Git responds if there is a remote Repository linked to local Repository

git remote add origin https://github.com/chandragithub2014/GitPractice_May25_2020.git


(36)Git Pull: To pull from Origin to the local branch
git pull origin master --allow-unrelated-histories
\nPull command will merge the changes from remote to local.
Fetch command will just get the changes from remote to local , but will not merge.
To merge we need to use Pull command.

(37)
Git Push : To push changes from local master branch to the Remote branch
git push -u origin master --tags
git push origin master 
Note: origin is  remote branch and master is local branch
 
(38) Git Clone
git clone https://github.com/chandragithub2014/GitPractice_May25_2020.git

To specify local folder name explicitly during  Git Clone :

git clone https://github.com/chandragithub2014/GitPractice_May25_2020.git  MyFolder

Note: By default Project/Files from Remote repository are cloned with default folder name as is in Remote Repository. To Explicitly specify local folder name , the above command to be executed.

(39) Setting Remote Repository URL when Repository name is changed.
     When a remote repository name is changed (Ex: ABC_Remote  to ABC_REMOTE_REPOSIT) then in order to have local REpository point to the renamed repository use the below command:
git remote set-url origin https://github.com/chandragithub2014/GitPractice_2020.git

(40) To get additional info about remote REpository:
git remote show origin

(41) To get information about specific commit : Use git show followed by commit message
git show 3791f7c26f9d7ae8faff291999fe9fee1a62d237

Changing Read me from Remote

Changing Read me from Feature Branch
