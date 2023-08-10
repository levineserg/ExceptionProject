import java.io.FileWriter;
import java.io.IOException;

public class WriterInfo {
    public void writeData(String[] data, String path) {

        try(FileWriter fw = new FileWriter(path, true)) {
            for (String datum : data) fw.append(" <" + datum + "> ");
            fw.append("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}