package P;
// Accessible Only in Same Class
public class PrivateExample { 
	private int a = 10;

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println(obj.a);   // allowed

	}

}
