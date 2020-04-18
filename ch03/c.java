import java.util.*;
public class c {
    public static void main(String args[]){
        
        String fak = "";
        Scanner baca;
        
        baca = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bil = Integer.parseInt(baca.next());
        
        for (int i=1; i<=bil; i++){
            if (bil%i==0){
             fak+=i+" ";
            }   
        }
        System.out.print(fak);
    }
}