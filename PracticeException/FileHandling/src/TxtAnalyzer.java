import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TxtAnalyzer {

    public static void main(String[] args) {

        TxtAnalyzer txtAnalyzer = new TxtAnalyzer();

    }
    public String readFile(String fileName) {

        String response ="";

        InputStream inputStream = null;
        int data = 0;
        try {
            while (data != 0) {
                data = inputStream.read();
                char datachar = (char)data;
                response += datachar;
            }
        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
        }catch (IOException e){
            System.out.println("e = " + e);
        }

      return response;
    }
}
