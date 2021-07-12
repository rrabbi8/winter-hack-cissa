import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
    private String fileName;
    public Parser(String fileName){
        this.fileName = fileName;
    }

    public void readFile() throws IOException {
        File file = new File(fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                //String[] parts = line.split("\n");
            }
        } catch (IIOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static void main(String args[]) throws IOException {
        new Parser("isles.txt").readFile();
    }


}
