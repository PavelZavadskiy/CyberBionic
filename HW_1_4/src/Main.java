/*
 * Создать класс Computer, создать массив объектов Computers размером 5.
 * Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop).
 */

/*
 * Вкажіть, будь ласка, якщо не вірно зрозумів завдання.
 */
public class Main {
    public static void main(String[] args) {
        final int count = 5;
        Computer[] computers = new Computer[count];
        for(int i = 0; i < count; i++) {
            computers[i] = new Computer();
        }
    }
}