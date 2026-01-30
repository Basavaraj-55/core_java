package P1;

public class Parametercons {
	
	    int id;
	    String name;

	    // Parameterized Constructor
	    Parametercons(int i, String n) {
	        id = i;
	        name = n;
	    }

	    public static void main(String[] args) {
	        Parametercons s = new Parametercons(1, "Student");
	        System.out.println(s.id);
	        System.out.println(s.name);
	    }
	}

	


