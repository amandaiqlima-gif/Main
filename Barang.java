class Barang {
    String nama;
    int harga;

    String tambahbarang;
    String tampilkanbarang;

    Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tambahBarang() {
        tambahbarang = "Barang ditambahkan: " + nama;
        System.out.println(tambahbarang);
    }

    void tampilBarang() {
        tampilkanbarang = "Nama: " + nama + " | Harga: " + harga;
        System.out.println(tampilkanbarang);
    }
}