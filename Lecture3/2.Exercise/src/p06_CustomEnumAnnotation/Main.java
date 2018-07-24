package p06_CustomEnumAnnotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String type = reader.readLine();
        if (type.equals("Rank")) {
            printAnnotationInfo("Rank");
        } else {
            printAnnotationInfo("Suit");
        }
    }

    private static void printAnnotationInfo(String clazz) {
        Annotation annotation = null;

        if (clazz.equals("Rank")) {
            annotation = CardRank.class.getAnnotation(CustomAnnotation.class);
        } else {
            annotation = CardSuite.class.getAnnotation(CustomAnnotation.class);
        }

        System.out.println(String.format("Type = %s, Description = %s", ((CustomAnnotation) annotation).type(),
                ((CustomAnnotation) annotation).description()));
    }
}
