class ATM{
	void withdraw() {
		System.out.println("withdraw money");
			}
	void deposit() {
		System.out.println("depositmoney");
	}
}

class debitcard extends ATM{
	void withdraw() {
		System.out.println("withdraw money 1000");
	}
	void deposit() {
		System.out.println("deposit money 3000");
	}
}

class creditcard extends ATM{
	void withdraw() {
	System.out.println("withdraw money  200");
}
void deposit() {
	System.out.println("deposit money 5000");
}
}
public class Methodoverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ATM obj=new ATM();
obj.deposit();
obj.withdraw();
obj=new debitcard();
obj.deposit();
obj.withdraw();
obj=new creditcard();
obj.deposit();
obj.withdraw();
	}

}
