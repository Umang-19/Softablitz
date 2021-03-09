class Box1 {

    double width;
    double height;
    double depth;

    void printdata() {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Depth : " + depth);
    }

}

public class Boxdemo {
    public static void main(String args[]) {
        Box1 mybox = new Box1();
        Box1 mybox2 = new Box1();
        

        // System.out.println(mybox.width);
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        mybox2.width = 5;
        mybox2.height = 6;
        mybox2.depth = 8.5;

        double vol = mybox.width * mybox.height * mybox.depth;
        double vol2 = mybox2.width * mybox2.height * mybox2.depth;

        System.out.println("Volume of 1st object: " + vol);
        System.out.println("Volume of 2nd object: " + vol2);

        Box1 mybox3 = new Box1();
        mybox3.printdata();

        // int x;
        // System.out.println(x); // Error! variable x might not have been initialized
    }
}
