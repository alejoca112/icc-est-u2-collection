package models;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int id; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Nombre: " + name + " Edad: " + age + " ID: " + id + " ]";
    }

    @Override
    public int compareTo(Person o) {
        int comName = this.name.compareTo(o.name);
        if (comName != 0) {
            return comName;
        }
        int comAge = Integer.compare(this.age, o.age);
        return comAge;
    }
}