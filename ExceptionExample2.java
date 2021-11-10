
public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String npe = null;
		
		try 
		{
			if (npe.equals("Deepa"))
			System.out.println("same");
			else
			System.out.println("Not the same");
		
		}
		
		catch (NullPointerException e)
		{
			System.out.println("ooopppsss Got exceeption");
		}
	}

}
