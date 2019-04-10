package Coba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String barang[][];

    public static void main(String[] args) throws IOException {

        do {
            System.out.println("1. Input Data Barang ");
            System.out.println("2. Show Data Barang ");
            System.out.println("3. Update Barang");
            System.out.println("4. Keluar ");

            System.out.print("Pilih Menu : ");
            int pilih = Integer.parseInt(br.readLine());

            switch (pilih){
                case 1:
                    inputData();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while(true);

    }

    static void show() {
        System.out.println("============ Data Barang ===========");
        for (int i = 0; i<barang.length; i++){
            System.out.println("== Barang ke "+(i+1)+" ==========================");
            System.out.println("Kode Barang : "+barang[i][0]);
            System.out.println("Nama Barang : "+barang[i][1]);
            System.out.println("Stok Barang : "+barang[i][2]);
            System.out.println("Harga Barang : "+barang[i][3]);
            System.out.println("Total Biaya : "+barang[i][4]);
        }
        System.out.println("====================================");
    }


    static void inputData() throws IOException{
        System.out.println("");
        System.out.print("Jumlah barang yang diinputkan : ");
        int jml = Integer.parseInt(br.readLine());

        barang = new String[jml][5];

        for (int i=0; i<barang.length; i++) {
            System.out.println("== Barang ke "+(i+1)+" ==========================");
            System.out.println("Kode Barang : "+random());
            barang[i][0] = Integer.toString(random());
            System.out.print("Masukkan Nama Barang : ");
            barang[i][1] = br.readLine();
            System.out.print("Masukkan Stok Barang : ");
            barang[i][2] = br.readLine();
            System.out.print("Masukkan Harga Barang: ");
            barang[i][3] = br.readLine();
            int total = Integer.parseInt(barang[i][2])*Integer.parseInt(barang[i][3]);
            barang[i][4] = String.valueOf(total);
        }
        System.out.println();
        System.out.println();
    }

    static int random(){
        int random;

        random = (int) (Math.random()*99999)+10000;

        return random;
    }

}
