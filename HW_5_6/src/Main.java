/*
* Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со школы.
* И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.
* */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List< String> teachers = new ArrayList<>();
        teachers.add("Vanda");
        teachers.add("IronMan");
        teachers.add("Antman");
        teachers.add("Wonder woman");

        System.out.printf("The best teacher: %d\n", teachers.indexOf("Wonder woman"));
        System.out.printf("Not the best teacher: %d\n", teachers.indexOf("Antman"));
    }
}