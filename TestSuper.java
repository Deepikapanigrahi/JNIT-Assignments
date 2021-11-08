class Rectangle2
{
	int length;
	int breadth;
	int x = 10;
	Rectangle2(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}	
class Cube extends Rectangle2
{
	int height;
	int x = 20;
	Cube(int l, int b, int h)
	{
		super(l,b);
		height = h;
	}
	
	void display() 
	{
	System.out.println(super.x);
	System.out.println(x);
	System.out.println(super.length);
	System.out.println(super.breadth);
	}
}


public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj1 = new Cube(6,7,8);
		obj1.display();
	}

}
