package p09_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<TraficLights> lights = Arrays.stream(reader.readLine().split(" "))
                .map(x -> Enum.valueOf(TraficLights.class, x))
                .collect(Collectors.toList());

        StateMachine traficLights = new StateMachine(lights);
        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            traficLights.changeLights();
            traficLights.printLights();
            System.out.println();
        }
    }
}
