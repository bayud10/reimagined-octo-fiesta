/*Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
int selisih ;
For( int i = 0; I < nilai.length; I++);
selisih = int[i] - int[i+1]
print(selisih)
endfor
*/
public class i {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int selisih = 0;
        for (int i = 0; i < nilai.length-1; i++){
			selisih = (nilai[i] - nilai[(i+1)]);
          		System.out.println("Jumlah = " + selisih);
			}
        }      
    }