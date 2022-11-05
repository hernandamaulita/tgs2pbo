import java.util.Scanner;

public class dewasa extends data{
    String title;
    int jmld;
    int i;
public dewasa() {
    Scanner input = new Scanner(System.in);
    System.out.println("DEWASA");
    System.out.println("jumlah :");
    jmld = input.nextInt();
    for (i = 1; i <= jmld; i++) {
        System.out.println("Title   : ");
        title = input.nextLine();
    }
}


}
