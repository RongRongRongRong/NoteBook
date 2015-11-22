# JVM_Note
---
###Tips

**Oracle HotSpot**  
*共有设计，私有实现 不同的虚拟机相同的效果*  

>![images](./screenshot/68.png)

**虚拟机运行时数据区** 

- java堆
- java虚拟机栈
- 本地方法栈
- 方法区
- 程序计数器  

>![images ](./screenshot/1.png)

###栈
*java虚拟机栈特征*  

- 线程私有
- 后进先出（LIFO）
- 存储栈帧
- out of memory error/stack overflow error

*java虚拟机本地方法栈特征*  

- 线程私有
- 后进先出（LIFO）
- 存储栈帧
- out of memory error/stack overflow error
- 有些虚拟机将虚拟机栈和本地方法栈合并实现

>![images](./screenshot/2.png)
*局部变量*  
>![images](./screenshot/3.png)
*操作数栈*  
>![images](./screenshot/69.png)
*演示*  
>![images](./screenshot/g1.gif)

>![images](./screenshot/70.png)

*栈异常*  

- 栈容量深度

>![images](./screenshot/71.png)

- OOM异常

>![images](./screenshot/72.png)

###堆

*堆特征*  
>![](./screenshot/74.png)
*堆与栈的关联*    
>![images](./screenshot/76.png)

*java堆内存溢出*  
>![images](./screenshot/77.png)

*方法区*  
>![images](./screenshot/78.png)
*运行时常量池*  
>![images](./screenshot/79.png)

*直接内存*    
>![images](./screenshot/80.png)
