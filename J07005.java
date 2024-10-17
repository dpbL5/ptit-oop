import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class J07005 {
    public static void main(String[] args) throws IOException{
        try {
            FileInputStream inputStream = new FileInputStream("DATA.IN");
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            int counter[] = new int[1001];
            for (int i = 0; i < 100000; i++) {
                int readNumber = dataInputStream.readInt();
                counter[readNumber]++;
            }

            dataInputStream.close();
            inputStream.close();

            for (int i = 0; i <= 1000; i++) {
                if (counter[i] > 0) {
                    System.out.println(i + " " + counter[i]);
                }
            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
        }
    }
}