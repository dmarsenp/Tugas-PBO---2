package dmp;

public class Buku {
    private final String isbn;
    private final String judulBuku;
    private final String pengarang;
    private final String tahunterbit;
    private final int harga;
    private final float rating;

    public Buku(String isbn, String judulBuku, String pengarang, String tahunterbit, int harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return  "\nISBN = " + isbn +
                "\nJudul Buku = " + judulBuku +
                "\nPengarang = " + pengarang +
                "\nTahun terbit = " + tahunterbit +
                "\nHarga = " + harga +
                "\nRating = " + rating;
    }
}
