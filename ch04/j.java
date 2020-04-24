/*Menampilkan selisih angka-angka genap dengan angka
setelahnya yang genap pula di dalam array tersebut di atas.
Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
int selisih;
For( int i = 0; I < nilai.length; I++);
If nilai[i] % 2= 0 AND nilai[i+1] % 2 = 0
selisih = nilai[i] - nilai[i+1];
print(selisih)
Endif
Endfor
*/
public class j {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int selisih = 0;
        for (int i = 0; i < nilai.length-1; i++){
			if ((nilai [i] % 2== 0) && (nilai[(i+1)]%2==0)){
			selisih = (nilai[i] - nilai[(i+1)]);
          		System.out.println("Jumlah = " + selisih);
			}
        }
    }
}