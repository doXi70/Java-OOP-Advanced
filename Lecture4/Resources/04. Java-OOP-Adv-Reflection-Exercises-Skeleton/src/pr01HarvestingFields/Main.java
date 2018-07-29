package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class clazz = RichSoilLand.class;

        List<Field> privateMethods = new ArrayList<>();
        List<Field> protectedMethods = new ArrayList<>();
        List<Field> publicMethods = new ArrayList<>();

        for (Field m : clazz.getDeclaredFields()) {
            if (Modifier.isPrivate(m.getModifiers())) {
                privateMethods.add(m);
            } else if (Modifier.isPublic(m.getModifiers())) {
                publicMethods.add(m);
            } else if (Modifier.isProtected(m.getModifiers())) {
                protectedMethods.add(m);
            }
        }

        StringBuilder sb = new StringBuilder();

        String line;
        while (!"HARVEST".equals(line = reader.readLine())) {
            switch (line) {
                case "private":
                    privateMethods.forEach(x -> sb.append(String.format("private %s %s", x.getType().getSimpleName(), x.getName()))
                            .append(System.lineSeparator()));
                    break;
                case "protected":
                    protectedMethods.forEach(x -> sb.append(String.format("protected %s %s", x.getType().getSimpleName(), x.getName()))
                            .append(System.lineSeparator()));
                    break;
                case "public":
                    publicMethods.forEach(x -> sb.append(String.format("public %s %s", x.getType().getSimpleName(), x.getName()))
                            .append(System.lineSeparator()));
                    break;
                case "all":
                    for (Field x : clazz.getDeclaredFields()) {
                        String fieldAcessorType = Modifier.isPrivate(x.getModifiers()) ? "private"
                                : Modifier.isPublic(x.getModifiers()) ? "public" : "protected";


                        sb.append(String.format("%s %s %s", fieldAcessorType, x.getType().getSimpleName(), x.getName()))
                                .append(System.lineSeparator());
                    }
            }
        }

        System.out.println(sb);
    }
}
