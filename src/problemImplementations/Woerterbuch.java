package problemImplementations;
import java.util.HashMap;

public class Woerterbuch {
    HashMap<String, String> schildaGerman = new HashMap<>();
    HashMap<String, String> germanSchilda = new HashMap<>();

    public String getSchildaToGerman(String key) {
        return schildaGerman.getOrDefault(key, "Not found");
    }

    public String getGermanToSchilda(String key){
        return germanSchilda.getOrDefault(key, "Not found");
    }

    public void setMeaningSchildaGerman(String schildaWord, String germanWord) {
        schildaGerman.put(schildaWord, germanWord);
        germanSchilda.put(germanWord, schildaWord);
    }
}
