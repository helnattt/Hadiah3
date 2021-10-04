import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int hour; 
        int min; 
        int sec; 
        int total;

        System.out.print("Jam: ");
        hour = input.nextInt();

        System.out.print("Menit: ");
        min = input.nextInt();
        
        System.out.print("Detik: ");
        sec = input.nextInt();


       
        total = (hour*3600)+(min*60)+sec;

        System.out.println("total detik :" + total );
        
    }
      
}
