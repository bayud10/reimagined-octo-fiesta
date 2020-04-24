/*
n. Menampilkan jumlah angka-angka di dalam array tersebut di atas dengan seluruh angka-angka sebelumnya.
Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
int total = 0;
int total2=0;
For( int i = 0; i < nilai.length; I++);
total = total + nilai[i]
for( int j = i; i > 0; j--);
total2 = total + nilai[j]
print(total2)
endfor
*/
public class n {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int total = 0;
		int total2= 0;
        for (int i = 0; i < nilai.length-1; i++){
			total = (total + nilai[i]);
			for (int j = i; j > 0 ; j--){
				total2 = (total + nilai[j]);
				}
			}
		System.out.println("Jumlah = " + total2);
        }      
    }