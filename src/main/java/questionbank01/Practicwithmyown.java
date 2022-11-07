package questionbank01;

public class Practicwithmyown {
    public static void main(String[] args) {
    //32. Write a Java program to compare two numbers. Go to the editor
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output

        //25 != 39
        //25 < 39
        //25 <= 39


        int num1=15;
        int num2=17;

        System.out.println(num1>num2);
        System.out.println(num1!=num2);
        System.out.println(num1<=num2);

        if(num1>num2){
            System.out.println("Taha tam bi uckagitcidir");
        } else if (num2>=num1) {
            System.out.println("IT isinde ekmek yok");

        }else{
            System.out.println("nothing");
        }




    }

}
