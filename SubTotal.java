class SubTotal {
    int belibarang;
    int harga;
    int hitungtotal;

    SubTotal(int harga, int jumlah) {
        this.harga = harga;
        this.belibarang = jumlah;
    }

    int hitung() {
        hitungtotal = harga * belibarang;
        System.out.println("Subtotal: " + hitungtotal);
        return hitungtotal;
    }
}