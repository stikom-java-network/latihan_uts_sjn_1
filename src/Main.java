import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static ArrayList<String> kode = new ArrayList<>();
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<Integer> qty = new ArrayList<>();
    static ArrayList<Integer> harga = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        do{
            System.out.println("+-------- Menu ---------+");
            System.out.println("1. Input Pesanan");
            System.out.println("2. Tampilkan Pesanan");
            System.out.println("+-----------------------+");
            System.out.print("Masukkan Pilihan : ");
            int pilih = Integer.parseInt(br.readLine());

            switch (pilih){
                case 1:
                    do{
                        input();
                        System.out.print("Beli lagi [Y/N] : ");
                        String lagi = br.readLine();

                        if (lagi.equals("N")){
                            break;
                        }
                    }while(true);

                    break;
                case 2:
                    tampil();
                    break;
                default:
                    System.out.println("pilihan tidak ada");
                    break;
            }
        }while(true);

    }

    public static void input() throws IOException{
        System.out.print("Masukkan kode barang \t : ");
        String mKode = br.readLine();
        System.out.print("Masukkan nama barang \t : ");
        String mNama = br.readLine();
        System.out.print("Masukkan quantity barang : ");
        int mQty = Integer.parseInt(br.readLine());
        System.out.print("Masukkan harga barang \t : ");
        int mHarga = Integer.parseInt(br.readLine());

        kode.add(mKode);
        nama.add(mNama);
        qty.add(mQty);
        harga.add(mHarga);
    }

    public static void tampil(){
        for (int i = 0; i < kode.size(); i++){
            System.out.println("-- Barang "+(i+1)+" ----------------------");
            System.out.println("Kode Barang \t : "+kode.get(i));
            System.out.println("Nama Barang \t : "+nama.get(i));
            System.out.println("Qty Barang \t\t : "+qty.get(i));
            System.out.println("Harga Barang \t : "+harga.get(i));
        }
    }
}
