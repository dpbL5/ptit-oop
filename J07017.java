import java.io.File;
import java.io.IOException;
import java.util.Scanner;


class Pair<F, S> {
    
    private F first;
    private S second;
    
    Pair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public boolean isPrime(Integer n) {
        for (int i = 2; i <= Math.sqrt((int)n); i++) {
            if ((int)n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public boolean isPrime() {
        return isPrime((Integer) this.first) && isPrime((Integer) second); 
    }

    @Override
    public String toString() {
        return first.toString() + " " + second.toString();
    }
}


public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
