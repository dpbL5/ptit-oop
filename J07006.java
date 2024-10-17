import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) 
        throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("DATA.in")));
        ArrayList<Integer> iList = ((ArrayList<Integer>)in.readObject());
        int counter[] = new int[1001];
        for (Integer i: iList) {
            counter[i]++;
        }

        for (int i = 0; i <= 1000; i++) {
            if (counter[i] > 0) {
                System.out.println(i + " " + counter[i]);
            }
        }
    }
}
