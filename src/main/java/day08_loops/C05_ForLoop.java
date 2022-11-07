package day08_loops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
  tekrarlayan kodu yaziniz

 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str = input.next();

        System.out.println("Lutfen kac kere tekrarlanmasini istiyorsaniz giriniz");

        int tkrSayisi=input.nextInt();

        String ilkSonHarf=str.substring(0,1) + str.substring(str.length()-1);

        String output= " ";

        for (int i = 1; i < tkrSayisi; i++) {
              output+=ilkSonHarf;
        }
        System.out.println(output);


    }
}
