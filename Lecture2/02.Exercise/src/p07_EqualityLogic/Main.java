package p07_EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<Person> treeSet = new TreeSet<>();
        HashSet<Person> hashSet = new HashSet<>();

        int pplCount = Integer.parseInt(reader.readLine());
        while (pplCount-- > 0) {
            String[] tokens = reader.readLine().split(" ");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            treeSet.add(person);
            hashSet.add(person);
        }

        System.out.printf("%d%n%d", treeSet.size(), hashSet.size());

    }
}
