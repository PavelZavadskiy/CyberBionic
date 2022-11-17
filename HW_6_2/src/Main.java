/*
* Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать целочисленное
* значение (возраст животного), и содержать перегруженный метод toString(), который должен возвращать название
* экземпляра и возраст животного.*/

public class Main {
    public enum Animals{
        Rex(8), Tom(3), Jerry(2), Toby;

        int age;

        Animals(int age){
            this.age = age;
        }

        Animals(){
        }

        @Override
        public String toString() {
            return String.format("%s (age: %d)", this.name(), this.age );
        }
    }

    public static void main(String[] args) {
        for(Animals elem: Animals.values())
            System.out.println(elem);
    }
}