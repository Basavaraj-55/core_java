package P;

public class polymorMethodOverloading {
	 int add(int a, int b) {        // method 1
	        return a + b;
	    }

	    int add(int a, int b, int c) { // method 2
	        return a + b + c;
	    }

	    public static void main(String[] args) {
	        polymorMethodOverloading a = new  polymorMethodOverloading();
	        System.out.println(a.add(2, 3));
	        System.out.println(a.add(2, 3, 4));
	    }
	


		// TODO Auto-generated method stub

	}


