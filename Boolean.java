
public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a=10,b=20,c=0;
boolean x=true;

x=a>b && (c=a+b)>15;// in case of AND operator.. if first condition fails. it doesnt even check further conditions
System.out.println("x= "+ x +", and c= "+c);
x=a>b || (c=a+b)>15;//  in case of OR operator.. if first condition fails. it keeps checking other conditions.
System.out.println("x= "+ x +", and c= " +c);

	}

}
