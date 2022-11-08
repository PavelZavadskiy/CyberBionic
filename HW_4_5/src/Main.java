/*
Напишите класс ConverterTemperature для конвертации из градусов по Цельсию в Кельвины, Фаренгейты.
У класса должен быть метод convert, который и делает конвертацию.
 */
public class Main {
    public static void main(String[] args) {
        final float tempC = 19F;
        System.out.printf("%f(C) = %f(K)\n", tempC, ConverterTemperature.CelsiusToKelvin(tempC));
        System.out.printf("%f(C) = %f(F)\n", tempC, ConverterTemperature.CelsiusToFahrenheit(tempC));
    }
}