package day07_stringmanipulations;

public class C03_StringManipulationReplace {

             /*replace()
     Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
     Sonuc String'dir..
      */

       /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space tum bosluklar
    \\S   ==> space disindaki hersey  */

        public static void main(String[] args) {


            //rakam haricindekileri silin

            String pwd = "$45.99";
           String pwd1= pwd.replaceAll("\\D", "" );
            System.out.println(pwd1);

            // Verilen cumleyi  * ile gizleyin, 10 karakterden sonrasini yazdirin

            String cumle = "Her dert Java gibi olsa ";
            String cumle1= cumle.replaceAll("\\w","*").substring(10);
            System.out.println(cumle1);

            //a harfini @ isareti ile degistir
            String ders="olaganustu";

            String newDers = ders.replaceAll("a","@");
            System.out.println(newDers);

            /** ReplaceFirst
             * Replace ile aynı sadece ilk bulunan karakteri değiştirir
             */
            String txt = "Merhaba Dunya";

            //txt'deki butun 'a' lari 'e' ile degistirin

            String newTxt =txt.replaceAll("a","e");

            System.out.println(newTxt);

            //txt'deki ilk bulunan 'a' yi 'e' ile degistirin

            String newTxt1 =txt.replaceFirst("a","e");

            System.out.println(newTxt1);

     /* replaceAll()
       Metin icerisindeki bir dizi kumesini degistirme .Sonuc String'dir..

      */
            //bir dizi kumesini degistirme>>>> Kalem yerine biber yazdirin
            String str="Dolma Kalem";

           String newStr= str.replaceAll("Kalem","Biber");

            System.out.println(newStr);





          /*
       contains()
       Metin icerisinde arama yapmamizi saglar.
       bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
       Sonuc boolean dir.

       equals()
       2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.

       equalsIgnorecase()
       equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
      */

            String str3 = "Merhaba";
            String st = "Merhaba";

        boolean esitMi=    str3.equals(st);
        boolean icerirMi=    str3.contains(st);
        boolean harflerinDuzeni=    str3.equalsIgnoreCase(st);

            boolean birebiresitMi=str3.equals("Merhaba");
            System.out.println("birebiresitMi = " + birebiresitMi);//true
            System.out.println(str3.equals(st));//true
            System.out.println(str3.equals("merhaba"));//false
            System.out.println(str3.equalsIgnoreCase("MerHaBa"));//true
            System.out.println(str3.equalsIgnoreCase("Merha"));//false


            System.out.println(esitMi);
            System.out.println(icerirMi);
            System.out.println(harflerinDuzeni);

        }
    }

