package P;

public class Polymethodoverriding {
	 void show() {
	        System.out.println("A class");
	    }
	}

	class poly extends  Polymethodoverriding {

	    @Override
	    void show() {
	        System.out.println("B class");
	    }

	    public static void main(String[] args) {
	    	 Polymethodoverriding obj = new poly();   // polymorphism
	        obj.show();
	    }
	}