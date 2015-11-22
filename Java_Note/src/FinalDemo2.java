public class FinalDemo2{
	public static void main(String[] s){
		System.out.println("======Start FinalDemo2=========");
		add();
		add("s");
		
		System.out.println("======End FinalDemo2=========");
	}
	private final static void add(){
	System.out.println("add");
	}
	private final static void add(String s){
	System.out.println("add (String s)");
	}
	
}