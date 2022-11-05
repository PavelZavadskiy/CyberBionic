public class Rectangle {
    private double side1;
    private double side2;

    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator () {
        return Rectangle.areaCalculator(this.side1, this.side2);
    }

    static double areaCalculator (double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator () {
        return Rectangle.perimeterCalculator(this.side1, this.side2);
    }

    static double perimeterCalculator (double side1, double side2) {
        return 2 * side1 + 2 * side2;
    }
}
