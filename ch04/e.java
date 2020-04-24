public class e {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < nilai.length; i++){
            String conv = Integer.toString(nilai[i]);
			if (conv.contains("2")){
			System.out.println(nilai[i]);}
        }      
    }
}