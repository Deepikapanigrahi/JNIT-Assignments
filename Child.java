class Parent{
	int age = 72;
	String ParentName = "Deepika";
	
}



public class Child extends Parent{
         String child_name="ani";
         void display() {
        	 System.out.println("Childname="+child_name);
         }
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1= new Child();
		System.out.println ("Patient name is " +obj1.ParentName);
		System.out.println ("Patient age is " +obj1.age);	
	}

}

	

