class pharmacy{
	void OTC() {
		System.out.println("OTC Medicine");
			}
	void Prescribed() {
		System.out.println("Prescribed Medicine");
	}
}

class CVS extends pharmacy{
	void OTC() {
		System.out.println("OTC Medicine:Tylenol");
			}
	void Prescribed() {
		System.out.println("Prescribed Medicine:VitaminD");
}
}

class walgreens extends pharmacy{
	void OTC() {
		System.out.println("Pain Killer");
			}
	void Prescribed() {
		System.out.println("Iboprofen");
		}
}
public class overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pharmacy obj=new pharmacy();
obj.OTC();
obj.Prescribed();
obj=new CVS();
obj.OTC();
obj.Prescribed();
obj=new walgreens();
obj.OTC();
obj.Prescribed();

	}

}



