
package abstractexample;

public class Executor {
	public static void main(String[] args) {
		Coder c1; // creating reference for base class
		
		c1=new Student(); //creating obj for derived class and calling its method
		c1.rules();
		
		c1=new Trainer();
		c1.rules();
	}

}
