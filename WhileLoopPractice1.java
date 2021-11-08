import java.util.*;

public class WhileLoopPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Monthly Salary:");
		int Salary = sc.nextInt();
		while(Salary>65000)
		{
			System.out.println("Your salary is as per market value.. be happy and stay healthy");
			System.out.println("Enter next person's  Salary");
			Salary = sc.nextInt();
			
		}
	}

}
