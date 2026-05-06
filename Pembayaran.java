public class Pembayaran {
    int bayar;
    String keluar;
    int tampilkantransaksi;

    void proses(int total) {
        tampilkantransaksi = total;

        System.out.println("Total: " + tampilkantransaksi);

        bayar = total;
        System.out.println("Bayar: " + bayar);

        keluar = "Terima Kasih!";
        System.out.println(keluar);
    }
} 
    

