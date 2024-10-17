import java.util.*;
import java.io.*;

class Subject implements Comparable<Subject> {
    private String ID;
    private String name;
    private int credit;

    public Subject(String ID, String name, int credit) {
        this.ID = ID;
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + credit;
    }

    @Override
    public int compareTo(Subject o) {
        return name.compareTo(o.name);
    }
}

public class J07034 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Subject> subjects = new ArrayList<>();
        while (t-- > 0) {
            subjects.add(new Subject(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(subjects);

        subjects.forEach(s -> System.out.println(s));
    }
}
