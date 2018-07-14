package p06_StrategyPattern;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person person, Person other) {
        if (person.getName().length() - other.getName().length() != 0) {
            return person.getName().length() - other.getName().length();
        } else {
            return person.getName().toLowerCase().charAt(0) - other.getName().toLowerCase().charAt(0) ;
        }
    }
}
