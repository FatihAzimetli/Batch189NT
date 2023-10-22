package day03wrapperconcatenationoperators1;

public class AlistirmaOrnekleri1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Guzel";
        int sayi1 = 5;
        int sayi2 = 3;
        // 8 java yazdirin
        System.out.println((sayi1 + sayi2 + str1));

        //Java 5 guzel yazdirin
        System.out.println(str1 + sayi1+ sayi2 + str2);
        //güzel 15 yazdirin
        System.out.println(str2 + (sayi1*sayi2));
        //2 güzel 15
        System.out.println(sayi1 - sayi2 + str2 +(sayi1*sayi2));
        //53 güzel yazdirin

    }
}
