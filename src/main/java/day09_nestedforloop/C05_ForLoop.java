package day09_nestedforloop;

import java.util.Scanner;

public class C05_ForLoop {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen String bir ifade giriniz");
            String str = input.nextLine();

            for (int i = 0; i <str.length() ; i++) {//ifadenin karakterlerine bakildi
                if (str.charAt(i)=='a'||str.charAt(i)==' ')  // ifade de 'a' ve ya ' ' (bosluk gorursen atla .
                    continue;
                System.out.print(str.charAt(i));

            }
        }
}