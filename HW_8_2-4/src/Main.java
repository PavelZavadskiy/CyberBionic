/*
* Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
* 2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
* Добавить методы доступа. Конструктор.
*
* Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
* Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD Monitor: manufacturer =Samsung,
* price=120, serialNumber=AB1234567CD, X=1280,Y=1024
*
* Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
* Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
* */

/*
* Можливо я помиляюсь в данному завданні.
* В equals та hashCode я вирішив додати унікальні поля. В данному випадку :
* Device - manufacturer та serialNumber
* EthernetAdapter - Device + mac
* Monitor - Device
* Якщо ці поля співпадають то наші об'єкти рівні , Такі поля як ціна, роздільна здатність монітора чи швідкість не
* є полями котрі формують сам девайс. При співпадінні manufacturer та serialNumber і так буде зрозуміло що монітори
* рівні чи адаптери (але в адаптарах мак виступає в ролі уникального серійномого номера вже в мережі).
* Руками не виписував ф-цыї, а сгенерив їх та трохт підправив.
* */

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println("monitor:");
        System.out.println(monitor);
        Monitor monitor1 = new Monitor("Samsung", 130, "AB1234567CD", 1280, 1024);
        System.out.println("monitor1:");
        System.out.println(monitor1);
        Monitor monitor2 = new Monitor("LG", 140, "LG1234567CD", 1280, 1024);
        System.out.println("monitor2:");
        System.out.println(monitor2);

        EthernetAdapter ethernetAdapter = new EthernetAdapter("Asus", 100, "AS122345", 100000, "C4-D5-D6-74-AE-F7");
        System.out.println("ethernetAdapter:");
        System.out.println(ethernetAdapter);
        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Asus", 100, "AS122345", 100000, "BB-D5-D6-74-AE-F7");
        System.out.println("ethernetAdapter1:");
        System.out.println(ethernetAdapter1);
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("D-LINK", 200, "DL122345", 100000, "EE-D5-D6-74-AE-F7");
        System.out.println("ethernetAdapter2:");
        System.out.println(ethernetAdapter2);

        System.out.println("_____________equals________________________");
        System.out.printf( "Should true: monitor.equals(monitor) = %b\n", monitor.equals(monitor) );
        System.out.printf( "Should true: monitor.equals(monitor1) = %b\n", monitor.equals(monitor1) );
        System.out.printf( "Should true: monitor1.equals(monitor) = %b\n", monitor1.equals(monitor) );
        System.out.printf( "Should false: monitor.equals(monitor2) = %b\n", monitor.equals(monitor2) );
        System.out.printf( "Should true: ethernetAdapter.equals(ethernetAdapter) = %b\n", ethernetAdapter.equals(ethernetAdapter) );
        System.out.printf( "Should false: ethernetAdapter.equals(ethernetAdapter1) = %b\n", ethernetAdapter.equals(ethernetAdapter1) );
        System.out.printf( "Should false: ethernetAdapter1.equals(ethernetAdapter2) = %b\n", ethernetAdapter1.equals(ethernetAdapter2) );

        System.out.println("_____________hashCode________________________");
        System.out.printf( "Should true: monitor.hashCode() == monitor1.hashCode() == %b\n", monitor.hashCode() == monitor1.hashCode() );
        System.out.printf( "Should false: monitor.hashCode() == monitor2.hashCode() == %b\n", monitor.hashCode() == monitor2.hashCode() );
        System.out.printf( "Should false: ethernetAdapter.hashCode() == ethernetAdapter1.hashCode() == %b\n", ethernetAdapter.hashCode() == ethernetAdapter1.hashCode() );
        System.out.printf( "Should false: ethernetAdapter1.hashCode() == ethernetAdapter2.hashCode() == %b\n", ethernetAdapter1.hashCode() == ethernetAdapter2.hashCode() );
    }
}