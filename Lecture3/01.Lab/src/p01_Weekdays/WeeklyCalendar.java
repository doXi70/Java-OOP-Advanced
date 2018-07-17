package p01_Weekdays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class WeeklyCalendar implements Iterable<WeeklyEntry> {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        return this.entries.stream()
                .sorted(Comparator.comparingInt(x -> x.getWeekDay().ordinal()))
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<WeeklyEntry> iterator() {
        return new WeeklyCalendarIterator();
    }

    private final class WeeklyCalendarIterator implements Iterator<WeeklyEntry> {
        private int index;

        public WeeklyCalendarIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < entries.size();
        }

        @Override
        public WeeklyEntry next() {
            return entries.get(index++);
        }
    }
}
