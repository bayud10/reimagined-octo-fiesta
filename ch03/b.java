public class b{
    public static void main(String[] args){
        int angka1, angka2, angka3, maks;
        angka1 = 10;
        angka2 = 300;
        angka3 = 20;
        if (angka1>angka2 && angka1>angka3) {
            maks = angka1;
        } else if (angka2>angka1 && angka2>angka3){
            maks = angka2;
        } else{
            maks = angka3;
        }
        System.out.println("Angka maksimum adalah= "+maks);
    }
}