import java.util.Scanner;
public class a {
    public static void main(String[] args) {

        int intNilai1 = 0;
        int intNilai2 = 0;
        String strNamaMhs1 = "";
        String strNamaMhs2 = "";

        String strUlang;

        for (;;) {

            Scanner input = new Scanner(System.in);
            System.out.print("Masukan Nama : ");
            String strNamaMhs = input.next();

            System.out.print("Masukan Nilai : ");
            int intNilai = input.nextInt();

            if (intNilai > intNilai1) {
                intNilai2 = intNilai1;
                strNamaMhs2 = strNamaMhs1;
                
                strNamaMhs1 = strNamaMhs;
                intNilai1 = intNilai;
            }

            System.out.print("Input Lagi (Y/N) ? ");
            strUlang = input.next();
            if (strUlang.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Nilai Tertinggi 1 : " + intNilai1 + " , Atas Nama : " + strNamaMhs1);
                System.out.println("Nilai Tertinggi 2 : " + intNilai2 + " , Atas Nama : " + strNamaMhs2);
                break;
            }

        }

    }
}