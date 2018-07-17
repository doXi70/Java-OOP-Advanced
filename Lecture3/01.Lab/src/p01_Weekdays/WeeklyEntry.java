package p01_Weekdays;

public class WeeklyEntry {

    private Weekday weekDay;
    private String notes;

    public WeeklyEntry(String weekDay, String notes) {
        this.weekDay = Enum.valueOf(Weekday.class, weekDay.toUpperCase());
        this.notes = notes;
    }

    public Weekday getWeekDay() {
        return this.weekDay;
    }

    public String getNotes() {
        return this.notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",
                this.getWeekDay(), this.getNotes());
    }
}
