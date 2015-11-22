# Sqlite3
---

###CMD
***commom***

	cls
	ipconfig
	ping
	exit
	


***common file command***  

	tree /f > 1.TXT  
	rem 象DIR命令一样,不过每个下级目录文件也列出  
	dir /S > 2.txt  
	dir /d > 3.txt
	cd 
	cd..
	edit 1.txt   
	Del：删除文件   
	Copy：复制文件  
	Xcopy：复制文件夹  
	Md：创建文件夹  
	rd：删除文件夹
	ren：重命名文件(夹)  
	move：移动文件(夹)  
	find：字符串查找  
	findstr：字符串查找增强，可以进行模式匹配搜索  

***more***

	mem.exe--------显示内存使用情况 
	notepad--------打开记事本
	taskmgr--------任务管理器 
	regedit	
	tsshutdn-------60秒倒计时关机命令 
	path
	set

###sqlite3

	sqlite3 test.db
	sqlite> create table mytable(id integer primary key, value text);
	sqlite> insert into mytable(id, value) values(2, 'Jenny');
	sqlite> insert into mytable(value) values('Francis');
	update table1 set name="madara" where id=1;


	显示表结构：
	sqlite> .schema [table]
	获取所有表和视图：
	sqlite > .tables
	
	获取指定表的索引列表：
	sqlite > .indices [table ]

	导出数据库到 SQL 文件：
	sqlite > .output [filename ]
	sqlite > .dump
	sqlite > .output stdout
	
	delete  from tablename where <条件>

	drop table tablename
	update tablename set 字段=值 如果需要条件的话、添加上where语句
	select *from tablename 可跟随where语句
	
	.show