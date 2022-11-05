/*
Создать класс Vehicle. В теле класса создайте поля: координаты и параметры средств
передвижения (цена, скорость, год выпуска). Создайте 3 производных класса Plane,
Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая
выводит на экран информацию о каждом средстве передвижения.
 */

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1000000.00, 600, 1999, 10000, 100);
        Ship ship = new Ship(1300000000, 90, 2016, 8760, "Royal Caribbean International");
        Car car = new Car(10000, 180, 2020);

        System.out.println("________ Plane __________");
        System.out.println(plane.toString());
        System.out.println("________ Ship ___________");
        System.out.println(ship.toString());
        System.out.println("_________ Car ___________");
        System.out.println(car.toString());
    }
}