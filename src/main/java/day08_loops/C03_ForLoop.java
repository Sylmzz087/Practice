package day08_loops;

public class C03_ForLoop {
    public static void main(String[] args) {

/*
  Kullanicidan bir cumle ve bir harf alin,
  Cumlede verilen harfin kac kere
  kullanildigini bulup, yazdirin

  ORNEK:

  INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e

  OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
 */


        String str1="Java ogrenmek cok guzel.";
        String newStr=str1.toLowerCase();
        char ch='j';
        int sayac = 0;

        for (int i = 0; i <newStr.length() ; i++) {
            if(newStr.charAt(i)==ch){
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede " + ch + " " + sayac + " tanedir. ");
    }
}
