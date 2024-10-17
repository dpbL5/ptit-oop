import java.util.*;
import java.io.*;

class Cooperation implements Comparable<Cooperation> {
    private String ID;
    private String name;
    private int slot;

    public Cooperation(String ID, String name, int slot) {
        this.ID = ID;
        this.name = name;
        this.slot = slot;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + slot;
    }

    @Override
    public int compareTo(Cooperation o) {
        return ID.compareTo(o.ID);
    }
}

public class J07037 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Cooperation> Cooperations = new ArrayList<>();
        while (t-- > 0) {
            Cooperations.add(new Cooperation(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(Cooperations);

        Cooperations.forEach(s -> System.out.println(s));
    }
}
