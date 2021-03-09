class Usestatic {

    static int a = 5;
    int b;

    void modify() {
        a++;
    }

    void printdata() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}

class demo {

    public static void main(String args[]) {

        Usestatic obj1 = new Usestatic();
        Usestatic obj2 = new Usestatic();
        obj1.b = 10;
        obj2.b = 15;
        obj1.modify();
        obj1.printdata();
        obj2.printdata();
        Usestatic.a = 56;
        obj1.printdata();
        obj2.printdata();
    }
}
