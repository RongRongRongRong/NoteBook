  public class AbstractDemo1 {
	
	 public AbstractDemo1(){
	 }
	public static void main(String[] s){
		System.out.println("======Start AbstractDemo1=========");
		Circle c=new Circle("Red");
		;
		System.out.println(c.getType());
		System.out.println(c.calcPerimeter());
		System.out.println(c.getColor());
		// System.out.println(((Shape)c).color);
		
		System.out.println("======End AbstractDemo1=========");
	}
  }