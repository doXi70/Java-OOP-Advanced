package pr02PrivateClassFiddling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Main {

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException, InstantiationException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class clazz = pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt.class;

        Field deffault_value = clazz.getDeclaredField("DEFFAULT_VALUE");
        deffault_value.setAccessible(true);
        int defalt_value = (int) deffault_value.get(null);

        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        Constructor instance = clazz.getDeclaredConstructors()[0];
        instance.setAccessible(true);

        pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt newInstance =
                (pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt) instance.newInstance(defalt_value);


        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("_");

            String cmd = tokens[0];
            int num = Integer.parseInt(tokens[1]);

            Method declaredMethod = clazz.getDeclaredMethod(cmd);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(num);
        }


    }
}
