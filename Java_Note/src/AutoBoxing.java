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
	
