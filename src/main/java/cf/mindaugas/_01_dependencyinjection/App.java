package cf.mindaugas._01_dependencyinjection;

public class App {
    public static void main(String[] args) {
        System.out.println(new Person(1, new FullName("Jonas", "Jonaitis")));
        Person p2 = new Person();
        p2.setFullName(new FullName("Petras", "Petraitis"));
        System.out.println(p2);
    }
}

class Person {
    private int id;
    private FullName fullName; // dependency --> Person depends on FullName
    // 0. No Dependency Injection -> class person creates it's own dependencies
    // private FullName fullName = new FullName("Jonas", "Jonaitis");

    // 1. Constructor Dependency Injection
    public Person(int id, FullName fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Person(){}

    // 2. Setter Dependency Injection
    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName=" + fullName +
                '}';
    }
}

class FullName {
    private String name;
    private String surname;
    public FullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}