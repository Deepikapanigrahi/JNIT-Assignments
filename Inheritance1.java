class vehicle{
		
			int NoofWheels;
			String color;
			String ModelName;
			String FuleType;
			
			void start(){
				System.out.println("Verhicle started fine..");
							}
			void brake(){
				
				System.out.println ("Brake works perfect");
							}
			
			void accelerate(){
				
				System.out.println("It is just perfect and smooth");
								
			}
}
class car extends vehicle{
	     int NoOfDoors;
	     int NoOfSeats;
	     	     }

class motorbike extends vehicle{
	String EngineType;
	
}

class van extends vehicle{
	
	Float loadcapacity;
	int SizeOfContainer;
	void loadVan()
	{
		
		System.out.println("Lot of stuff to be loaded, i am already tired!!");
	}
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj1 = new car(); // creating object for first child class
		obj1.NoofWheels = 4;
		obj1.color = "Blue";
		obj1.ModelName = "Honda CRV";
		obj1.FuleType = "Premium";
		obj1.NoOfDoors = 4;
		obj1.NoOfSeats = 7;
		obj1.start();
		obj1.brake();
		obj1.accelerate();
		System.out.println("Car color is :" +obj1.color);
		System.out.println("Car model is: " + obj1.ModelName);
			
		motorbike obj2 = new motorbike(); //creating object for second child class
		obj2.NoofWheels =2;
		obj2.color = "Gold";
		obj2.ModelName = "Dukati";
		obj2.FuleType = "Regular";
		
		System.out.println("Bike color is " +obj2.color);
		System.out.println("Bike Model is " +obj2.ModelName);
		System.out.println("Bike Fule type is " +obj2.FuleType);
		
		van obj3 = new van(); // creating object for third child class
		obj3.NoofWheels =2;
		obj3.color = "white";
		obj3.ModelName = "Audi";
		obj3.FuleType = "Diesel";
		obj3.loadcapacity = 100.8f;
		obj3.SizeOfContainer = 345;
				
		obj3.loadVan();
		System.out.println("Van color is " +obj3.color);
		System.out.println("Van Model is " +obj3.ModelName);
		System.out.println("Van Fule type is " +obj3.FuleType);
					
		
		
		

	}

}
