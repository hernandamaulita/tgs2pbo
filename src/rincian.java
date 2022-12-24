
import java.util.Scanner;

public class rincian {
    public static  void main(String [] args ){
        java.io.File file = new java.io.File("note.txt");
        try {
            Scanner input = new Scanner(file);
            input.useDelimiter("\n");
            while (input.hasNext()) {
                String Title = input.next();
                String Nama = input.next();
                int No_Hp = input.nextInt();
                int Jumlah_tiket = input.nextInt();
                System.out.println("Title : " + Title);
                System.out.println("Nama : " + Nama);
                System.out.println("No HP : " + No_Hp);
                System.out.println("Jumlah Tiket : " + Jumlah_tiket);
            }
            input.close();
        }
        catch(Exception e){
                e.printStackTrace();
            }
        }
    }
