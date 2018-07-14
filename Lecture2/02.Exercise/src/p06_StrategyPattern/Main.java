package p06_StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> firstPeople = new TreeSet<>(new PersonComparatorByName());
        TreeSet<Person> secondPeople = new TreeSet<>(new PersonComparatorByAge());

        int pplCounter = Integer.parseInt(reader.readLine());
        while (pplCounter-- > 0) {
            String[] tokens = reader.readLine().split(" ");
            firstPeople.add(new Person(tokens[0], Integer.parseInt(tokens[1])));
            secondPeople.add(new Person(tokens[0], Integer.parseInt(tokens[1])));
        }

        firstPeople.forEach(System.out::println);
        secondPeople.forEach(System.out::println);
    }
}
