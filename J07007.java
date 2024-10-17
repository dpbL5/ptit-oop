import java.io.File;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("VANBAN.in"));
        TreeSet<String> wordSet = new TreeSet<>();
        while (in.hasNextLine()) {
            Scanner sn = new Scanner(in.nextLine());
            while (sn.hasNext()) {
                wordSet.add(sn.next().toLowerCase());
            }
            sn.close();
        }
        wordSet.forEach(element -> {
            System.out.println(element);
        });
    }
}
