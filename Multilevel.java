class Card_details{
	int card_no;
	String expiry_date;
	int CVV;
	
	void show() {
	System.out.println("This is about card details");
}
}

class Credit_card{
		String Card_name;
		int Credit_limit;
	}
class Card_types{
		void show1() {
			System.out.println("This is a Platinum card");
		
		}
}
public class Multilevel{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card_details c=new Card_details();
		c.card_no=67788;
		System.out.println("Card number is "+c.card_no);
		c.CVV=889;
		System.out.println("cvv code is: " +c.CVV);
		c.expiry_date="9/01/2021";
		System.out.println("dt="+c.expiry_date);
		c.show();
		Card_types m=new Card_types();
		m.show1();
	}

}

	
