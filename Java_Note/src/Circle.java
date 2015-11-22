 public class Circle extends Shape{
	 private String type="circle";
	  public  String getType(){
		 return type;
	 }
	 public  double calcPerimeter(){
		 return 3.14*2*10;
	 }
	 public Circle(String color){
		 super(color);
	 }
	 
 }