package day03_ifStatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("bir sayi giriniz");
        int sayi1= input.nextInt();
        System.out.println("2. syiyi giriniz");
        int sayi2= input.nextInt();

        System.out.println("lutfen \n toplama icin 1 \n cikarma icin 2\n bolme icin 3\n carpma islemi icin 4");

        int islem=input.nextInt();

        if (islem==1) {
            System.out.println(sayi1 + sayi2);
        } else if (islem==2) {
            System.out.println(sayi1 - sayi2);
        }else if (islem==3) {
            System.out.println(sayi1 / sayi2);
        } else if (islem==4) {
            System.out.println(sayi1 * sayi2);
        }else {
                System.out.println("uygun bir sayi giriniz");
        }
        }

    }//main
//class
