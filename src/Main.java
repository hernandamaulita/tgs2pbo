import java.util.Scanner;

class Pemesanantiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        login akun = new login();
        akun.setEmail("hernanda@gmail.com");
        akun.setPassword("tgspbo");
        System.out.println("Email : " + akun.getEmail());
        System.out.println("Password : " + akun.getpassword());
        System.out.println("======================================");
        pemesanan tiket = new pemesanan();
        tiket_KA objtiketKA = new tiket_KA();
        data pemesan = new data();
        dewasa objdewasa = new dewasa();
        anak objanak = new anak();
        System.out.println("Rincian Harga ");
        Bima bm = new Bima('1');
        bm.tampil();
        taksaka tks = new taksaka('1');
        tks.tampil();
        GMR objGMR = new GMR('1');
        objGMR.tampil();
    }

    }
