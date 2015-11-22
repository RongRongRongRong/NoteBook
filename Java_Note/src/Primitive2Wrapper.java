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