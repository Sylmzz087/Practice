package day03_ifStatement;

import java.util.Scanner;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf='a';
        char harf2='A';

        System.out.println(harf>harf2);

        char space=' ';
        System.out.println(space+0);
        System.out.println("space = " + (space+0));

        char s='s';
        System.out.println("s = " +( s + 0));

        int ss='S';
        System.out.println("ss = " +(0+ss));

        byte b1 =12;
        byte b2 =-125;
        System.out.println(b1>b2);

        float f1=2.1241412f;
        float f2=3.12324f;

        System.out.println(f1>f2);

        System.out.println(b1>f1);




    }
}
