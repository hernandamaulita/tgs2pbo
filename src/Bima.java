public class Bima implements HitungHarga {
    int harga, jmlh, tot;

    public Bima(int jmlh) {
        this.jmlh = jmlh;
    }

    @Override
    public double hitungharga() {
        harga = jmlh * 50000;
        tot = tot + harga + 7500 + 15000;
        return  0;
    }
    public void tampil(){
        System.out.println("Rincian Harga KA BIMA 1 penumpang = " + this.hitungharga());
    }
}
