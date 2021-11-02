package day01;

public class Actor {
    private String name;
    private int birthYear;

    public Actor(String name, int age) {
        this.name = name;
        this.birthYear = age;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
