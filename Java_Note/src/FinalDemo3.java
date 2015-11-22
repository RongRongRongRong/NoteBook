 public class FinalDemo3{
	 private  Person person;
	 public FinalDemo3(Person person){
		 this.person=new Person(person.getName(),person.getId());
	 }
	 public Person getPerson(){
		 return new Person(person.getName(),person.getId());
	 }
	public static void main(String[] s){
		System.out.println("======Start FinalDemo3=========");
		// Person p1=new Person("gaga","123456");
		// Person p2=new Person("jaja","123456");
		// System.out.println(p1.getName());
		// System.out.println(p2.getName());
		
		Person p3=new Person("nogato","3456");
		FinalDemo3 f=new FinalDemo3(p3);
		System.out.println(f.getPerson().getName());
		p3.setName("other nogato");
		System.out.println(f.getPerson().getName());
		
		System.out.println("======End FinalDemo3=========");
	}
	
}

class Person{
	private  String name;
	private  String id;
	public Person(String name,String id){
		this.name=name;
		this.id=id;
	}	

	public String getName(){
		return name;
		
	}
	public void setName(String s){
		this.name=s;
	}
	public String getId(){
		return id;
		
	}
	public void setId(String id){
		
		this.id=id;
	}
}