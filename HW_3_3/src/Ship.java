public class Ship extends Vehicle{
    private int passengersNumber;
    private String homePort;

    public Ship(double price, int speed, int yearOfProduction, int passengersNumber, String homePort){
        super(price, speed, yearOfProduction);
        this.passengersNumber = passengersNumber;
        this.homePort = homePort;
    }

    @Override
    public String toString(){
        return super.toString()
                +String.format("Number Of Passengers: %d\nHomePort: %s\n", this.passengersNumber, this.homePort);
    }
}
