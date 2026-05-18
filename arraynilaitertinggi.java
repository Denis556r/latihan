public class arraynilaitertinggi    {

   
    public static int getNilaiMax(int[] arr) {

        int max = arr[0]; 

        
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {

        int[] nilai = {70, 85, 90, 65, 100, 88};

       
        int hasil = getNilaiMax(nilai);

        System.out.println("Nilai tertinggi: " + hasil);
        //Denis Putra Wardhana 25410100006
    }
}