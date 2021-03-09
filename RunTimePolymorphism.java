class Figure {
    double a, b;

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    void area() {
        System.out.println("Area for figure is not defined!");
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    void area() {
        System.out.println("Area for Rectangle is : " + a * b);
    }

}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    void area() {
        System.out.println("Area for Triangle is : " + 0.5 * a * b);
    }

}

public class RunTimePolymorphism {
    public static void main(String args[]) {

        Figure ob1 = new Figure(10, 20);
        ob1.area();

        Rectangle r = new Rectangle(2, 4);
        r.area();

        Triangle t = new Triangle(5, 7);
        t.area();

        Figure f;
        f = r;
        f.area(); // Will Call Rectangle area
    }
}
