/*
 * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
 * В теле класса создать два поля, описывающие длины сторон double side1, double side2.
 * Создать два метода, вычисляющие площадь прямоугольника –
 * double areaCalculator (double side1, double side2) и
 * периметр прямоугольника – double perimeterCalculator (double side1, double side2).
 * Написать программу, которая принимает от пользователя длины двух сторон прямоугольника
 * и выводит на экран периметр и площадь.
 */

/*
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Не зовсім зрозумів навіщо робити поля в классі а потім передавати в ф-ціях підрахунку
 * площі та периметру передавати параметрами довжини сторін. Якщо ви не проти, то я зробив
 * перегрузку методів  areaCalculator та perimeterCalculator з параметрами, та зробив ці ф-ції
 * статичними
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double side1, side2;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first side:");
        side1 = sc.nextDouble();
        System.out.println("Enter second side:");
        side2 = sc.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);
        System.out.println("Area = " + rectangle.areaCalculator());
        System.out.println("Perimeter = " + rectangle.perimeterCalculator());

        System.out.println("_____________Static funcs_____________");
        System.out.println("Area = " + Rectangle.areaCalculator(side1, side2));
        System.out.println("Perimeter = " + Rectangle.perimeterCalculator(side1, side2));

        sc.close();
    }
}