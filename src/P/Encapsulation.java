package P;

public class Encapsulation {
	 private int id;
	    private String name;

	    // setter method (set values)
	    public void setData(int i, String n) {
	        id = i;
	        name = n;
	    }

	    // getter method (get values)
	    public void showData() {
	        System.out.println(id);
	        System.out.println(name);
	    }

	    public static void main(String[] args) {
	    	Encapsulation s = new Encapsulation();
	        s.setData(1, "Student");
	        s.showData();
	  }
	
	}


