package animal;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tale;

    public Animal() {
    }

    public Animal(String name, int age, boolean tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }

    @Override
    public String toString() {
        String taleString = "ні";
        if (tale)  taleString = "так";
        return "Ім'я: " + name +
                ", вік: " + age +
                ", хвіст: " + taleString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tale == animal.tale && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tale);
    }
}
