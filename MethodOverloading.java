class Sample{
	
	int add(int a, int b ) {
		
		System.out.println("This is first method");
		return a+b;
					
	}
	
	int add(int a, int b, int c ) {
		
		System.out.println("This is second method");
		return a+b+c;
			}

		}


public class MethodOverloading {

	public static void main(String[] args) {
		Sample obj1 = new Sample();
		System.out.println ("sum of A and B is:" +obj1.add(5, 6));
		System.out.println ("sum of A, B and C is: " +obj1.add(6, 8, 9));
	}

}
