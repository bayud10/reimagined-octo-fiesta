
   import java.util.*;
public class euclid{
    public int GCD(int a, int b) {
            while (b > 0)
            {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
    }
    public static void main(String[] args) {
        euclid obj = new euclid();
        System.out.println("Masukkan dua angka yang ingin di FPB-kan: ");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        int FPB = obj.GCD(a, b);
        System.out.println("GCD = " + FPB);
    }
}
   