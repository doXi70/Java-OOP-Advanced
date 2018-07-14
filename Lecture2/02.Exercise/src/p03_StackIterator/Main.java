package p03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<Integer> stack = new CustomStack<>();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] cmds = line.split(" ");
            switch (cmds[0]) {
                case "Push":
                    stack.push(Arrays.stream(line.split("( |, )"))
                            .skip(1)
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new));

                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (IllegalArgumentException iae) {
                        System.out.println("No elements");
                    }
                    break;
            }
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

    }
}
