package tipedata;
import java.util.Scanner;
public class latihan27_hurufbesarkecil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        String besar = kalimat.toUpperCase();
        String kecil = kalimat.toLowerCase();

        System.out.println("===== Hasil Formatting =====");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf Kecil : " + kecil);
        
    }
    
}
