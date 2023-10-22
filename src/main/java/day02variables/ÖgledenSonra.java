package day02variables;

public class ÖgledenSonra {
    public static void main(String[] args) {

        //varible nasil olusturulur.?
        // Data type + variable name + Assigment Operatot(atama operatoru)+ Variable Degeri + noktali vürgül
        int              age                                  =                 13                ;
        System.out.println(age);
        /*
       Java da temelde iki tip data vardir
       1)primitive data type:
            char, boolean, byte, short, int, long, float, double

       2)non-primitive data type:
            String
        */
        //char data type :  2 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //örneğin ==> A, x, ?, 5
        //Ornek 2: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Data type + variable name + Assigment Operatot(atama operatoru)+ Variable Degeri + noktali vürgül
        char      isminIlkHarfi               =                          'A'               ;
               //char data type :  1 byte
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //Ornek 3: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //boolen'lar sadece iki farkli deger alabilir : True veya false
        //Data type + variable name + Assigment Operatot(atama operatoru)+ Variable Degeri + noktali vürgül
        //boolwandata type emeklimisin sorusu icin bir variableolusturun ve false degeri atayin
        boolean emeklimi = false;
        boolean isRetired = false;
               //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi =15;
            //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu =576;
            //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz

        int ulkeNufusu = 67767777;
        System.out.println(ulkeNufusu);
        //sout yaz enter a bas ==>System.out.println();  ekranina gelir
        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        long cellNumberInHumanBody = 879999999999L;
        //Note: Eger long a atadiginiz ger int lerin araliginda ise sonuna L koymaya gerek yok
        //ama int lerin disinda ise bunu bununlong oldugunu java söylemeliyiz ve L ilave edecegiz
        long weigtOfSun = 89898;
        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        float gömlekFiyati = 299.99F; // fload olusturuldugunda sonuna F veya f koymaliyiz
        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double weightCell = 0.0000000000000001567;
        System.out.println(weightCell);






    }

}
