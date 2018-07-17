package p01_Weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        return String.valueOf(super.name().charAt(0)) + super.name().substring(1).toLowerCase();
    }
}
