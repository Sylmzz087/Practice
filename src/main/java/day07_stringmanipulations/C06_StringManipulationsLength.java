package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {


/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */
        //havva== length 5
        //          index  4


        String cumle = "Bugun hava yagmurlu";

        System.out.println(cumle.length());//19


        Scanner input = new Scanner(System.in);
       /* System.out.println("Isminizi giriniz");
        String str = input.nextLine();
        System.out.println("Soyismizi giriniz");
        String str1 = input.nextLine();

        if (str.length() > str1.length()) {
            System.out.println("Isminiz soyisminizden daha uzundur");

        } else if (str.length() < str1.length()) {
            System.out.println("soyIsminiz isminizden daha uzundur");

        } else if (str.length() == str1.length()) {
            System.out.println("isminiz soy isminizle esittir");

        } else {
            System.out.println("Anlamsiz");
        }*/

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String harf=input.nextLine();
        System.out.println(harf.length());
        if (harf.length()==4){
            char bir = harf.charAt(0);
            char iki = harf.charAt(1);
            char uc = harf.charAt(2);
            char dort = harf.charAt(3);

            System.out.println("Tersten yazilmis hali : " + dort + uc + iki + bir);
        }else if (harf.length()>4) {
            System.out.println("Girdiniz kelime 4 karakterden fazladir");
        }else if(harf.length()<4){
            System.out.println("Girdiginiz kelime 4 karakterden azdir");
        }





    }
}
