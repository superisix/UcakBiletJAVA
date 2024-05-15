import java.util.Scanner;

public class ucakbilet {

    public static void main(String[] args) {
        int yas, km, yolculuk;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı belirtiniz: ");
        yas = input.nextInt();

        System.out.println("Lütfen yolculuk tipini seçiniz:");
        System.out.println("1 - Tek yön\n2 - Gidiş-Dönüş");
        yolculuk = input.nextInt();

        System.out.println("Ne kadar mesafe gideceksiniz (km)?");
        km = input.nextInt();

        if (km > 0 && yas > 0 && (yolculuk == 1 || yolculuk == 2)) {
            double biletfiyat = km * 0.10;
            double indirimliFiyat = biletfiyat;

            if (yas < 12) {
                indirimliFiyat *= 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimliFiyat *= 0.90;
            } else if (yas > 65) {
                indirimliFiyat *= 0.70;
            }
            if (yolculuk == 2) {
                indirimliFiyat *= 0.80;
                indirimliFiyat *= 2;
            }

            System.out.println("Toplam bilet fiyatınız: " + indirimliFiyat + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        input.close();
    }
}
