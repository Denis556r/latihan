import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nominal = ");
        int nominal = input.nextInt();

        // Perhitungan pecahan
        int duaPuluhRibu = nominal / 20000;
        int sisa1 = nominal % 20000;

        int sepuluhRibu = sisa1 / 10000;
        int sisa2 = sisa1 % 10000;

        int seribuan = sisa2 / 1000;
        int sisa3 = sisa2 % 1000;

        int limaRatus = sisa3 / 500;
        int sisa4 = sisa3 % 500;

        int duaRatus = sisa4 / 200;
        int sisa5 = sisa4 % 200;

        int seratus = sisa5 / 100;

        // Output
        System.out.println("------------------------");
        System.out.println("Dua puluh ribuan = " + duaPuluhRibu);
        System.out.println("Sepuluh ribuan = " + sepuluhRibu);
        System.out.println("Seribuan = " + seribuan);
        System.out.println("Lima ratusan = " + limaRatus);
        System.out.println("Dua ratusan = " + duaRatus);
        System.out.println("Seratusan = " + seratus);
        // Denis Putra Wardhana (25410100006)
    }
}