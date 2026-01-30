package P1;

public class Cons {

	
		int id;
	    String name;

	    // Constructor
	    Cons() {
	        id = 1;
	        name = "Student";
	    }

	    void show() {
	        System.out.println(id);
	        System.out.println(name);
	    }

	    public static void main(String[] args) {
	        Cons s = new Cons();   // constructor called
	        s.show();
	    }
	
		// TODO Auto-generated method stub

	}


