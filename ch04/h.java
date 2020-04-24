/*Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
int total = 0;
For( int i = 0; I < nilai.length; I++);
total = total + nilai[i]
endfor
print(total)*/

public class h {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int total = 0;
        for (int i = 0; i < nilai.length; i++){
			total = (total + nilai[i]);
			}
		System.out.println("Jumlah = " + total);
        }      
    }