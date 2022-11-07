package questionbank01;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        char m = 'm';
        switch (m) {
            case 'A':
                System.out.println("First letter");
                break;
            case 'B':
                System.out.println("Second letter");
            case 'C':
                System.out.println("Third letter");
                break;
            case 'D':
                System.out.println("Fourth letter");
            default:
                System.out.println("What kind of letter is this?");
        }
    }
}