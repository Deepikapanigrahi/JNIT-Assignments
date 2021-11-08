class carshowroom{
	void cost() {
		System.out.println("No cost");
		}
	
	void milage() {
		System.out.println("No Milage");
	}
}

class Honda extends carshowroom{
	void cost() {
		System.out.println("Cost is 50000 Dollars");
			}
	void milage() {
		System.out.println("Milage is 42 mph");
		
	}
}

class BMW extends carshowroom{
	void cost() {
		System.out.println("Cost is 32000 Dollars");
			}
	void milage() {
		System.out.println("Milage is 25 mph");
		
}

}
public class Methodoveridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carshowroom obj1 = new carshowroom();
			obj1.cost();
			obj1.milage();
			obj1= new Honda();
			obj1.cost();
			obj1.milage();
			obj1=new BMW();
			obj1.cost();
			obj1.milage();
		
	}


}
