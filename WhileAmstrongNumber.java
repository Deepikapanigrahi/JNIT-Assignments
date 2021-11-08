
public class WhileAmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=678,Q=n,sum=0,r=0;
		while(Q>0)
		{
			r=Q%10;
			sum = sum+(r*r*r);
			Q=Q/10;
								
		}
		System.out.println("The sum is " +sum);
		if (sum ==n) {
			System.out.println("This is a Armstrong number..yeee");
		}
			else { 
			System.out.println("Not a Armstrong number..try another number");
		}
			
	}

}
