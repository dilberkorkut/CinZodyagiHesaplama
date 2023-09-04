import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili, zodyakNumarasi;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = input.nextInt();

        zodyakNumarasi = dogumYili % 12;

        if(zodyakNumarasi == 0) {
            burc = "Maymun";
        }else if (zodyakNumarasi == 1){
            burc = "Horoz";
        }else if(zodyakNumarasi == 2) {
            burc = "Kopek";
        }else if(zodyakNumarasi == 3) {
            burc = "Domuz";
        }else if(zodyakNumarasi == 4) {
            burc = "Fare";
        }else if(zodyakNumarasi == 5) {
            burc = "Okuz";
        }else if(zodyakNumarasi == 6) {
            burc = "Kaplan";
        }else if(zodyakNumarasi == 7) {
            burc = "Tavsan";
        }else if(zodyakNumarasi == 8) {
            burc = "Ejderha";
        }else if(zodyakNumarasi == 9) {
            burc = "Yilan";
        }else if(zodyakNumarasi == 10) {
            burc = "At";
        }else if(zodyakNumarasi == 11) {
            burc = "Koyun";
        }

        System.out.println("Burc Sembolunuz : " + burc );

    }
}
