package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {

        String str1="Hi";
        System.out.println(str1.isEmpty());//False

        String str2="";
        System.out.println(str2.isEmpty());//True

        String str3=" ";
        System.out.println(str3.isEmpty());//False


        //Kullanicifan alinicaginiz bir string de bosluk karakterinino olup olmadigini test ediniz

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");
        String str4 = input.nextLine();
                if(str4.isEmpty()){
                    System.out.println("Cumlede bosluk yok");
                }else {
                    System.out.println("cumlede bosluk var");
                }



    }
}
