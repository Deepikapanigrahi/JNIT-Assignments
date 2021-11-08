import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float english,maths,physics,chemistry,biology,hindi,telugu;
		double total,avg;
		Scanner sub=new Scanner(System.in);
		System.out.println("Below are the marks of all subjects:");
		System.out.println("Enter marks of english ");
		english=sub.nextFloat();
		System.out.println("Enter marks of maths ");
		maths=sub.nextFloat();
		System.out.println("Enter marks of physics ");
		physics=sub.nextFloat();
		System.out.println("Enter marks of chemistry ");
		chemistry=sub.nextFloat();
		System.out.println("Enter marks of biology ");
		biology=sub.nextFloat();
		System.out.println("Enter marks of hindi ");
		hindi=sub.nextFloat();
		System.out.println("Enter marks of telugu ");
		telugu=sub.nextFloat();
		
		
	total=(english+maths+physics+chemistry+biology+hindi+telugu);
	System.out.println("Total mark is : "+total);
	avg=(total/7);
	System.out.println("Average is: "+avg);
	
if(avg>=75)
	System.out.println("Grade A");
else if(avg >=60 && avg<75 ) {
System.out.println("Grade B ");}
else if(avg>=50 && avg<60) {
	System.out.println("Grade C ");}
else {
	System.out.println("Fail ");}
}
		
		

	}


