package day07_stringmanipulations;

public class C04_StringManipulationsStartWith {

    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */


        String cumle = "Kazananlar hic hata yapmayanlar degil ,vazgecmeyenlerdir";

        boolean newCumle = cumle.startsWith("K");

        System.out.println(newCumle);

        boolean newCumle1 = cumle.endsWith("dir");

        System.out.println(newCumle1);
    }
}
