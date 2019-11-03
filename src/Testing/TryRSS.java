package Testing;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.util.List;

/**
 * It Reads and prints any RSS/Atom feed type.
 * <p>
 * @author Alejandro Abdelnur
 *
 */
public class TryRSS {
    static List<SyndEntry> entries;

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "https://daringfireball.net/feeds/main";
        args[1] = "http://feedpress.me/512pixels";
        for (int j = 0; j < args.length; j++)  {
            String rss = args[j];
            try {
                URL feedUrl = new URL(rss);

                SyndFeedInput input = new SyndFeedInput();
                SyndFeed feed = input.build(new XmlReader(feedUrl));

                entries = feed.getEntries();
                for (int i = 0; i < entries.size(); i++) {
                    SyndEntry syndEntry = entries.get(i);
                    String title = syndEntry.getTitle();
                    String link = syndEntry.getLink();
                    System.out.println(title);
                    System.out.println(link);
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("ERROR: "+ex.getMessage());
            }
        }
    }
}
