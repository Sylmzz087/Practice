package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

        Scanner input=new Scanner(System.in);

       // System.out.println("Lutfen uzun giriniz");
      //  double uzunKenar=input.nextDouble();
      //  System.out.println( "Lutfen kisa kenari");
//
      //  double kisaKenar=input.nextDouble();




      //  System.out.println("Dikdortgenin Cevresi  : " + uzunKenar*kisaKenar );
       // System.out.println("Dikdortgeninin Alani  :"  + (2*uzunKenar+2*kisaKenar));

      //  System.out.println("Lutfen 3 kenar uzunlugunu giriniz");
       // byte k1=input.nextByte();
      //  byte k2=input.nextByte();
      //  byte k3=input.nextByte();

      //  int cevresi = k1 + k2 + k3;

       // System.out.println("cevresi = " + cevresi);
        System.out.println("Lutfen bir karakter giriniz");
        char ch=input.next().charAt(0);

        System.out.println("\t\t\t"+ch+"\n\t\t"+ch+"\t\t"+ch+"\n\t"+ch+"\t\t"+ch+"\t\t"+ch+"");





    }
}
