class A {
    int a ;
    void show() {
        System.out.println("A's class show , a = " + a);
    }
}

class B extends A {
    int k;

    @Override 
    void show() {
        // super.show();
        System.out.println("B's class show , k = " + k);
    }
}
public class MethodOverriding {
    public static void main(String args[]) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.show();
        ob2.show();
        A ob3 = new B(); //Dynamic Method Dispatch
        ob3.show(); // Will call B's show
    }
}
