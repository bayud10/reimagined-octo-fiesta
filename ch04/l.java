/*
l. Menampilkan jumlah angka dengan angka setelahnya yang hasil 
penjumlahannya bernilai genap di dalam array tersebut di atas.
*/
public class l {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		int jumlah = 0;
        for (int i = 0; i < nilai.length-1; i++){
			jumlah = (jumlah + nilai[i]);
				if (jumlah%2==0){
					System.out.println(nilai[i]+nilai[(i+1)]);
				}
        }
    }
}