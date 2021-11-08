class Car{
	void start() {
		System.out.println("Starts with a key");
	}
}
class Audi extends Car{
	void AUDIfeatures() {
		System.out.println("Audi is a luxury car");
	}
}
class Ferrari extends Car{
	void Ferrarifeatures() {
		System.out.println("Its a Sport car");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Audi obj=new Audi();
obj.AUDIfeatures();
obj.start();
Ferrari f=new Ferrari();
f.Ferrarifeatures();
f.start();
	}

}
