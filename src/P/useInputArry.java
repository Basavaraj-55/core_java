package P;
import java.util.Scanner;
public class useInputArry {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] a = new int[5];

	        System.out.println("Enter 5 numbers:");

	        for(int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();   // user input
	        }

	        System.out.println("Array elements are:");

	        for(int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	    }
	
		// TODO Auto-generated method stub

	}


