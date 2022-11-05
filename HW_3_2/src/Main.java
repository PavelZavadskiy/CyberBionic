/*
Создать класс, представляющий учебный класс ClassRoom. Создайте класс ученик Pupil.
В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового
класса Pupil и переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из
4 учеников. Предусмотрите возможность того, что пользователь может передать 2 или 3
аргумента. Выведите информацию о том, как все ученики экземпляра класса ClassRoom
умеют учиться, читать, писать, отдыхать.
 */

/*Трохи розширив ф-ціонал, для цікавості. Зараз можна додавати будь яку кількість
* учнів в конструктор (2, 3, 4 .. 10 ..), він зроблений через VarArgs. В середені
* классу ClassRoom додан ArrayList.
* */

public class Main {
    public static void main(String[] args) {
        ExcelentPupil pupil1 = new ExcelentPupil();
        GoodPupil pupil2 = new GoodPupil();
        BadPupil pupil3 = new BadPupil();
        ExcelentPupil pupil4 = new ExcelentPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        classRoom.showCRInfo();
    }
}