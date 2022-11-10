/*
Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1.
*/
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        final int count = 10;
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < count; i++)
            list.add(i);
        for(int i: list)
            System.out.print(i + "; ");
        System.out.println(" ");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.set(iterator.next() + 1);
        }
        for(int i: list)
            System.out.print(i + "; ");
    }
}