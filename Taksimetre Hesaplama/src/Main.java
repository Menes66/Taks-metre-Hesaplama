import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int km;
        double kmbaş = 2.20, toplam, açılışfiyatı = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz : ");
        km = input.nextInt();

        toplam = (km + kmbaş);
        toplam += açılışfiyatı;

        toplam = (toplam < 20) ? 20 : toplam;
        System.out.print("Toplam Tutar : " + toplam);
    }
}