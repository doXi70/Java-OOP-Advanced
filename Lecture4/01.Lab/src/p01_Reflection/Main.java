package p01_Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // Get the class, its possible to take it with
        // Class clazz = p01_Reflection.Reflection.class - if we know that this class exists.
        Class reflectionClass = Class.forName("p01_Reflection.Reflection");
        System.out.println(reflectionClass);

        // Gets the parent class
        Class superClass = reflectionClass.getSuperclass();
        System.out.println(superClass);

        // getInterfaces() gets the declared interfaces. It returns Class[]
        // because interfaces are classes.
        for (Class declaredInterface : reflectionClass.getInterfaces()) {
            System.out.println(declaredInterface);
        }


        // Making instance of this class by getting the Constructors and calling newInstance()
        Reflection object =
                (Reflection) reflectionClass.getDeclaredConstructors()[2].newInstance();

        System.out.println(object);
    }
}
