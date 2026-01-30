package P;
// functional interface
public class Test {

    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello Functional Interface");
        obj.show();
    }
}
