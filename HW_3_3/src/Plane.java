public class Plane extends Vehicle{
    private int height;
    private int passengersNumber;

    public Plane(double price, int speed, int yearOfProduction, int height, int passengersNumber){
        super(price, speed, yearOfProduction);
        this.height = height;
        this.passengersNumber = passengersNumber;
    }

    @Override
    public String toString(){
        return super.toString()
                +String.format("Flight height: %d\nNumber Of Passengers: %d\n", this.height, this.passengersNumber);
    }
}
