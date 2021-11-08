class Rectangle1{
	int length;
	int breadth;
	Rectangle1(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void display() 
	{
	System.out.println("Length:" +length);
	System.out.println("Bredth:" +breadth);
			
	}
}

public class TestThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 obj1 = new Rectangle1(5,6);
		obj1.display();
			}
}
