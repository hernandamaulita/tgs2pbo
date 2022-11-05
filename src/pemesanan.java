import java.util.Scanner;

public class pemesanan {
    String title;
    String tipeidentitas;
    int nohp;
    String alamat;
    String nama;
    int no_identitas;
    String email;
    protected pemesanan(){
        Scanner input = new Scanner(System.in);
        System.out.println("DATA PEMESAN ");
        System.out.println("Title :");
        String title = input.nextLine();
        System.out.println("Tipe Identitas :");
        String tipeidentitas = input.nextLine();
        System.out.println("No Hp :");
        String nohp = input.nextLine();
        System.out.println("Alamat:");
        String alamat = input.nextLine();
        System.out.println("Nama :");
        String nama = input.nextLine();
        System.out.println("No Identitas :");
        String no_identitas = input.nextLine();
        System.out.println("Email:");
        String email1 = input.nextLine();
    }
}
