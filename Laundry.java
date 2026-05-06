import java.util.Scanner;

public class Laundry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahCucian = 0;
        char pelanggan;

        while (jumlahCucian < 5) {

            System.out.print("Apakah ada pelanggan yang datang? (y/n): ");
            pelanggan = input.next().charAt(0);

            if (pelanggan == 'y' || pelanggan == 'Y') {
                jumlahCucian++;
                System.out.println("Cucian masuk. Total cucian: " + jumlahCucian);
            }

            else if (pelanggan == 'n' || pelanggan == 'N') {
                System.out.println("Tidak ada pelanggan lagi.");
                break;
            }

            else {
                System.out.println("Input tidak valid!");
            }
        }

        System.out.println("Proses selesai.");
        input.close();
        //Denis Putra Wardhana (25410100006)
    }
}