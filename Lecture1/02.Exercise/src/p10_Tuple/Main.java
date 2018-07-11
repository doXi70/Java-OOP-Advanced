package p10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] personInfo = reader.readLine().split("\\s+");
        String fullName = personInfo[0] + " " + personInfo[1];
        Tuple<String, String> firstTuple = new Tuple<>(fullName, personInfo[2]);
        System.out.println(firstTuple);

        String[] personBeers = reader.readLine().split("\\s+");
        Tuple<String, Integer> secondTuple = new Tuple<>(personBeers[0], Integer.parseInt(personBeers[1]));
        System.out.println(secondTuple);

        String[] integerAndDouble = reader.readLine().split("\\s+");
        Tuple<Integer, Double> thirdTuple =
                new Tuple<>(Integer.parseInt(integerAndDouble[0]), Double.parseDouble(integerAndDouble[1]));
        System.out.println(thirdTuple);
    }
}
