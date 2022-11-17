/*
* Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное
* значение (стоимость автомобиля), содержать метод getColor(), который возвращает строку с цветом автомобиля,
* и содержать перегруженный метод toString(), который должен возвращать строку с названием экземпляра, цветом
* и стоимостью автомобиля
* */
public class Main {
    public enum Vehicles{
        LandCruiser("Black", 30000), Rav4("Silver", 20000), Tundra("White", 40000);
        String color;
        int price;

        Vehicles(String color, int price) {
            this.color = color;
            this.price = price;
        }

        Vehicles() {
        }

        public String getColor(){
            return this.color;
        }

        @Override
        public String toString() {
            return String.format("%s (Color: %s; Price: %d)", this.name(), this.color, this.price);
        }
    }
    public static void main(String[] args) {
        for(Vehicles elem: Vehicles.values()) {
            System.out.println(elem);
            System.out.println(elem.getColor());
        }
    }
}