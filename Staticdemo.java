class Usestatic {
    static int a = 10;
    int b;

    static void mestatic() {
        System.out.println("a = " + a);
    }

    static {
        System.out.println("I am static block");
    }

    void menormal() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

public class Staticdemo {
    public static void main(String args[]) {
        Usestatic ob1 = new Usestatic();
        Usestatic.mestatic(); // a = 10
        ob1.menormal(); // a = 10 b = 0

        ob1.b = 30;
        Usestatic.a = 20;
        Usestatic.mestatic(); // a = 20
        ob1.menormal(); // a = 20 b = 30

    }

}
