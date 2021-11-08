
public class WhileFactorialAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1,fact=1;
		while(n<=5)
		{
			System.out.println(+n);
			fact = fact*n;
			n++;
			}
		System.out.println("Factorial is: " +fact);
	}

}
