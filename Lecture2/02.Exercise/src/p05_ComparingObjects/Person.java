package p05_ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
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

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {

        if (this.name.compareTo(other.name) != 0) {
            return this.name.compareTo(other.name);
        } else if (this.age - other.age != 0) {
            return this.age - other.age;
        }

        return this.town.compareTo(other.town);
    }
}
