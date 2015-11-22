#jar

*command*

	jar cf test.jar test 生成jar
	jar cvf test.jar test 带生成过程
	jar cvfM test.jar test 生成没有清单的jar
	jar tf test.jar 查看文件目录结构
	jar tvf test.jar 查看详细信息的文件目录节后
	jar xf test.jar 解压缩文件
	jar xvf test.jar

	用法: jar {ctxui}[vfmn0Me] [jar-file] [manifest-file] [entry-point] [-C dir] files ...
	选项:
	    -c  创建新档案
	    -t  列出档案目录
	    -x  从档案中提取指定的 (或所有) 文件
	    -u  更新现有档案
	    -v  在标准输出中生成详细输出
	    -f  指定档案文件名
	    -m  包含指定清单文件中的清单信息
	    -n  创建新档案后执行 Pack200 规范化
	    -e  为绑定到可执行 jar 文件的独立应用程序
	        指定应用程序入口点
	    -0  仅存储; 不使用任何 ZIP 压缩
	    -M  不创建条目的清单文件
	    -i  为指定的 jar 文件生成索引信息
	    -C  更改为指定的目录并包含以下文件
	如果任何文件为目录, 则对其进行递归处理。
	清单文件名, 档案文件名和入口点名称的指定顺序
	与 'm', 'f' 和 'e' 标记的指定顺序相同。
	
	示例 1: 将两个类文件归档到一个名为 classes.jar 的档案中:
	       jar cvf classes.jar Foo.class Bar.class
	示例 2: 使用现有的清单文件 'mymanifest' 并
	           将 foo/ 目录中的所有文件归档到 'classes.jar' 中:
	       jar cvfm classes.jar mymanifest -C foo/ .
		
*java运行参数*

	public static void main(String[] args)
	public 给外部JVM调用
	static 类方法
	void JVM返回值没有意义
	args 命令行参数值 java test shi wo
*Scanner*

	Scanner sc=new Scanner(System.in);
	or new Sanner(new File("test.java"));
*BufferedReader*

	while((line=br.readLine())!=null)


	