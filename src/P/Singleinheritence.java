package P;

//Parent class
class Parent {
 int a = 10;
}

//Child class
public class Singleinheritence extends Parent {

 public static void main(String[] args) {
     Singleinheritence obj = new Singleinheritence();
     System.out.println(obj.a);   // accessing parent class variable
 }

	}


