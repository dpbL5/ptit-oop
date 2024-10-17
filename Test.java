import java.io.*;
import java.util.*;

public  class Test {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
        ArrayList<Integer> ss = new ArrayList<>();


        ss.add(123);
        ss.add(123);
        ss.add(123);
        ss.add(123);
        ss.add(939);
        ss.add(939);
        ss.add(939);
        ss.add(939);
        ss.add(11311);
        ss.add(11311);
        ss.add(11311);
        ss.add(11311);
        ss.add(11311);
        ss.add(11311);
        ss.add(3);
        ss.add(111);
        ss.add(333);
        ss.add(9);
        ss.add(999);
        ss.add(131);
        ss.add(99);
        ss.add(777);
        ss.add(1111);
        ss.add(3333);

        oos.writeObject(ss);
        oos.close();
        oos = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
        ss.add(555);
        oos.writeObject(ss);

        oos.close();
    }
}
