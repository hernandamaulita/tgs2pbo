public class GMR implements HitungHarga {
        int harga, jmlh, tot, conviciencefee, asuransiprjln;

        public GMR (int jmlh) {
            this.jmlh = jmlh;
        }

        @Override
        public double hitungharga() {
            conviciencefee = 7500;
            asuransiprjln = 15000;
            harga = jmlh * 60000;
            tot = tot + harga + conviciencefee + asuransiprjln;
            return  0;
        }
        public void tampil(){
            System.out.println("Rincian Harga KA GMR 1 penumpang = " + this.hitungharga());
        }
    }

