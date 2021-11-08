import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the height:");
		int height=s.nextInt();
		System.out.println("Enter the age: ");
		int age=s.nextInt();
if (height>=43)
{
	if(age>=5)
		System.out.println("kid is eligible for the ride");
	else
		System.out.println("kid is not eligible for the ride");
}
else {
	System.out.println("Height must be greater than 43 inch");
}
	}

}
