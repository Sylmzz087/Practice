package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere sayilar isteyin .Sayi adedi 10' u ve ya toplami 500'u gecerse "bu kadar sayi
        yeter ..... adet sayi girdiniz toplami ...."   /interwiev question

         */

       Scanner input = new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac = 0;

        while (sayac<=10 && toplam<501){
            System.out.println("lutfen toplanmak uzere sayi giriniz");
            sayi=input.nextInt();
            toplam += sayi;
            sayac++;
        }
        if (toplam>500){
            System.out.println(sayac + " sayi girdiniz"+ "toplami = " + toplam);
        }else System.out.println("Yeterli sayi girdiniz " + sayac + " adet sayi girdiniz toplami " + toplam);













    }
}
