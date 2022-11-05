public class Vehicle {
    protected double price;
    protected int speed;
    protected int yearOfProduction;

    public Vehicle(double price, int speed, int yearOfProduction) {
        this.price = price;
        this.speed = speed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString(){
        return String.format("Price: %f\nSpeed: %d\nYear:%d\n", this.price, this.speed, this.yearOfProduction);
    }
}
