package p06_StrategyPattern;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (this.name.compareTo(other.name) != 0) {
            return this.name.compareTo(other.name);
        } else {
            return this.age - other.age;
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAge();
    }
}
