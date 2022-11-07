package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

     /*  System.out.println("Dort basamakli bir sayi giriniz...");

       int sayi=input.nextInt();

      int sayi1=sayi%10;
       int sayi2=sayi/1000;

        System.out.println(sayi1+sayi2);*/



        /*/System.out.println("lutfen bir karakter giriniz");

        char sh=input.next().charAt(0);
        System.out.println("  "+ sh + "  ");
        System.out.println(" "+ sh + " "+sh+" ");
        System.out.println(sh+" "+ sh + " "+sh);

        System.out.println(sh+" "+ sh + " "+sh);
        System.out.println(" "+ sh + " "+sh+" ");
        System.out.println("  "+ sh + "  ");*/

      /*  System.out.println("3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);//3
        sayi=sayi / 10;
        //sayi /= 10;
        System.out.println("ikiBas = " + sayi);//85
        // 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);//5
        sayi = sayi / 10;
        // 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);*/




        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

        System.out.println("lutfen 5 basamakli bir sayi giriniz");
        int besBasamakliSayi=input.nextInt();
        int ilkIkiRakam=besBasamakliSayi/1000;
        System.out.println("ilkIkiRakam = " + ilkIkiRakam);
        int ilkIkiSonuc=(ilkIkiRakam%10)+(ilkIkiRakam/10);
        System.out.println("ilkIkiSonuc = " + ilkIkiSonuc);
        int sonIkiSonuc=besBasamakliSayi%100;
        System.out.println("sonIkiSonuc = " + sonIkiSonuc);
        int sonuc=(sonIkiSonuc%10)+(sonIkiSonuc/10);
        System.out.println("sonuc = " + sonuc);
        int toplam=ilkIkiSonuc+sonuc;
        System.out.println("toplam = " + toplam);

    }

}
