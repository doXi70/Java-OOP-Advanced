package p05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split(" ");
            people.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
        }

        int index = Integer.parseInt(reader.readLine());

        if (index < 0 || index >= people.size()) {
            System.out.println("No matches");
            return;
        }

        Person personToCompare = people.get(index);
        long equalPeopleCount = people.stream()
                .filter(p -> p.compareTo(personToCompare) == 0)
                .count();

        if (equalPeopleCount != 0) {
            System.out.printf("%d %d %d", equalPeopleCount,
                    people.size() - equalPeopleCount,
                    people.size());
        } else {
            System.out.println("No matches");
        }

    }
}
