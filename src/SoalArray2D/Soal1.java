package SoalArray2D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Soal1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String barang[][] = new String[2][6];

    public static void main(String[] args) throws IOException{
        menu();
    }

    public static void menu() throws IOException {
        System.out.println("=================================");
        System.out.println("/tAPLIKASI UD LIMA JAYA");
        System.out.println("=================================");
        System.out.println("1. Input data barang");
        System.out.println("2. Lihat data barang");
        System.out.println("3. Ubah data barang");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan menu : ");
        int pilihan = Integer.parseInt(br.readLine());

        switch (pilihan){
            case 1:
                input_data();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public static void input_data() {
        barang[0][0] = Integer.toString(rand_data());
        System.out.println("Kode barang \t: "+barang[0][0]);
    }

    public static int rand_data(){
        int random;

        random = (int) (Math.random()*99999)+10000;

        return random;
    }
}
