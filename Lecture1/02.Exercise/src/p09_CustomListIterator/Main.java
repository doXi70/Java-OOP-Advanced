package p09_CustomListIterator;


import p09_CustomListIterator.customCollections.contracts.CustomList;
import p09_CustomListIterator.customCollections.impl.CustomListImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> list = new CustomListImpl<>();

        String line = reader.readLine();
        while (!"END".equals(line)) {
            String[] cmds = line.trim().split("\\s+");

            switch (cmds[0]) {
                case "Add":
                    list.add(cmds[1]);
                    break;
                case "Remove":
                    int num = Integer.parseInt(cmds[1]);
                    list.remove(num);
                    break;
                case "Contains":
                    System.out.println(list.contains(cmds[1]));
                    break;
                case "Swap":
                    int first = Integer.parseInt(cmds[1]);
                    int second = Integer.parseInt(cmds[2]);
                    list.swap(first, second);
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(cmds[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
            }

            line = reader.readLine();
        }

    }
}
