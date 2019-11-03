package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class GetNYTimesArticles {
    static TreeMap<String, String> extractedArticles = new TreeMap<>();
    static List<String> titlesList;
    static List<String> linksList;

    public static void main(String[] args) {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String[] titles;
        String[] links;


        try {
            url = new URL("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=r43T9KQVmo40HAPEjFdYyntubOQ3csAA");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line);
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

        System.out.println();
        String string = stringBuilder.toString();
        int firstBracketIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == '[') firstBracketIndex = i;
            break;
        }
        string = string.substring(firstBracketIndex + 1);
        titles = string.split("titl");
        links = string.split("\",\"ur");
        titlesList = new ArrayList<>(Arrays.asList(titles));
        linksList = new ArrayList<>(Arrays.asList(links));

        titlesList = titlesList.subList(1, 10);
        linksList =  linksList.subList(1, 10);


        for (int i = 0; i < titlesList.size(); i++) {
            String s = titlesList.get(i);
            String t = s.replaceAll("e\":\"", "");
            String u = t.replaceAll("\",\"ab.*", "");
            titlesList.set(i, u);
        }
        for (int i = 0; i < linksList.size(); i++) {
            String s = linksList.get(i);
            String t = s.replaceAll("l\":\"", "");
            String u = t.replaceAll("\",\"byl.*", "");
            linksList.set(i, u);
        }

        // Iterate through the lists to get
        for (int i = 0; i < titlesList.size(); i++) {
            String k = titlesList.get(i);
            String v = linksList.get(i);
            k = k.replaceAll("\\\\", "");
            v = v.replaceAll("\\\\", "");
            int counter = 0;
            String kResult = "";
            for (int j = 0; counter < k.length()-5; j++) {
                String sub = k.substring(counter, counter + 5);
                if(sub.matches("u\\d\\d\\d\\d")) {
                    int hexVal = Integer.parseInt(sub.substring(1), 16);
                    kResult += (char)hexVal;
                    counter += 5;
                } else {
                    kResult += k.charAt(counter);
                    counter++;
                }
            }
            String endString = k.substring(counter);
            if (endString.matches("u\\d\\d\\d\\d")) {
                int hexVal = Integer.parseInt(endString.substring(1), 16);
                kResult += (char)hexVal;
            } else {
                kResult += endString;
            }

            titlesList.set(i, kResult);
            linksList.set(i, v);
            //System.out.println(titlesList.get(i) + "   " + linksList.get(i));
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < titlesList.size(); i++) {
            extractedArticles.put(titlesList.get(i), linksList.get(i));
        }
//        extractedArticles.entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + "      " + entry.getValue());
//        });
    }
}
