class MethodOverloading {

    void func1() {
        System.out.println("I am void func1");
    }

    // void func1(int a) {
    //     System.out.println("I am func1 & I take 1 int parameter " + a);
    // }

    void func1(float a) {
        System.out.println("I am func1 & I take 1 float parameter " + a);
    }

    void func1(double a) {
        System.out.println("I am func1 & I take 1 double parameter " + a);
    }

}

class MethodOverloadingDemo {
    public static void main(String args[]) {
        MethodOverloading obj = new MethodOverloading();
        obj.func1();
        obj.func1(5); // Will call int if int isn't present then call float if float isn't present then call double 
        obj.func1(5.0f); // Will call float, if float isn't present then call double 
        obj.func1(5.0); // Will call double one
        
    }
}