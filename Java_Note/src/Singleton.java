public class Singleton{
public static void main(String[] arg){
	System.out.println("========= Start Singleton===========");
	Person p1=Person.getInstance();
	Person p2=Person.getInstance();
	
	System.out.println(p1==p2);
	System.out.println("========= End Singleton===========");
	}
	
} 
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