package basicsOf.Equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int number;

    public Person(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
        Person pr = (Person) obj;
        return pr.name.equals(name)&&
                pr.age == age &&
           pr.number == number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,number);
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';

    }
}

