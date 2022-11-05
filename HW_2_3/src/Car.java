public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;


    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void Show() {
        System.out.printf("Car:\n Year: %d\n Speed: %f\n Weight: %d\n Color: %s\n",
                this.year,
                this.speed,
                this.weight,
                this.color);
    }
}
