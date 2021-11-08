abstract class shape{
	abstract void perimeter();
	abstract void area();
}
class circle extends shape{
	double r=4;//r=radius
void perimeter() {
	double p=3.14*r*2;
	System.out.println("perimeter of circle is"+p);
}

void area() {
	double a=3.14*r*r;
	System.out.println("area of circle is"+a);

}
}

class rectangle extends shape{
	int l=2;
	int w=10;
void perimeter() {
	int p=2*(l+w);
	System.out.println("perimeter of rectangle is"+p);
}

void area() {
	int a=l*w;
	System.out.println("area of rectangle is"+a);

}


}
public class Abstract {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
shape s=new circle();
s.area();
s.perimeter();
 s=new rectangle();
 s.area();
 s.perimeter();

	}

}

