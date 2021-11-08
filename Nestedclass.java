class fb{
	
	void surf() {
	System.out.println("watch videos,photo");
	entertainment e=new entertainment();
	e.play();
	
	}
	
	
	class entertainment{
		void play() {
			System.out.println("Play candycrush");
			
		}
	}
}

public class Nestedclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fb f=new fb();
f.surf();

	}

}
