class Diskon {
    int persen;

    Diskon(int persen) {
        this.persen = persen;
    }

    int hitungDiskon(int total) {
        int diskon = total * persen / 100;
        System.out.println("Diskon: " + diskon);
        return diskon;
    }
}