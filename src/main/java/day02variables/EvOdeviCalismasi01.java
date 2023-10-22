package day02variables;

import java.util.Scanner;

public class EvOdeviCalismasi01 {
    public static void main(String[] args) {
        //bir long degisken tanimlama
        long longValue = 123456789123456789L; //sonuna L harfi konur
        //islem yapma
        long sun= longValue + 1000;
        //long degiskenini ekrana yazdirma
        System.out.println("longValue: " + longValue);
        System.out.println("sun: " + sun);
        // float degiskenine ornek
        float gömlekFiyati = 299.99F;
        System.out.println("gömlek satis Fiyati: " + gömlekFiyati);
        //iki ögrencinin notlarini tanimlama
        double student1Grade = 85.5;
        double student2Grade = 76.0;

        // ögenci notlarini ekrana yazdirma
        System.out.println("Ögrenci 1 Notu: "+ student1Grade);
        System.out.println("Ögrenci 2 Notu: "+ student2Grade);

        //Char örnek
        char basHarf = 'A';
        System.out.println("Harf Kalekteri: " + basHarf);

        //Boolean veri türü örnegi
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("Dogru: " + isTrue);
        System.out.println("Yanlis :" + isFalse);

        //'byte' örnek
        byte benimBoyum = 125;
        System.out.println("Bayt: " + benimBoyum);

        // 'sort' örnek

        short myShort = 32000;
        System.out.println("Kisa: " + myShort);

        //'int' örnek

        int myInt = 123456;
        System.out.println("Tamsayi : " + myInt);

        //'long'

        long sistemininDisCapi = 5999888888777775555L;
        System.out.println("Uzaklik: " + sistemininDisCapi);

        //'double' veri türü
        double ichDouble = 2.278987;
        System.out.println("Hassas Tarti:" + ichDouble);

        // örnek market satis sistemi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Market satis Kasa Programina Hos Geldiniz");
        System.out.println("-----------------------------------------");

        //Ürüm bilgileri Alma
        System.out.println("Ürün Adi: ");
        String urunAdi = scanner.nextLine();

        System.out.print("Ürün Miktari: ");
        int urunMiktari = scanner.nextInt();

        System.out.print("Brim Fiyati (TL): ");
        double birimFiyat = scanner.nextDouble();

        //toplam Tutar hesaplama
        double toplamTutar = scanner.nextDouble();

        //Ödeme alma
        System.out.print("Ödeme Tutar (TL)");
        double odenenTutar = scanner.nextDouble();

        //Para üstü hesaplama
        double paraUstu = odenenTutar - toplamTutar;

        //Fatura Bilgileri Gösterme
        System.out.println("\nFatura Bilgileri");
        System.out.println("___________________");
        System.out.println("Ürün Adi: " + urunAdi);
        System.out.println("Ürün Miktari: " + urunMiktari);
        System.out.println("Birim Fiyati: " + birimFiyat +"TL");
        System.out.println("Toplam Tutar: " + toplamTutar);
        System.out.println("Odenen tutar: " + odenenTutar);
        System.out.println("para Üstü: " + paraUstu + "TL");







    }




}
