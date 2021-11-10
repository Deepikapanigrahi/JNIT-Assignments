
public class ExcptionExampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
	      try 
	      {
	         
	         a = 0;
	         b =  100/a;
	         System.out.println(b);
	         
	      }
	      catch (ArithmeticException e)
	      { 
	       System.out.println("Divide a number by zero is not correct");
	      }
	      catch (Exception e) 
	      {
	           System.out.println("Exception occurred");
	      }
	      System.out.println("Testnig if this is executed after exception is handlled");
		
	}

}
