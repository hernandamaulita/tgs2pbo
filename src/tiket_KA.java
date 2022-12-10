import java.sql.SQLOutput;
import java.util.Scanner;

final class tiket_KA {
    String menu= "";
    int pilihan, jumlah, harga;
    int total=0;
    Scanner scan = new Scanner(System.in);

    public tiket_KA(){
        System.out.println("PEMESANAN TIKET KERETA API ");
        System.out.println("---------------------------");
        class Datatakereta extends Kereta{
            private int kapasitas_gerb;
            public Datatakereta(int kapasitas_gerb){
                this.kapasitas_gerb = kapasitas_gerb;
            }

            @Override
            int getArea() {
                return 0;
            }

            static void myMethod(String nka, String noka) {
                System.out.println(nka + "  " + noka);
                Datatakereta KA =new Datatakereta(105);
                System.out.println("Kapasitas Gerbong : " + KA.getArea());
            }

            public static void main(String[] args) {
                myMethod("Taksaka","82");
                myMethod("KA GMR SLO PRIORITY", "7046P");
                myMethod("BIMA", "76");
            }
        }
        System.out.println("Daftar Harga Tiket Kereta Api");
        System.out.println(" No Kereta     Harga   Berangkat   Tiba");
        System.out.println(" 1  TAKSAKA(82)    50000   Gambir,09:10    Yogyakarta,15:35");
        System.out.println(" 2  KA GMR SLO PRIORITY(7046P) 60000   Gambir,10:40    Yogyakarta,18:37");
        System.out.println(" 3  BIMA(76)   52000   Gambir,17.10    Yogyakarta,00:09");
        System.out.println("Masukkan pilihan anda : ");
        pilihan = scan.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Pilihan Anda TAKSAKA(82) Gambir-Yogyakarta");
                System.out.println("Jumlah tiket : ");
                jumlah = scan.nextInt();
                harga = 50000 * jumlah;
                System.out.println("Harga : Rp. " + harga);
                System.out.println("Total Pembayaran Rp" + harga + "untuk" + jumlah + "tiket");
                total = total + harga;
                System.out.println("SILAKAN LAKUKAN PEMBAYARAN, TERIMA KASIH");
                break;
            case 2:
                System.out.println("Pilihan Anda KA GMR SLO PRIORITY(7046P) Gambir-Yogyakarta");
                System.out.println("Jumlah tiket : ");
                jumlah = scan.nextInt();
                harga = 60000 * jumlah;
                System.out.println("Harga : Rp. " + harga);
                System.out.println("Total Pembayaran Rp" + harga + "untuk" + jumlah + "tiket");
                total = total + harga;
                System.out.println("SILAKAN LAKUKAN PEMBAYARAN, TERIMA KASIH");
                break;
            case 3:
                System.out.println("Pilihan Anda BIMA(76) Gambir-Yogyakarta");
                System.out.println("Jumlah tiket : ");
                jumlah = scan.nextInt();
                harga = 52000 * jumlah;
                System.out.println("Harga : Rp. " + harga);
                System.out.println("Total Pembayaran Rp" + harga + "untuk" + jumlah + "tiket");
                total = total + harga;
                System.out.println("SILAKAN LAKUKAN PEMBAYARAN, TERIMA KASIH");
                break;

        }
    }
    }
