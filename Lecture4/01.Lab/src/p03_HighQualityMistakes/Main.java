package p03_HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Class reflectionClass = Reflection.class;
        List<Field> declaredFields = Arrays.stream(reflectionClass.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .collect(Collectors.toList());

        for (Field declaredField : declaredFields) {
            if (!Modifier.isPrivate(declaredField.getModifiers())) {
                System.out.println(declaredField.getName() + " must be private!");
            }
        }

        List<Method> getters = Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(f -> f.getName().startsWith("get"))
                .collect(Collectors.toList());

        List<Method> setters = Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(f -> f.getName().startsWith("set"))
                .collect(Collectors.toList());

        Comparator<Method> byName = Comparator.comparing(Method::getName);
        getters.sort(byName);
        setters.sort(byName);

        for (Method declaredMethod : getters) {
            if (!Modifier.isPublic(declaredMethod.getModifiers())) {
                System.out.println(declaredMethod.getName() + " have to be public!");
            }
        }

        for (Method declaredMethod : setters) {
            if (!Modifier.isPrivate(declaredMethod.getModifiers())) {
                System.out.println(declaredMethod.getName() + " have to be private!");
            }
        }

    }
}
