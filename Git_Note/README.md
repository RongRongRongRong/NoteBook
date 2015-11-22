# GitCommand
---
###First Tips
      1.git init  
      2.git commit -m"commit content" -a 
      3.git remote add origin https://github.com/yourID/repoName.git  
      4.git pull origin master  
      5.git push -u origin master 
 
 
###Second Tips
      1.mkdir learngit
      2.cd learngit
      3.pwd
      4.git add file2.txt file3.txt
      5.git commit -m "add 3 files."
      6.git diff  顾名思义就是查看difference

###Thrid Tips
      1.git log --pretty=oneline
      2.git reset --hard HEAD^
      3.cat readme.txt
      4.git rm test.txt
      5.git checkout -b dev  Switched to a new branch 'dev'
      6.git branch dev
      7.git checkout dev  Switched to branch 'dev'
      8.git branch
        * dev
          master
        查看分支：git branch  
        创建分支：git branch <name>  
        切换分支：git checkout <name>  
        创建+切换分支：git checkout -b <name>  
        合并某分支到当前分支：git merge <name>  
        删除分支：git branch -d <name> 
        
###Forth Tips  
      1.git branch
      	dev
        master
      2.git checkout master
      	Switched to branch 'master'
      3.git tag v1.0
      4.git tag 可以用命令git tag查看所有标签：
      	v1.0
*Commom Bash*

	cd
	cd ..上级目录
	cd -上次使用的目录
	ls 目录下文件
	alias cls=clear
	clear	
#####Git鼓励大量使用分支：但是，并不是一定要把本地分支往远程推送，那么，哪些分支需要推送，哪些不需要呢？  
        master分支是主分支，因此要时刻与远程同步；  
        dev分支是开发分支，团队所有成员都需要在上面工作，所以也需要与远程同步；  
        bug分支只用于在本地修复bug，就没必要推到远程了；  
        feature分支是否推到远程，取决于你是否和你的小伙伴合作在上面开发。  
#####多人协作的工作模式通常是这样：  
        首先，可以试图用git push origin branch-name推送自己的修改；  
        如果推送失败，则因为远程分支比你的本地更新，需要先用git pull试图合并；  
        如果合并有冲突，则解决冲突，并在本地提交；  
        没有冲突或者解决掉冲突后，再用git push origin branch-name推送就能成功！ 
        如果git pull提示“no tracking information”，则说明本地分支和远程分支的链接关系没有创建，用命令git branch--set-upstream branch-name origin/branch-name。
        
[LinkTo](http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/00137602359178794d966923e5c4134bc8bf98dfb03aea3000)
