package problemImplementations;
import java.util.HashMap;

public class Woerterbuch {
    HashMap<String, String> book = new HashMap<>();

    public String getMeaning(String key) {
        return book.getOrDefault(key, "Not found");
    }

    public void setMeaning(String key, String value) {
        book.put(key, value);
    }
}
