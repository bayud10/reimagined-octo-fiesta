/* Array nilai[82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3];
For( int i = 0; I < nilai.length; I++);
If nilai[i] % 5= 0 AND nilai[i-1] % 5 = 0, then print nilai[i];
Endif
Endfor
*/

public class g {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < nilai.length; i++){
			if (((nilai[i]%5) == 0) && (nilai[(i-1)]%5==0) ){
				System.out.println(nilai[i]);
             }
          else {
                System.out.println("Tidak Sesuai");
			}
		}
    }
}