import java.util.Arrays;

public class Car {    // This is a class called Car.

    private String make;    // This is a field of the Car class.
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {   // This is a constructor that takes 4 parameters.
        this.make = make;     // this. allows us to refer to the field of the class instead of the parameter.
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
    }

    public Car (Car source) {   // This is a constructor that takes 4 parameters.
        this.make = source.make;     // this. allows us to refer to the field of the class instead of the parameter.
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts;
    }


    public String getMake() {   // This is a method that returns the make of the car.
        return make;
    }

    public void setMake(String make) {   // This is a method that sets the make of the car.
        this.make = make;
    }

    public void setPrice(double price) {  // This is a method that sets the price of the car.
        this.price = price;
    }

    public double getPrice() {  // This is a method that returns the price of the car.
        return price;
    }

    public int getYear() {  // This is a method that returns the year of the car.
        return year;
    }

    public void setYear(int year) {  // This is a method that sets the year of the car.
        this.year = year;
    }

    public String getColor() {  // This is a method that returns the color of the car.
        return color;
    }

    public void setColor(String color) {  // This is a method that sets the color of the car.
        this.color = color;
    }

    public String[] getParts() {  // This is a method that returns the parts of the car.
        return this.parts;
    }
    public void setParts(String[] parts) {  // This is a method that sets the parts of the car.
        this.parts = parts;
    }

    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.make + " " + this.color + " for " + this.price +".\n");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    public String toString() {
        return "Make: " + this.make + "\n"
                + "Price: " + this.price + "\n"
                + "Year: " + this.year + "\n"
                + "Color: " + this.color + "\n"
                + "Parts: " + Arrays.toString(this.parts) + "\n";
    }

}
