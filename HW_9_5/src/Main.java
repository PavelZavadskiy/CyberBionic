/*
* Создайте класс MyClass, содержащий статический фабричный метод - T factoryMethod(), который будет порождать
* экземпляры типа, указанного в качестве параметра типа (указателя места заполнения типом – Т).*/

public class Main {
    public static void main(String[] args) throws Exception {
        String i = "Hello world";
        try {
            String j = MyClass.factoryMethod(i);
            System.out.printf("returned class: %s\n", j.getClass());
        } catch (ClassCastException ex){
            System.out.printf(ex.getMessage());
        }
    }
}