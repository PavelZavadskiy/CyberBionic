/*
 * Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
 * который должен принимать радиус и используя PI посчитать площадь круга. Создать класс Main,
 * где запустить данный метод.
 */
public class Main {
    public static void main(String[] args) {
        final double radius = 3;
        System.out.println(MyArea.areaOfCircle(radius));
    }
}