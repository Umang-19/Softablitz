class Box {

    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Constructor Called !");
        width = 10;
        height = 10;
        depth = 3;
    }
    void calculate_volume() {

        System.out.println("Volume : " + width * height * depth);
    }

    double calculate_area() {
        return (2 * (width * height + height * depth + depth * width));
    }

    void setdim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void printdata()
    {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Depth : " + depth);
    }
}

public class Boxdemo2 {
    public static void main(String args[]) {
        Box mybox = new Box();
        Box mybox2 = new Box();

        // System.out.println(mybox.width);
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        mybox2.width = 5;
        mybox2.height = 6;
        mybox2.depth = 8.5;

        mybox.calculate_volume();
        mybox2.calculate_volume();

        System.out.println("Area : " + mybox.calculate_area());
        System.out.println("Area : " + mybox2.calculate_area());

        Box mybox3 = new Box();
        mybox3.setdim(2, 4, 6);
        mybox3.calculate_volume();
        System.out.println("Area : " + mybox3.calculate_area());


        Box mybox4 = new Box();
        mybox4.printdata();

    }
}
