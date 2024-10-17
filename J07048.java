import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private String id;
    private String name;
    private Integer price;
    private Integer warrantyMonth;

    public Product(String id, String name, Integer price, Integer warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrantyMonth = warranty;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + warrantyMonth;
    }

    @Override
    public int compareTo(Product o) {
        if (price.equals(o.price)) {
            return id.compareTo(o.id);
        }
        return -price.compareTo(o.price);
    }
}

public class J07048 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int t = in.nextInt(); in.nextLine();
        ArrayList<Product> list = new ArrayList<>();
        while (t-- > 0) {
            list.add(new Product(
                in.nextLine(), 
                in.nextLine(), 
                Integer.parseInt(in.nextLine()), 
                Integer.parseInt(in.nextLine())));
        }
        Collections.sort(list);
        list.forEach(s -> System.out.println(s));
    }
}
