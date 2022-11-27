import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private Boolean isTail;

    public Animal(String name, int age, Boolean isTail) {
        this.name = name;
        this.age = age;
        this.isTail = isTail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(Boolean isTail) {
        this.isTail = isTail;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Boolean getTail() {
        return this.isTail;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, возраст: %d, хвост: %s", this.name, this.age, this.isTail?"Есть":"Нет");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    protected Animal clone() {
        return new Animal(this.name, this.age, this.isTail);
    }
}
