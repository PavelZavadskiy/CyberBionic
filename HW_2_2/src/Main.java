/*
 * Создать класс Машина с полями год(int), цвет(String).
 * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
 * Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */
public class Main {
    public static void main(String[] args) {
        final int YEAR = 2015;
        final String COLOR = "Black";

        Car car1 = new Car();
        Car car2 = new Car(YEAR);
        Car car3 = new Car(YEAR, COLOR);
    }
}