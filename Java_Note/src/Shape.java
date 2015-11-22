 public abstract class Shape{
	 private String color;
	 public abstract String getType();
	 public abstract double calcPerimeter();
	 public Shape(){
		 
	 }
	  public Shape(String color){
		 this.color=color;
	 }
	 public String getColor(){
		 return color;
	 }
 }