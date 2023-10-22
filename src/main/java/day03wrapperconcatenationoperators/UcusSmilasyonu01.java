package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class UcusSmilasyonu01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double yukseklik = 0.0;
        double yatayHiz = 0.0;
        double yatayKonum = 0.0;

        System.out.println("Uçuş Simülasyonuna Hoş Geldiniz!");
        System.out.println("---------------------------------");

        while (true) {
            System.out.println("\nYükseklik: " + yukseklik + " metre");
            System.out.println("Yatay Hız: " + yatayHiz + " m/s");
            System.out.println("Yatay Konum: " + yatayKonum + " metre");

            System.out.println("\nKomut Seçenekleri:");
            System.out.println("1 - Yüksel");
            System.out.println("2 - Alçal");
            System.out.println("3 - Sağa Dön");
            System.out.println("4 - Sola Dön");
            System.out.println("5 - Çıkış");

            System.out.print("Lütfen bir komut seçin: ");
            int komut = scanner.nextInt();

            if (komut == 5) {
                System.out.println("Uçuş simülasyonu sona erdi.");
                break;
            }

            switch (komut) {
                case 1:
                    yukseklik += 100.0;
                    break;
                case 2:
                    yukseklik -= 100.0;
                    break;
                case 3:
                    yatayKonum += 50.0;
                    yatayHiz += 10.0;
                    break;
                case 4:
                    yatayKonum -= 50.0;
                    yatayHiz += 10.0;
                    break;
                default:
                    System.out.println("Geçersiz komut! Lütfen tekrar deneyin.");
                    break;
            }
        }

        scanner.close();
    }
}
