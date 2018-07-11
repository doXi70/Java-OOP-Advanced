package p11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] personInfo = reader.readLine().split("\\s+");
        String fullName = personInfo[0] + " " + personInfo[1];
        Threeuple<String, String, String> firstTuple = new Threeuple<>(fullName, personInfo[2], personInfo[3]);
        System.out.println(firstTuple);

        String[] personBeers = reader.readLine().split("\\s+");
        boolean isDrunk = personBeers[2].equals("drunk");
        Threeuple<String, Integer, Boolean> secondTuple =
                new Threeuple<>(personBeers[0], Integer.parseInt(personBeers[1]), isDrunk);
        System.out.println(secondTuple);

        String[] integerAndDouble = reader.readLine().split("\\s+");
        Threeuple<String, Double, String> thirdTuple =
                new Threeuple<>(integerAndDouble[0], Double.parseDouble(integerAndDouble[1]), integerAndDouble[2]);
        System.out.println(thirdTuple);
    }
}
