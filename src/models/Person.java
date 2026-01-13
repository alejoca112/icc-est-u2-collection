package models;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "[Nombre: " + name + " Edad: " + age + " ]";
    }

    @Override
    public int compareTo(Person o) {
        int comName = this.name.compareTo(o.name);
        if(comName != 0){
            return comName;
        }
        int comAge = Integer.compare(this.age, o.age);
        return comAge;
    }
}
