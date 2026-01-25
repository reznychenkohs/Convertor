package FileHandler;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "C:\\Users\\Anna\\IdeaProjects\\Converter\\";

    public String writeFile(String fileName, String content) {
        try(FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt")) {
            fw.write(content);
            return "Success.";
        } catch (Exception e) {
            return ("Exception" + e.getMessage());
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder stringBuilder = new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
