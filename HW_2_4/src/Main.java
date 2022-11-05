/*
 *  Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
 *  Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
 *  Перегрузить конструкторы вызывая конструктор из конструктора. Создать класс Main,
 *  в котором создать экземляры класса Машина с разными параметрами.
 */
public class Main {
    public static void main(String[] args) {
        final int YEAR = 2015;
        final double SPEED = 250;
        final int WEIGHT = 1400;
        final String COLOR = "Black";

        Car car1 = new Car();
        car1.Show();
        Car car2 = new Car(YEAR);
        car2.Show();
        Car car3 = new Car(YEAR, SPEED);
        car3.Show();
        Car car4 = new Car(YEAR, SPEED, WEIGHT);
        car4.Show();
        Car car5 = new Car(YEAR, SPEED, WEIGHT, COLOR);
        car5.Show();;
    }
}