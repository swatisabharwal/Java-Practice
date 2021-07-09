package javaConcepts;

	public class Parent {
		  public String value ="Parent";
		  
		  public String getvalue(){
		  return value;
		  }
		 }
		  class Child extends Parent{
		 public String value ="child";
		  
		  public String getvalue(){
		  return value;
		 }
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent child = new Child();
		System.out.println(child.value +"&"+ child.getvalue());
	}

}
