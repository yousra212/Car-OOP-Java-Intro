public class DealerShip {

    private final Car[] cars;


    public DealerShip(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void sell(int index) {
        this.cars[index].drive();
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";
            String carDescription = this.cars[i].toString();   // This is the same as saying: cars[i].getMake() + "\n" + cars[i].getYear() + "\n" + cars[i].getColor() + "\n";
            temp += carDescription + "\n";
        }
        return temp;
    }

}
