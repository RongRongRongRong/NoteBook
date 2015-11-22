# Java_Note
###面向对象###
***静态初始化***

- 先初始化父类再子类
- 类内部依顺序初始化
```java
public class StaticInit{  
	static{  
		a=6;
	}
	static int a=9;
	public static void main(String[] args){
		System.out.println(a);
	}
}
```

***包装类***  
 
- 基本类型包装类  
   

```java
public class Primitive2Wrapper{
	public static void main(String[] arg){
		boolean b=false;
		int a=3;
		Boolean isB=new Boolean(b);
		Integer isInt=new Integer(a);
		Float isFlo=new Float("4.56");
		System.out.println("===============");
		System.out.println(isB);
		System.out.println(isInt);
		System.out.println(isFlo);
		System.out.println("===============");
		
		boolean b1=isB.booleanValue();
		int a1=isInt.intValue();
		float f1=isFlo.floatValue(); 
		System.out.println("===============");
		System.out.println(b1);
		System.out.println(a1);
		System.out.println(f1);
		System.out.println("===============");
	}
}
```

- 自动装箱拆箱
```java
public class AutoBoxing{
	public static void main(String[] arg){
		
		System.out.println("========= AutoBoxing===========");
		Integer i=5;
		int a=i;
		boolean b=false;
		Object obj=true;
		Boolean isB=b;
		if(obj instanceof Boolean){
			obj=b;	
		System.out.println((Boolean)obj);
		}
		if(isB instanceof Boolean){
			System.out.println((boolean)isB);
			}
		System.out.println(a);
		
		System.out.println("=========Primitive AutoBoxing===========");
		String strInt="123";
		String strFloat="1.23";
		String strBoolean="true";
		int int1=Integer.parseInt(strInt);
		float float1=Float.parseFloat(strFloat);
		boolean boolean1=Boolean.parseBoolean(strBoolean);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(boolean1);
		String sInt=String.valueOf(int1);
		String sFloat=String.valueOf(float1);
		String sBoolean=String.valueOf(boolean1);
		System.out.println("=========String AutoBoxing===========");
		System.out.println(sInt);
		System.out.println(sFloat);
		System.out.println(sBoolean);
		
	}
	
}
```

*tips*

>![image](/ScreenShots/81.png)  
>short a=10;  
>char chr='A';  

```java
public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&obj.getClass()==Person.class){
			if(((Person)obj).getId().equals(this.getId())){
			return true;
				
			}
		}
			return false;
	}
```

>![image](/ScreenShots/82.png) 


*Singleton*

```java
class Person{
	private Person(){}
	private static Person instance ;
	public static Person getInstance(){
		if(instance==null){
			instance=new Person();
		}
		return instance;
	}
}
```

*[final](/Markdown/Interface.md)*

- final成员变量必须初始化
- final方法不能重写可以重载
- final类不能被继承

*abstract*

- 抽象类模板模式 Shape--->Circle Rectangle
- 父类定义抽象方法 子类实现

*interface*
- 定义规范，接口是让规范和实现分离
- 接口是松耦合设计，面向接口编程，自上而下
- 包含field常量，抽象方法，内部类（内部接口、枚举）
- 不能包含初始化块、构造器、变量、非抽象方法
- 抽象方法不能有static修饰符
- 默认public abstract修饰成员
- field是有public static final修饰


