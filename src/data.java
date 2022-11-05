import java.util.Scanner;

public class data {
    String tipe_identitas;
    String nama;
    int no_identitas;
    int jmlh;
    int i;

    public data(){
        Scanner input = new Scanner(System.in);
        for(i=1; i<=jmlh; i++) {
            System.out.println("Nama    : ");
            nama = input.nextLine();
            System.out.println("Tipe Identitas  : ");
            tipe_identitas = input.nextLine();
            System.out.println("No Identitas    : ");
            no_identitas = input.nextInt();
        }
    }
}
