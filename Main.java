public class Main {
    public static void main(String[] args) {

        Kasir kasir1 = new Kasir("Revi");
        kasir1.tampilKasir();

        Barang barang1 = new Barang("Sampo", 15000);
        barang1.tambahBarang();
        barang1.tampilBarang();

        SubTotal sub = new SubTotal(barang1.harga, 4);
        int subtotal = sub.hitung();

        Diskon diskon1 = new Diskon(10);
        int potongan = diskon1.hitungDiskon(subtotal);

        Pajak pajak1 = new Pajak(5);
        int pajakValue = pajak1.hitungPajak(subtotal - potongan);

        int totalAkhir = subtotal - potongan + pajakValue;

        Pembayaran bayar = new Pembayaran();
        bayar.proses(totalAkhir);
    }
}