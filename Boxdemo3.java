class Box3 {
    double width;
    double height;
    double depth;

    Box3(double w, double h, double d) {

        System.out.println("I'm Parameterised Constructor");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void printdata() {
        System.out.println("Width : " + this.width);
        System.out.println("Height : " + this.height);
        System.out.println("Depth : " + this.depth);
    }

}

public class Boxdemo3 {
    public static void main(String args[]) {
        Box3 mybox = new Box3(10, 20, 30);
        mybox.printdata();

    }
}