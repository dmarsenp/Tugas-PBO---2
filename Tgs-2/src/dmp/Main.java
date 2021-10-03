package dmp;
import java.io.*;
import java.util.*;

public class Main {
    public static InputStreamReader scan = new InputStreamReader(System.in);
    public static BufferedReader dmp = new BufferedReader(scan);
    public static ArrayList<Buku> test = new ArrayList<>();

    public static void main(String[] args)throws IOException {
        int pilihan;
        do {
            System.out.println("""
                    1.Input data
                    2.Cari/Menampilkan data
                    3.Hapus data""");
            pilihan = Integer.parseInt(dmp.readLine());
            switch (pilihan) {
                case 1 -> input();
                case 2 -> cari();
                case 3 -> hapus();
            }
        }while(pilihan !=4);
    }

    public static void input() throws IOException{
        System.out.println("ISBN: ");
        String isbn = dmp.readLine();
        System.out.println("Judul buku: ");
        String judulBuku = dmp.readLine();
        System.out.println("Pengarang: ");
        String pengarang = dmp.readLine();
        System.out.println("Tahun terbit: ");
        String tahunTerbit = dmp.readLine();
        System.out.println("Harga: ");
        int harga = Integer.parseInt(dmp.readLine());
        System.out.println("Rating: ");
        float rating = Float.parseFloat(dmp.readLine());
        test.add(new Buku(isbn,judulBuku,pengarang,tahunTerbit,harga,rating));
    }

    public static void cari() {

        System.out.println("No ISBN: ");
        test.forEach(buku -> {
            System.out.println();
            for (Buku a : test) {
                System.out.println(a);
            }
        });
    }

    public static void hapus() throws IOException{
        System.out.println("No ISBN: ");
        String isbn = dmp.readLine();
        for(int i=0;i<test.size();i++){
            if(test.get(i).getIsbn().equalsIgnoreCase(isbn)){
                test.remove(i);
            }
        }
    }
}

