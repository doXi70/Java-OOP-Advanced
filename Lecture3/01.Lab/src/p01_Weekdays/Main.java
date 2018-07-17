package p01_Weekdays;

/*
   Enums:
    - Set's of objects
    - Not repeatable constants - Enums
    - They are close to classes
    - Every one of them is like object, can have methods.

*/

/*
   Annotations:
   - Meta information ( information about the information)
   - They are something middle like comments and code, they are not
     part of the code but they are not comments because they can be accessed
     by reflection.
*/

public class Main {
    public static void main(String[] args) {
        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Friday", "Test");
        wc.addEntry("Monday", "Note");
        wc.addEntry("Sunday", "Meg notes");

        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        schedule.forEach(System.out::println);
    }
}
