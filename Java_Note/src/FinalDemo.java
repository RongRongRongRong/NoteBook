public class FinalDemo{
public static void main(String[] arg){
	System.out.println("========= Start FinalDemo===========");
	Person p=new Person();
	System.out.println(p.init);
	System.out.println(p.str);
	System.out.println(p.ch);

	System.out.println("========= End FinalDemo===========");
	}
}
class Person{
	final String str;
	//final int isInt;
	 // final String isStr;
	 // final String isStr;
	final int init;
	public Person(){
		str="getString";
		ch='A';
		init=4;
	}
	
}