/*
* В теле класса создайте четыре метода для арифметических действий: (add – сложение, sub – вычитание, mul – умножение,
* div – деление). Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать
* исключение. Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
* При возникновении ошибок должны выбрасываться исключения.
* */

import java.util.Scanner;

public class Main {
    static public float add(float a, float b) {return a + b;}
    static public float sub(float a, float b) {return a - b;}
    static public float mul(float a, float b) {return a * b;}
    static public float div(float a, float b) {
        if(a == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            float a, b;
            try {

                System.out.println("Enter number:");
                a = Float.parseFloat(sc.nextLine());
                System.out.println("Enter number:");
                b = Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e);
                break;
            }

            System.out.println("Enter operation:");
            char c = sc.nextLine().charAt(0);

            switch (c){
                case '+': System.out.println(add(a, b)); break;
                case '-': System.out.println(sub(a, b)); break;
                case '*': System.out.println(mul(a, b)); break;
                case '/':
                    try {
                        System.out.println(div(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                    break;
                default: System.out.println("Wrong operation!"); break;
            }
        }
    }
}