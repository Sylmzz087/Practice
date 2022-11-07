package day08_loops;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
EX :Kullanicidan bir kelime isteyiniz
 alinan kelimenin karakter dizisinin her harfi ve
 bu harfin karakter dizisi içindeki indexini birer satıra yazdirin

         ORNEK
  Bir kelime giriniz:istanbul

   Karakter        Index
     i              0
     s              1
     t              2
     a              3
     n              4
     b              5
     u              6
     l              7



 */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir Kelime Giriniz");
        String str=input.nextLine();


        int index = 0 ;
        System.out.print("\tKarakter " + "\tIndex ");

        for (int i = 0; i <str.length() ; i++) {
            System.out.println();
            System.out.println("\t \t " + str.charAt(i)+"\t \t" + index);
            index ++ ;
        }

    }
}
