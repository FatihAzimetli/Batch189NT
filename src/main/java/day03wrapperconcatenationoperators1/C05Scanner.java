package day03wrapperconcatenationoperators1;

import java.util.Scanner;

public class C05Scanner {
    public  static void main(String[] args) {
        //kullanicidan aldiginiz sayinin karesini bulunuz
        //not:bir sayinin karesi, sayinin kendisi ile carpin
        //kullanicidan veri almak icin scanner kullaniriz
        //1.adim scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);

        //kullaniciya mesaj verelim
        System.out.println("Lütfen bulmak istediginiz sayiyi girin");
        int sayi = scan.nextInt();
        System.out.println(sayi);

        System.out.println("girdigimiz sayinin karesi" + sayi * sayi + "'mi");


    }

}
