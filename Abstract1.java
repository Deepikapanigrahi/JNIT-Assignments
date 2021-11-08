import java.util.*;

abstract class Mc_Donald{
	abstract void prepationOfItem();
	void billing() {}
	
	abstract void offer();
		
}
class MyMcDonald extends Mc_Donald{
	
	Scanner obj1 = new Scanner(System.in); //creating a scanner object
	
	void prepationOfItem() {
		System.out.println("Use only boneless chicken for all type of burgers");
		System.out.println("Dont serve to custmoe if is not warm");
		
		
	}
	 void billing(int Discounts) {
		
		int BurgerPrice = 3;
		int NuggetPrice = 1;
		
		System.out.println("Enter no of chicken burger");
        int NoOfBUrgers = obj1.nextInt();  // Read user input
        
        System.out.println("Enter piece of nuggets:");
        int NoOfNuggets = obj1.nextInt();
        
        int TotalPrice = (NoOfBUrgers*BurgerPrice) + (NoOfNuggets*NuggetPrice);
        float PriceDeduction = (float)(Discounts*TotalPrice)/100f;
        float PriceAfterDiscount = (float)TotalPrice-PriceDeduction;
        System.out.println("Total bill:" +TotalPrice);
        System.out.println("Total bill after discount:" +PriceAfterDiscount);
        
                                
		}
	void offer() {
		System.out.println("Enter discount percentage:");
	     int Discounts = obj1.nextInt();
	     System.out.println("Customer would get discount " +Discounts+ "%");
	     billing(Discounts);
	}
	
		
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mc_Donald MD = new MyMcDonald();
		MD.prepationOfItem();
		MD.offer();
		MD.billing();
		
	}

}
