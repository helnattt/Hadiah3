import java.util.Scanner;

public class hitungluaspersegipanjang {	
 public static void main(String[] args) {	
 	int panjang, lebar, luas;
 	Scanner scan = new Scanner (System.in);
 	
 	System.out.print("Masukkan Panjang : ");
 	panjang = scan.nextInt();
 	
 	System.out.print("Masukkan lebar : ");
 	lebar = scan.nextInt();
 	
 	luas = panjang * lebar ;
 	
 	System.out.println("Luas Persegi Panjang adalah " + luas);
 }
}
