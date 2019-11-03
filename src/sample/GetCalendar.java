package sample;

import java.util.ArrayList;
import java.util.List;

public class GetCalendar {
    static List<String> calendarEvents;
    static String calendarKey;

    public static void main(String[] args) {
        calendarEvents = new ArrayList<>();
//        for (int i = 0; i < 7; i++) {
//            calendarEvents.add("Event " + i);
//        }
        calendarEvents.add("9:45 ->> Tour Bus Group: Admin 118");
        calendarEvents.add("1:00 ->> Get some exercise");
        calendarEvents.add("5:30 ->> AMS 310: Javits 102");
        calendarEvents.add("7:00 ->> CSE 260: Old Comp Sci 2120");
        calendarEvents.add("8:45 ->> Tennis Eboard Meeting");
    }
}
