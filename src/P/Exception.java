package P;

public class Exception {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;   // error
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }

        System.out.println("Program continues");
    }
}
