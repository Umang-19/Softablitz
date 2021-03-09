class Box {
    double width;
    double height;
    double depth;

    // Mandatory if you want to make subclass of this class
    Box() {
        System.out.println("I am default constructor");
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(double w, double h, double d) {
        System.out.println("I am Parameterised of Box class");
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class Boxweight extends Box {
    double weight;

    // Box() constructor will be called
    // Boxweight(double w , double h , double d , double m) {
    // System.out.println("I am Parameterised of Boxweight class");
    // width = w;
    // height = h;
    // depth = d;
    // weight = m;
    // }

    Boxweight(double w, double h, double d, double m) {
        super(w, h, d);
        System.out.println("I am Parameterised of Boxweight class");
        weight = m;
    }
}

public class Inheritancedemo {
    public static void main(String args[]) {
        Boxweight ob1 = new Boxweight(10, 20, 30, 40);
        System.out.println("Volume : " + ob1.volume());
    }
}
