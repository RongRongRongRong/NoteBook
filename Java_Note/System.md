#System
<pre>
System
exit(0);
getProperties();
loadLibrary(String);
</pre>

#Runtime
<code>Runtime
exit(0);
Runtime.getRuntime();
Runtime.addRuntimeHook(Thread); jvm关闭后执行
Runtime.getRuntime().exec(String);执行应用
availableProcessors();
freeMemory();
totalMemory();
gc();
maxMemory();
loadLibaray(String);
</code>
#thread
	new Thread(){
	run()
	};

	new Thread(new runnable(){
	run();
	);
	getName();
