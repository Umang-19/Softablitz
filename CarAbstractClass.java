import java.util.Calendar;
import java.util.Date;

abstract class Car {

    // Instance Variables
    private String modelName;
    private int passengerCapacity;
    private double topSpeed;
    private Date manufacturingDate;

    // Constructor
    public Car(String modelName, int passengerCapacity, double topSpeed) {
        this.modelName = modelName;
        this.passengerCapacity = passengerCapacity;
        this.topSpeed = topSpeed;
        this.manufacturingDate = Calendar.getInstance().getTime();
    }

    // Abstract Methods
    public abstract void accelerate();

    public abstract void brake();

    public abstract String getDescription();


    // Accessor or Getter Methods
    public String getmodelName() {
        return this.modelName;
    }

    public int getpassengerCapacity() {
        return this.passengerCapacity;
    }

    public double gettopSpeed() {
        return this.topSpeed;
    }

    public Date getmanufacturingDate() {
        return this.manufacturingDate;
    }


    // Setter or Mutator Methods
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPassengerCapcity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

}

class TeslaCar extends Car {

    public TeslaCar(String modelName, int passengerCapacity, double topSpeed) {
        super(modelName, passengerCapacity, topSpeed);
    }

    @Override
    public void accelerate() {
        System.out.println("TeslaCar Acceleration Method");
    }

    public void brake() {
        System.out.println("TeslaCar Brake Method");
    }

    public String getDescription() {
        return "Tesla Car, Model Name: " + this.getmodelName() + ", Top Speed: " + this.gettopSpeed();
    }

}


class AudiCar extends Car {

    public AudiCar(String modelName, int passengerCapacity, double topSpeed) {
        super(modelName, passengerCapacity, topSpeed);
    }

    @Override
    public void accelerate() {
        System.out.println("AudiCar Acceleration Method");
    }

    public void brake() {
        System.out.println("AudiCar Brake Method");
    }

    public String getDescription() {
        return "Audi Car, Model Name: " + this.getmodelName() + ", Top Speed: " + this.gettopSpeed();
    }

}

public class CarAbstractClass {
    public static void main(String args[]) {
        Car[] showroom = new Car[3]; //Array of car references

 		showroom[0] = new TeslaCar("Model S", 4, 250.0);
 		showroom[1] = new AudiCar("Audi A3", 4, 240.0);
 		showroom[2] = new TeslaCar("Model X", 4,210.0);

 		for(Car c: showroom)
 			System.out.println(c.getDescription());
    }
}