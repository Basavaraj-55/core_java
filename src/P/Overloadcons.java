package P;

public class Overloadcons {

	    // Default constructor
	    Overloadcons() {
	        System.out.println("Default constructor");
	    }

	    // Parameterized constructor
	    Overloadcons(int a) {
	        System.out.println("Value of a: " + a);
	    }

	    public static void main(String[] args) {
	        Overloadcons obj1 = new Overloadcons();     // calls default constructor
	        Overloadcons obj2 = new Overloadcons(10);   // calls parameterized constructor
	    }
	

		

	}


