package day02variables;

public class day01veriables {
    public static void main(String[] args) {
        // Variable nasil olusturulur?
        //Data Type  +  Variable Name + Assignment Operator(Atama Operatoru) + Variable degeri  + noktali virgul;
        int age = 19;
        System.out.println(age);
        // System.out.println(); yazdirmanin kisa yolu ==> sout yaz enter a bas


        /*
        Javada temelde iki tip data vardir;
        1)primitve data type;
            char, boolean, byte, short, int, long, float, double

        2)non-primitive data type;
            String
         */

        //char data type: 2 byte
        // Tek karakterler icin kullanilir. Ornegin ==> A ,a, ?, 5
        //Note: char data typeinda degerler tek tirnak icine konulmalidir
        //Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Data Type  +  Variable Name  + Assignment Operator(Atama Operatoru) + Variable degeri  + noktali virgul;

        char isminIlkHarfi = '5';
        System.out.println(isminIlkHarfi);

        //boolean data type:
        //boolean lar sadece iki farkli deger alabilir; true (dogru) veya false(yanlis)
        //Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin =  false ;
        System.out.println(emeklimisin);

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 13;
        System.out.println(ogrenciYasi);

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilirJava'da non-primitive (referans) veri tipleri, daha karmaşık veri yapılarını ve nesneleri temsil eden veri tipleridir. Bu tipler, bellekte gerçek verilerin kendisi yerine bu verilerin referanslarını (adreslerini) içerirler. İşte Java'da kullanılan bazı önemli non-primitive veri tipleri:
        //
        //String: Metinsel verileri temsil eder. Birçok karakterden oluşan dizilimleri ifade eder.
        //
        //Array (Dizi): Aynı türdeki öğeleri içeren sıralı veri koleksiyonunu temsil eder.
        //
        //Class (Sınıf): Nesnelerin şablonlarını oluşturan ve nesnelerin durumlarını ve davranışlarını tanımlayan yapılardır.
        //
        //Interface (Arayüz): Metot imzalarını tanımlayan ve bir sınıfın uygulamasını gerektiren bir sözleşmeyi ifade eder.
        //
        //Enum (Sabitler Kümesi): Belirli bir veri türünde sınırlı ve önceden tanımlanmış sabit değerleri içerir.
        //
        //Arraylist, LinkedList vb. (Veri Yapıları): Farklı veri yapılarını temsil eder ve verilerin depolanma ve erişim biçimini sağlar.
        //
        //Map (Harita): Anahtar-değer çiftlerini ilişkilendiren veri yapısıdır. Anahtarlar benzersizdir ve değerlere erişim sağlar.
        //
        //Set (Küme): Tekrarlayan elemanlara izin vermeyen veri yapısıdır.
        //
        //Custom Objects (Özel Nesneler): Kendi tanımladığınız sınıflardan türeyen nesneleri temsil eder.
        //
        //Non-primitive veri tipleri, Java programlamasında daha karmaşık yapıların oluşturulmasını ve yönetilmesini sağlar. Örneğin:
        //
        //java
        //Copy code
        //String myString = "Merhaba, Dünya!";
        //int[] numbers = {1, 2, 3, 4, 5};
        //Person person = new Person("John", 30); // Kendi tanımladığınız Person sınıfı
        //ArrayList<String> names = new ArrayList<>();
        //names.add("Alice");
        //names.add("Bob");
        //
        //HashMap<String, Integer> scores = new HashMap<>();
        //scores.put("Math", 95);
        //scores.put("Science", 87);
        //Bu örneklerde, farklı türlerdeki non-primitive veri tiplerini görebilirsiniz. Non-primitive tipler, nesnelerin oluşturulması ve işlenmesi konusunda daha fazla esneklik sağlar, ancak aynı zamanda daha fazla bellek tüketebilir ve daha karmaşık hale gelebilir.
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1300 ;
        System.out.println(siteNufusu);

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 1818181818;
        System.out.println(ulkeNufusu);

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 894989545454545L;
        //Note:Eger long 'a atadiginiz deger int' lerin araliginda ise sonuna L koymaya gerek yok,
        //ama int lerin araligi disinda ise bunun long oldugunu sonuna L koyarak javaya söylemeliyiz

        long weightOfSun = 12344545;

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //fload olusturdugunuzda sonuna F,f koyulmalidir cnkü java ondalikli sayilari otomatik olarak double kabul eder
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float gomlekFiyati = 299.99F;
        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double weightCell = 0.00000000000000015;
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
       // double weightCell = 0.000000000015;//ayni isimde 2 tane variable olamaz
        System.out.println(weightCell);
        //Note ==> "E" exponent (üs demek) 1.5 carpi 10 uzeri -11;

}}//parantezler genel olarak buyuk bir sorun koymayi unutmayalim
