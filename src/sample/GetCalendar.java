package sample;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetCalendar {
    static List<String> calendarEvents;
    static List<String> calendarLinks;
    static String calendarKey;

    public static void main(String[] args) {
        calendarEvents = new ArrayList<>();
        calendarLinks = new ArrayList<>();
////        for (int i = 0; i < 7; i++) {
////            calendarEvents.add("Event " + i);
////        }
//        calendarEvents.add("9:45 ->> Tour Bus Group: Admin 118");
//        calendarEvents.add("1:00 ->> Get some exercise");
//        calendarEvents.add("5:30 ->> AMS 310: Javits 102");
//        calendarEvents.add("7:00 ->> CSE 260: Old Comp Sci 2120");
//        calendarEvents.add("8:45 ->> Tennis Eboard Meeting");
        String httpResponse = "{\n" +
                " \"kind\": \"calendar#events\",\n" +
                " \"etag\": \"\\\"p32k9hdf6s6dec0g\\\"\",\n" +
                " \"summary\": \"conor.brandon@stonybrook.edu\",\n" +
                " \"updated\": \"2019-12-04T00:44:17.193Z\",\n" +
                " \"timeZone\": \"America/New_York\",\n" +
                " \"accessRole\": \"owner\",\n" +
                " \"defaultReminders\": [\n" +
                "  {\n" +
                "   \"method\": \"popup\",\n" +
                "   \"minutes\": 10\n" +
                "  }\n" +
                " ],\n" +
                " \"nextSyncToken\": \"CKiYtebhmuYCEKiYtebhmuYCGAU=\",\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3141287841474000\\\"\",\n" +
                "   \"id\": \"_60s34ghh8d138b9o6sp36b9k70p32ba264s30ba38opj0h1h850jig9n8c\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzYwczM0Z2hoOGQxMzhiOW82c3AzNmI5azcwcDMyYmEyNjRzMzBiYTM4b3BqMGgxaDg1MGppZzluOGMgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-10-09T17:58:40.000Z\",\n" +
                "   \"updated\": \"2019-10-09T17:58:40.737Z\",\n" +
                "   \"summary\": \"Fellows Recognition\",\n" +
                "   \"location\": \"Tabler Center for Arts, Culture, and Humanities\\nTabler Dr, Stony Brook, NY  11790, United States\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-06T16:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-06T18:00:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"082B1CB4-8723-4821-B180-CF30D1AA9A7C\",\n" +
                "   \"sequence\": 0,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3149640689160000\\\"\",\n" +
                "   \"id\": \"_8ooj8d9j8h232ba66133ab9k84sk4ba165332b9p85136c9m6or4cdq66g\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=Xzhvb2o4ZDlqOGgyMzJiYTY2MTMzYWI5azg0c2s0YmExNjUzMzJiOXA4NTEzNmM5bTZvcjRjZHE2NmcgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-11-27T02:05:44.000Z\",\n" +
                "   \"updated\": \"2019-11-27T02:05:44.633Z\",\n" +
                "   \"summary\": \"Floor Meeting\",\n" +
                "   \"location\": \"End Hall Lounge\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-05T22:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-05T22:30:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"F1453DD1-F0F5-4A9B-A1F1-9AB31666F7F4\",\n" +
                "   \"sequence\": 0,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": false,\n" +
                "    \"overrides\": [\n" +
                "     {\n" +
                "      \"method\": \"popup\",\n" +
                "      \"minutes\": 120\n" +
                "     }\n" +
                "    ]\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3149766121930000\\\"\",\n" +
                "   \"id\": \"_68ojac246gqj8ba46cp3ib9k8ksk2b9o8kpkcb9j691j0g9j6oojge1j68\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzY4b2phYzI0NmdxajhiYTQ2Y3AzaWI5azhrc2syYjlvOGtwa2NiOWo2OTFqMGc5ajZvb2pnZTFqNjggY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-11-27T19:31:00.000Z\",\n" +
                "   \"updated\": \"2019-11-27T19:31:00.965Z\",\n" +
                "   \"summary\": \"Dentist\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-20T08:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-20T09:00:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"2150D454-D329-4E9A-8E3F-32C0A3618832\",\n" +
                "   \"sequence\": 0,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3149774677830000\\\"\",\n" +
                "   \"id\": \"_70pj6hhi6h13cba58osj4b9k8h1j2ba275248b9g7514cchj60pjica28g\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzcwcGo2aGhpNmgxM2NiYTU4b3NqNGI5azhoMWoyYmEyNzUyNDhiOWc3NTE0Y2NoajYwcGppY2EyOGcgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-11-27T20:42:18.000Z\",\n" +
                "   \"updated\": \"2019-11-27T20:42:18.915Z\",\n" +
                "   \"summary\": \"Save A Date for TG Luncheon - Please respond ASAP\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-13T13:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-13T15:30:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"833F24B6-EF92-4DC1-B9DD-09BF230391BD\",\n" +
                "   \"sequence\": 1,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3149781055710000\\\"\",\n" +
                "   \"id\": \"_6sp32g9g6sokaba16ko42b9k6d13gba26d248b9h8gp3egpg6h0jgci68g\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzZzcDMyZzlnNnNva2FiYTE2a280MmI5azZkMTNnYmEyNmQyNDhiOWg4Z3AzZWdwZzZoMGpnY2k2OGcgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-11-27T21:35:27.000Z\",\n" +
                "   \"updated\": \"2019-11-27T21:35:27.855Z\",\n" +
                "   \"summary\": \"ITS Expo\",\n" +
                "   \"location\": \"LDS Center\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-04T13:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-04T14:20:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"721A071E-A50A-43B8-B3DD-1D27C04A82FD\",\n" +
                "   \"sequence\": 1,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3150595209566000\\\"\",\n" +
                "   \"id\": \"_8ook4d1i6ook6ba68cq32b9k6h238ba28kp34ba28krk8e1n8csj4e9n8g\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=Xzhvb2s0ZDFpNm9vazZiYTY4Y3EzMmI5azZoMjM4YmEyOGtwMzRiYTI4a3JrOGUxbjhjc2o0ZTluOGcgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-12-02T14:40:00.000Z\",\n" +
                "   \"updated\": \"2019-12-02T14:40:04.783Z\",\n" +
                "   \"summary\": \"Tennis Eboard Meeting\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-04T20:30:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-04T21:30:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"F1B4261C-FC41-44D4-BE22-BE7D87C9297D\",\n" +
                "   \"sequence\": 1,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3150595280938000\\\"\",\n" +
                "   \"id\": \"_6h346c1n8kojib9i84s4cb9k68qk8b9o7523eba68coj0gi66d2j4cpi60\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzZoMzQ2YzFuOGtvamliOWk4NHM0Y2I5azY4cWs4YjlvNzUyM2ViYTY4Y29qMGdpNjZkMmo0Y3BpNjAgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-12-02T14:40:36.000Z\",\n" +
                "   \"updated\": \"2019-12-02T14:40:40.469Z\",\n" +
                "   \"summary\": \"Meeting Michelle \",\n" +
                "   \"description\": \"(518) 495-2777\\n\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-06T12:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-06T12:30:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"4FC07E19-2A8F-425D-89D7-FC10BF3E2320\",\n" +
                "   \"sequence\": 1,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3150830990962000\\\"\",\n" +
                "   \"id\": \"_8d244c9m6t2k4b9n6op32b9k891j4ba16gsjab9g8h0jeg9i60ok4d1n84\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzhkMjQ0YzltNnQyazRiOW42b3AzMmI5azg5MWo0YmExNmdzamFiOWc4aDBqZWc5aTYwb2s0ZDFuODRfMjAxOTEwMDlUMTkzMDAwWiBjb25vci5icmFuZG9uQHN0b255YnJvb2suZWR1\",\n" +
                "   \"created\": \"2019-10-03T05:58:14.000Z\",\n" +
                "   \"updated\": \"2019-12-03T23:24:55.481Z\",\n" +
                "   \"summary\": \"AMS 310 Office Hours\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-10-09T15:30:00-04:00\",\n" +
                "    \"timeZone\": \"America/New_York\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-10-09T16:15:00-04:00\",\n" +
                "    \"timeZone\": \"America/New_York\"\n" +
                "   },\n" +
                "   \"recurrence\": [\n" +
                "    \"EXDATE;TZID=America/New_York:20191030T153000,20191113T153000,20191127T153000,20191204T153000\",\n" +
                "    \"RRULE:FREQ=WEEKLY;COUNT=10\"\n" +
                "   ],\n" +
                "   \"iCalUID\": \"CDB167EB-7621-4BC2-A495-0DA7A201B47A\",\n" +
                "   \"sequence\": 0,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  },\n" +
                "  {\n" +
                "   \"kind\": \"calendar#event\",\n" +
                "   \"etag\": \"\\\"3150840514386000\\\"\",\n" +
                "   \"id\": \"_60p36h1n75348b9n8h23eb9k8cq3gba28opjab9p8kpk4c9i74rk2da270\",\n" +
                "   \"status\": \"confirmed\",\n" +
                "   \"htmlLink\": \"https://www.google.com/calendar/event?eid=XzYwcDM2aDFuNzUzNDhiOW44aDIzZWI5azhjcTNnYmEyOG9wamFiOXA4a3BrNGM5aTc0cmsyZGEyNzAgY29ub3IuYnJhbmRvbkBzdG9ueWJyb29rLmVkdQ\",\n" +
                "   \"created\": \"2019-12-04T00:44:17.000Z\",\n" +
                "   \"updated\": \"2019-12-04T00:44:17.193Z\",\n" +
                "   \"summary\": \"Health Sciences\",\n" +
                "   \"creator\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"organizer\": {\n" +
                "    \"email\": \"conor.brandon@stonybrook.edu\",\n" +
                "    \"self\": true\n" +
                "   },\n" +
                "   \"start\": {\n" +
                "    \"dateTime\": \"2019-12-03T20:00:00-05:00\"\n" +
                "   },\n" +
                "   \"end\": {\n" +
                "    \"dateTime\": \"2019-12-03T21:00:00-05:00\"\n" +
                "   },\n" +
                "   \"iCalUID\": \"023D79FD-7DD7-4C48-BF35-9E3B1297A5B8\",\n" +
                "   \"sequence\": 1,\n" +
                "   \"reminders\": {\n" +
                "    \"useDefault\": true\n" +
                "   }\n" +
                "  }\n" +
                " ]\n" +
                "}\n";
        String[] events = httpResponse.split("\"kind\"");
//        for (int i = 0; i < events.length; i++) {
//            System.out.println(events[i]);
//            System.out.println();
//        }
        ArrayList<String> data = new ArrayList<>(6);
        for (int i = 2; i < 7; i++) {
            data.add(events[i]);
        }
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
            System.out.println();
        }
        ArrayList<ArrayList<String>> results = new ArrayList();
        for (int i = 0; i < data.size(); i++) {
            results.add(new ArrayList<String>(4));
            ArrayList<String> arrayList = results.get(i);
            String current = data.get(i);
            for (int j = 0; j < current.length() - 10; j++) {
                if (current.substring(j, j + 10).matches("\"summary\":")) {
                    int k = j + 12;
                    StringBuilder href = new StringBuilder(40);
                    while (current.charAt(k) != '"') {
                        href.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(href.toString());
                }
                if (current.substring(j, j + 11).matches("\"htmlLink\":")) {
                    int k = j + 13;
                    StringBuilder href = new StringBuilder(40);
                    while (current.charAt(k) != '"') {
                        href.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(href.toString());
                }
                if (current.substring(j, j + 11).matches("\"location\":")) {
                    int k = j + 13;
                    StringBuilder href = new StringBuilder(40);
                    while (current.charAt(k) != '"') {
                        href.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(href.toString());
                }
                if (current.substring(j, j + 11).matches("\"dateTime\":")) {
                    int k = j + 13;
                    StringBuilder href = new StringBuilder(40);
                    while (current.charAt(k) != '"') {
                        href.append(current.charAt(k));
                        k++;
                    }
                    arrayList.add(href.toString());
                }
            }
        }
        CalendarEvent[] calendarEventz = new CalendarEvent[5];
        for (int i = 0; i < results.size(); i++) {
            ArrayList<String> current = results.get(i);
            if(current.size() == 4) current.add(2, "");
            System.out.println(current.toString());
            String link = current.get(0);
            String name = current.get(1);
            String location = current.get(2);
            if (location.length() > 50) location = location.substring(0, 50);
            String startTime = current.get(3);
            startTime = startTime.substring(11, 19);
            CalendarEvent calendarEvent = new CalendarEvent(name, location, startTime, link);
            calendarEventz[i] = calendarEvent;
        }
        Arrays.sort(calendarEventz);
        for (int i = 0; i < calendarEventz.length; i++) {
            System.out.println(calendarEventz[i].toString());
            CalendarEvent e = calendarEventz[i];
            String event = e.startTime + "  ->>  " + e.name;
            if(!e.location.equals("")) event += ":   " + e.location;
            calendarEvents.add(event);
            calendarLinks.add(calendarEventz[i].link);
        }
    }
}
class CalendarEvent implements Comparable {
    String name;
    String location;
    String startTime;
    Integer start;
    String link;

    public CalendarEvent(String name, String location, String startTime, String link) {
        this.name = name;
        this.location = location;
        this.startTime = startTime;
        this.link = link;
        int hours = Integer.parseInt(startTime.substring(0,2));
        int minutes = Integer.parseInt(startTime.substring(3, 5));
        this.start = hours + (60 * minutes);
    }

    @Override
    public int compareTo(Object o) {
        return this.start.compareTo(((CalendarEvent)o).start);
    }

    @Override
    public String toString() {
        return "CalendarEvent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", startTime='" + startTime + '\'' +
                ", start=" + start +
                ", link='" + link + '\'' +
                '}';
    }
}
