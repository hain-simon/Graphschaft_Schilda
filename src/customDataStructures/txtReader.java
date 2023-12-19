package customDataStructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class txtReader {
    //falls einer benötigt wird
    public static void main(String[] args) {
        // Pfad zur .txt-Datei
        //Eigenen Pfad eingeben, um betsimmte Datei einzulesen

        String filePath = "C:/Users/louis/Desktop/Matrix.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Zeilenweise lesen und ausgeben
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
