/**
 * Создать класс Animal с именем String, возрастом int, хвостом Boolean. В классе переопределить метод toString,
 * что бы вывод был сдедующим «Имя: Васька, возраст: 45, хвост: нет». В классе Animal переопределить методы
 * equals & hashCode.
 */

public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Animal("Васька", 3, true);
        Animal animal02 = new Animal("Барсик", 4, true);
        System.out.println(animal01);
        System.out.println(animal02);
        System.out.println("Васька жил на улице и у него отпал хвост, на него завели новую карточку\nно он все равно остался Васькой но без хвоста.");
        Animal animal03;
        animal03 = (Animal) animal01.clone();
        animal03.setTail(false);
        System.out.println(animal03);
        System.out.printf("Should true: animal01.equals(animal03) == %b\n", animal01.equals(animal03));
        System.out.printf("Should false: animal01.equals(animal02) == %b\n", animal01.equals(animal02));
        System.out.printf("Should true: animal01.hashCode() == animal03.hashCode() == %b\n", animal01.hashCode() == animal03.hashCode());
        System.out.printf("Should false: animal02.hashCode() == animal03.hashCode() == %b\n", animal02.hashCode() == animal03.hashCode());
    }
}