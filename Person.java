class Test1{
	String exam_name="CAT";
	public void display() {
		System.out.println("Person inherits Test1");
		
	
	}
}

public class Person extends Test1 {//child class
	String name="Sam";
public void display1() {
	System.out.println("CAT belongs to Test1");

}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person asd = new Person();
 asd.display();
 asd.display1();
	System.out.println("exam name is "+asd.exam_name);
 	System.out.println("Personname is"+asd.name);
    
          
	}

}
