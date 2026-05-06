import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugaspratikum {
    public static void main(String[] args) throws IOException {

        int batas, kelipatan;

        // Membuat BufferedReader untuk input
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // Input batas
        System.out.print("Batas = ");
        batas = Integer.parseInt(br.readLine());

        // Input kelipatan
        System.out.print("Kelipatan = ");
        kelipatan = Integer.parseInt(br.readLine());

        // Perulangan menampilkan angka
        for (int a = 1; a < batas; a = a + kelipatan) {
            System.out.print(a + " ");
        }

        System.out.println("");
    }
}