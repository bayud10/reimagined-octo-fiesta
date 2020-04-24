/*
k. Menampilkan angka-angka yang setelahnya bernilai lebih besar.
*/
public class k {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < nilai.length-1; i++){
			if ((nilai[i] < nilai[(i+1)])){
          		System.out.println(nilai[i]);
			}
        }
    }
}