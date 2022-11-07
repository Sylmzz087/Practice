package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);//False



        boolean sonuc1=5>4 && 7<9&& 6+3==9 &&5+2!=8;//true
        System.out.println("sonuc1 = " + sonuc1);



        boolean sonuc2= 5>4 && 7>9&&6+3==9&&5+2!=8;//false
        System.out.println("sonuc2 = " + sonuc2);


        int sayi1=15;

        System.out.println(sayi1>10&&sayi1<20);


        int sayi2=5;
        System.out.println(sayi2<10&&20>sayi2);


    }//main
}//class
