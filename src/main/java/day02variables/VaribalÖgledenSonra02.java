package day02variables;

public class VaribalÖgledenSonra02 {
    //Non-Primitive Data Type
    public static void main(String[] args) {
        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        String ögrenciAdi = "Ali Can" ;

        //Stringler icin default deger (varsayilan deger) null dir
        //null demek 0 degildir. 0 da coding te bir degerdir
        //null hiclik demektir
        //icinde variable veya metod bulunmayan bos bir obje demektir

        //Stringler icin default deger (varsayilan deger) null dir
        //null demek 0 demek degildi. 0 da coding te bir degerdir
        //null hiclik demektir
        //icinde variable veya method bulunmayan bos bir obje demektir


        /*
        interview sorusu ?
        primitive ve non-primitive data type lari arasindaki fark nedir?

        1) primitive ler sadece bizim atadigimiz degeri icerir
           non-primitiveler bizim atadigimiz degeri ve methodlar icerir.

        2) primitiveler kucuk harfle baslar
           non-primitiveler ise buyuk harfle baslar

        3) primitiveleri java uretmistir ve 8 tanedir
           non-primitive leri java ve programcilar uretebilir, sinirsiz sayidadir

        4) primitive ler memory de data typelarina gore sabit boyutta bellek kullanir
           non-primitive ler memory de buyuklugune gore degisen boyutlarda bellek kullanabilir.

         */
        //ögrenci notlari icin 2 adet veraible olusturun ve ekrana yazin
        byte note1=40;
        byte note2=70;
        System.out.println(note1+note2);

    }


}
