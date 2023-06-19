
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = "I AM LEARNING JAVA\nWITH PATIKA";

        try {
            File file = new File("java.txt");
            FileOutputStream output = new FileOutputStream(file);
            byte[] strByte = str.getBytes();
            output.write(strByte);
            output.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
