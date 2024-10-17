import java.io.*;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String id;
    private String name;
    private Integer price;
    private Float fee;

    public LoaiPhong(String input) {
        Scanner sc = new Scanner(input);
        while (sc.hasNext()) {
            this.id = sc.next();
            this.name = sc.next();
            this.price = sc.nextInt();
            this.fee = sc.nextFloat();
        }
        
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + fee;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
