package sample;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetWeather {
    static List<String> weatherInfo;
    static String hi;
    static String lo;
    static String finalLabel;
    static String conditions;
    static String currentTemp;
    static String currentIcon;
    static String weatherKey;
    static String weatherKeyNormal;
    static ArrayList<String[]> weatherArray = new ArrayList<>();

    public static void main(String[] args) {
        finalLabel = "";
        conditions = "";
        currentTemp = "";
        currentIcon = "";
        currentIcon = "";
        weatherKeyNormal = "";

        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;
        StringBuilder openMapData = new StringBuilder();
        StringBuilder darkSkyData = new StringBuilder();
        weatherArray.add(new String[4]);
        weatherArray.add(new String[4]);
        weatherArray.add(new String[4]);
        weatherArray.add(new String[4]);
        weatherArray.add(new String[4]);

        weatherInfo = new ArrayList<>(5);

        try {
            Scanner scanner = new Scanner(new File("/Users/conorbrandon/IntelliJProjects/CSE260Project/src/sample/settings.txt"));
            weatherKey = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            weatherKey = "Stony Brook, NY";
        }
        weatherKeyNormal = weatherKey;
        weatherKey = weatherKey.replaceAll(" ", "+");
        weatherKey = weatherKey.replaceAll(",", "");
        System.out.println("Weather Key " + weatherKey);


        try {
            url = new URL("https://api.opencagedata.com/geocode/v1/json?q=" + weatherKey + "&key=c51fdc9966ee4d7b9d89fa36930b87f9");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                openMapData.append(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {

            }
        }

        System.out.println(openMapData.toString());

        String stringOpen = openMapData.substring(500);
        String lat = "";
        String lng = "";
        int i;
        for (i = 0; i < stringOpen.length(); i++) {
            if(stringOpen.substring(i, i+3).matches("lat")) {
                lat = stringOpen.substring(i+4, i+11);
                break;
            }
        }
        for (int j = i; j < stringOpen.length(); j++) {
            if(stringOpen.substring(j, j+3).matches("lng")) {
                lng = stringOpen.substring(j+5, j+13);
                break;
            }
        }
        System.out.println(lat + " " + lng);
        //System.out.println(stringOpen);


        try {
            url = new URL("https://api.darksky.net/forecast/6c797ea6875b9c3a968ced03f6085e2d/" + lat + "," + lng );
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                darkSkyData.append(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {

            }
        }

        String currentDay = darkSkyData.substring(0, 400);
        //System.out.println(currentDay);
        for (i = 0; i < currentDay.length()-11; i++) {
            if(currentDay.substring(i, i+7).matches("summary")) {
                //System.out.println("t");
                int n = i + 10;
                while(currentDay.charAt(n) != '"') {
                    conditions += currentDay.charAt(n);
                    n++;
                }
            }
            if(currentDay.substring(i, i+4).matches("icon")) {
                int n = i + 7;
                while(currentDay.charAt(n) != '"') {
                    currentIcon += currentDay.charAt(n);
                    n++;
                }
            }
            if(currentDay.substring(i, i+11).matches("temperature")) {
                int n = i + 13;
                while(currentDay.charAt(n) != ',') {
                    currentTemp += currentDay.charAt(n);
                    n++;
                }
            }
        }
        finalLabel = "";
        finalLabel = conditions + " " + currentTemp;
        System.out.println("Final Label: " + finalLabel);

        String stringDark = darkSkyData.toString();
        int j;
        for (j = 0; j < stringDark.length()-5; j++) {
            if(stringDark.substring(j, j+5).matches("daily")) {
                break;
            }
        }
        stringDark = stringDark.substring(j);
        int k;
        for (k = 0; k < stringDark.length()-1; k++) {
            if(stringDark.substring(k, k+1).matches("\\[")) {
                break;
            }
        }
        //System.out.println(k);
        stringDark = stringDark.substring(k+1);
        //System.out.println(stringDark);

        String[] days1 = stringDark.split("\\{");
        ArrayList<String> days = new ArrayList<>(Arrays.asList(days1));
        days.remove(0);
        //System.out.println(days.toString());
        //System.out.println();
        for (int l = 0; l < 5; l++) {
            StringBuilder summary = new StringBuilder();
            StringBuilder icon = new StringBuilder();
            StringBuilder tempHigh = new StringBuilder();
            StringBuilder tempLo = new StringBuilder();

            String string = days.get(l);
            String[] array = weatherArray.get(l);
            for (int m = 0; m < string.length()-15; m++) {
                if(string.substring(m, m+7).matches("summary")) {
                    int n = m + 10;
                    while(string.charAt(n) != '.') {
                        summary.append(string.charAt(n));
                        n++;
                    }
                }
                if(string.substring(m, m+16).matches("temperatureHigh\"")) {
                    int n = m + 17;
                    while(string.charAt(n) != '.') {
                        tempHigh.append(string.charAt(n));
                        n++;
                    }
                }
                if(string.substring(m, m+15).matches("temperatureLow\"")) {
                    int n = m + 16;
                    while(string.charAt(n) != '.') {
                        tempLo.append(string.charAt(n));
                        n++;
                    }
                }
                if(string.substring(m, m+4).matches("icon")) {
                    int n = m + 7;
                    while(string.charAt(n) != '"') {
                        icon.append(string.charAt(n));
                        n++;
                    }
                }
            }
            array[0] = summary.toString();
            array[1] = tempHigh.toString();
            array[2] = tempLo.toString();
            array[3] = icon.toString();
        }
        for (int l = 0; l < weatherArray.size(); l++) {
            String[] strings = weatherArray.get(l);
            System.out.println(Arrays.toString(strings));
        }
        for (int l = 0; l < 4; l++) {
            String[] array = weatherArray.get(l);
            StringBuilder string = new StringBuilder(15);
            string.append("High: " + array[1] + ", Low: " + array[2]
            + "; " + array[0]);
            weatherInfo.add(string.toString());
        }
    }
}
