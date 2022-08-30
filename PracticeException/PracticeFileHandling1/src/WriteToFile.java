import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) {

        WriteToFile writeToFile = new WriteToFile();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the content");
        String content = scanner.nextLine();

        writeToFile.writeFile(content,"outputt/demo.txt");

    }

    public void writeFile(String content, String fileName){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);

            for (int i = 0; i < content.length(); i++) {
                char data = content.charAt(i);
                fileOutputStream.write(data);

            }
        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
        }catch (IOException e){
            System.out.println(e);

        }
    }
}
