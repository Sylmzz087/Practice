package questionbank01;

public class Variables01 {
    public static void main(String[] args) {
        // SORU 1 :

        double kitap1=15;
        double kalem1=10.5;
        double defter1=33.99;

        System.out.println("Toplam maliyet " +(kitap1+kalem1+defter1));

        //SORU 2:

        float x = 26F;
        long y =34L;
        int z =13;

        System.out.println("Degiskenlerin carpimi :"+ x*y*z );

        //Soru 3
        int anaPara=2400;
        double oran=1.5;
        int yilDegeri=20;
        double basitFaiz = anaPara * oran * yilDegeri/100;

        System.out.println("basitFaiz = " + basitFaiz);

        //Soru 4
        String a = "Sonuc";
        long b = 30l;
        long c = 50l;

        System.out.println(a +  " : "+ b+c);
        System.out.println(a +  " : "+ b* c);

        //Soru 5
        boolean p = true;
        boolean o = false;
        System.out.println(p + " " +  o);

        //Soru 6
        long kitap=70l;
        long defter=85l;
        long laptop=90l;
        long toplamFiyat = 2*kitap+4*defter+3*laptop;

        System.out.println("toplamFiyat = " + toplamFiyat);






    }
}
