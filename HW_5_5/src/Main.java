/*Используя Intelij IDEA создать класс Friends. С помощью методов ArrayList добавить в массив имена друзей.
Вывести список друзей, после вывести список друзей отсортировав в алфавитном порядке.
 */
public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        friends.add("Peter");
        friends.add("Alexandr");
        friends.add("John");
        friends.add("Anna");

        System.out.println(friends);
        friends.sort();
        System.out.println(friends);

    }
}