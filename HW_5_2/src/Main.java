/*
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
Вывести список в консоль.
 */
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Zoo.Statuses status;
        status = zoo.add(0, "Cat");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 0, "Cat", status.toString());
        status = zoo.add(1, "Dog");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 1, "Dog", status.toString());
        status = zoo.add(2, "Mouse");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 2, "Mouse", status.toString());
        status = zoo.add(3, "Puma");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 3, "Puma", status.toString());
        status = zoo.add(4, "Mosquito");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 4, "Mosquito", status.toString());
        status = zoo.add(5, "Croc");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 5, "Croc", status.toString());
        status = zoo.add(5, "T-Rex");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 5, "T-Rex", status.toString());
        status = zoo.add(6, "T-Rex");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 6, "T-Rex", status.toString());
        status = zoo.add(7, "Shark");
        System.out.printf("Index: %d, Animal: %s, Status: %s\n", 7, "Shark", status.toString());

        System.out.println(zoo);
    }
}