import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double Armut,Elma,Domates,Muz,Patlıcan;
    double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
    double toplam;
    Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç kilo: ");
        Armut = input.nextDouble();
        System.out.print("Elma Kaç kilo: ");
        Elma = input.nextDouble();
        System.out.print("Domates Kaç kilo: ");
        Domates = input.nextDouble();
        System.out.print("Muz Kaç kilo: ");
        Muz = input.nextDouble();
        System.out.print("Patlıcan Kaç kilo: ");
        Patlıcan = input.nextDouble();
        toplam= (armutFiyat*Armut)+(elmaFiyat*Elma)+(domatesFiyat*Domates)+(muzFiyat*Muz)+(patlicanFiyat*Patlıcan);
        System.out.print("Toplam Tutar : "+toplam);
    }
}