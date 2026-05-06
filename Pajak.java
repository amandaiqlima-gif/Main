class Pajak {
    int persen;

    Pajak(int persen) {
        this.persen = persen;
    }

    int hitungPajak(int total) {
        int pajak = total * persen / 100;
        System.out.println("Pajak: " + pajak);
        return pajak;
    }
}