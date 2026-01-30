package P;


//Parent class
class A {
 int x = 10;
}

//Child class
class B extends A {
 int y = 20;
}

//Grandchild class
public class MultilevelInheitance extends B {

 public static void main(String[] args) {
     MultilevelInheitance obj = new MultilevelInheitance();
     System.out.println(obj.x);  // from class A
     System.out.println(obj.y);  // from class B
 }


	}


