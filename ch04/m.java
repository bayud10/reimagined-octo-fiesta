/*
m. Menghitung jumlah angka-angka selisih yang ditampilkan pada poin (i) di atas.
Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
int selisih, selisihtotal = 0 ;
For( int i = 0; I < nilai.length; I++);
selisih = int[i] - int[i+1]
print(selisih)
selisihtotal = selisihtotal + selisih
endfor
print selisihtotal;

i. Menampilkan selisih angka-angka dengan angka setelahnya di dalam array tersebut di atas.
*/
public class m {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int selisih = 0;
		int selisihtotal = 0;
        for (int i = 0; i < nilai.length-1; i++){
			selisih = (nilai[i] - nilai[(i+1)]);
			} selisihtotal = selisihtotal +selisih;
			System.out.println(selisihtotal);
        }      
    }