abstract class Figure {
    double a, b;

    Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract void area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    void area() {
        System.out.println("Area of rectangle = " + a * b);
    }
}

public class AbstractDemo {
    public static void main(String args[]) {
        // Figure f = new Figure(); // Wrong
        Rectangle r = new Rectangle(10, 20);
        r.area();

        Figure f;
        f = r;
        f.area();
    }
}
