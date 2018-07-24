package p02_GettersAndSetters;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class reflectionClass = Reflection.class;
        Method[] declaredMethods = reflectionClass.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();
        List<Method> setters = new ArrayList<>();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")) {
                getters.add(declaredMethod);
            }

            if (declaredMethod.getName().startsWith("set")) {
                setters.add(declaredMethod);
            }
        }

        Comparator<Method> byName = Comparator.comparing(Method::getName);

        getters.sort(byName);
        setters.sort(byName);

        for (Method getter : getters) {
            System.out.println(String.format("%s will return %s",
                    getter.getName(), getter.getReturnType()));
        }

        for (Method setter : setters) {
            System.out.print(String.format("%s and will set field of ",
                    setter.getName()));

            for (Parameter parameter : setter.getParameters()) {
                System.out.println(parameter.getType());
            }
        }
    }
}
