package p03_GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("a", "c");
        Scale<Integer> integerScale = new Scale<>(1, 2);

        System.out.println(stringScale.getHeavier());
        System.out.println(integerScale.getHeavier());
    }
}
