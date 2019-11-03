package sample;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.*;
import java.net.URL;
import java.util.*;

public class GetRSS {
    static List<String> titlesList;
    static List<String> linksList;
    static HashMap<String, String> articlesMap = new HashMap<>();
    static String rssKey;
    static ArrayList<String> feeds;

    public static void main(String[] args) {
        feeds = new ArrayList<>();
        System.out.println("Feeds size: " + feeds.size());
        titlesList = new ArrayList<>();
        titlesList.clear();
        System.out.println("Titles List Size: " + titlesList.size());
        linksList = new ArrayList<>();
        loadFromFile();

//        for (int i = 0; i < 7; i++) {
//            titlesList.add("Fake title " + i);
//        }
//        titlesList.add("AirPods Pro First Impressions");
//        titlesList.add("United Airlines Suggests That Apple is Helping Design Terminal Upgrades at SFO");
//        titlesList.add("Apple Introduces AirPods Pro");
//        titlesList.add("iOS 13.2 Emoji Changelog");
//        titlesList.add("Catalina Leaks 16-inch MachBook Pro TOuch ID and Touch Bar Layout");
//        titlesList.add("Weekend");
//        titlesList.add("Facebook's Media Farce");


        List<SyndEntry> entries;
        for (int j = 0; j < feeds.size(); j++) {
            String rss = feeds.get(j);
            //System.out.println(rss);
            try {
                URL feedUrl = new URL(rss);

                SyndFeedInput input = new SyndFeedInput();
                SyndFeed feed = input.build(new XmlReader(feedUrl));

                entries = feed.getEntries();
                for (int i = 0; i < 3; i++) {
                    SyndEntry syndEntry = entries.get(i);
                    String title = syndEntry.getTitle();
                    String link = syndEntry.getLink();
                    title += " by " + syndEntry.getAuthor();
                    //System.out.println(title);
                    //System.out.println(link);
                    titlesList.add(title);
                    linksList.add(link);
                    articlesMap.put(title, link);
                }
            }
            catch (Exception ex) {
                //ex.printStackTrace();
                //System.out.println("ERROR: "+ex.getMessage());
            }
        }
    }

    private static void loadFromFile() {
        File file = new File("/Users/conorbrandon/IntelliJProjects/CSE260Project/src/sample/feeds.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                feeds.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    static void writeToFile() {
        File file = new File("/Users/conorbrandon/IntelliJProjects/CSE260Project/src/sample/feeds.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < feeds.size(); i++) {
                String string = feeds.get(i);
                printWriter.println(string);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
