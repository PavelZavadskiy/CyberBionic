/*
Создайте класс Printer. В теле класса создайте метод void print(String value), который выводит на экран
значение аргумента. Реализуйте возможность того, чтобы в случае наследования от данного класса других
классов, и вызове соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами. Обязательно используйте приведение типов.
 */

public class Main {
    public static void main(String[] args) {
        final int count = 10;
        Printer printer = new Printer();
        printer.print("Hello world printer");

        PrinterChild printerCh = new PrinterChild();
        printerCh.print("Hello world printerchild");


        for(int i = 0; i<count; i++) {
            Printer printer1 = new Printer();
            printer1.print("Hello world printer");
        }

        for(int i = 0; i<count; i++) {
            Printer printer2 = new PrinterChild();
            printer2.print("Hello world printerchild");
        }
    }
}