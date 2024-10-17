import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Customer implements Comparable<Customer> {
    private static int sid = 1;

    private String id = "KH";
    private String name;
    private String roomID;
    private Integer stayDays;

    public Customer(String name, String roomID, Integer stayDays) {
        this.id = this.id + String.format("%02d", sid++);
        this.name = name;
        this.roomID = roomID;
        this.stayDays = stayDays;
    }

    @Override
    public int compareTo(Customer o) {
        return -stayDays.compareTo(o.stayDays);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + roomID + " " + stayDays; 
    }

}

public class J07046 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<Customer> list = new ArrayList<>();
        while (t-- > 0) {
            String name = in.nextLine();
            String room = in.nextLine();
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            LocalDate start = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate end = LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            long chrono = ChronoUnit.DAYS.between(start, end);

            list.add(new Customer(name, room, (int) chrono));
        }

        Collections.sort(list);

        list.forEach(k -> System.out.println(k));
    }
}
