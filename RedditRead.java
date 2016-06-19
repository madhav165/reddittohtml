import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class RedditRead {

    public static void main(String []args) {
        try {
            String commentstring="0";
            String url;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter URL: ");
            url = sc.next();

            Document doc = Jsoup.connect(url).timeout(5000).get();
            String title = doc.title();
            WriteToHTMLFile hf = new WriteToHTMLFile(title.replace("/"," ")+".html");
            hf.clearFile();
            hf.insertLine("<!DOCTYPE html>\n<html>\n<head>");
            hf.insertLine("<title>"+title+"</title>");
            hf.insertLine("<meta author=\"reddit.com\">\n</head>\n<body>");
            hf.insertLine("<h1>"+title+"</h1>");
            Elements entries = doc.getElementsByClass("entry");
            for (Element entry : entries) {
                if (!entry.getElementsByClass("author").isEmpty()) {
                    hf.insertLine("<p><b>"+entry.getElementsByClass("author").text()+"</b></p>");
                }
                if(!entry.getElementsByClass("md").isEmpty()) {
                    hf.insertLine("<p>"+entry.getElementsByClass("md").first().toString().replaceAll(" class=\"md\"", "")+"</p>");
                }
            }
            hf.insertLine("</body>\n</html>");
            System.out.println("Conversion successful");
        }
        catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops! Some files are missing.");
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("Oops! Couldn't parse the URL. Waiting for a fix.");
        }
    }
} 
