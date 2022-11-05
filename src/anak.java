import java.util.Scanner;

public class anak extends data{
    int ttl;
    int i;
    int jmla;
    public anak() {
        Scanner input = new Scanner(System.in);
        System.out.println("ANAK");
        System.out.println("Jumlah :");
        jmla = input.nextInt();
        for (i = 1; i <= jmla; i++) {
            System.out.println("Tanggal Lahir   : ");
            ttl = input.nextInt();
        }
    }

}
