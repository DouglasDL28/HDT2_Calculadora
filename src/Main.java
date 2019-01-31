import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

     public static String menu = "\t 1. Usar calculadora. \n" +
            "2. Salir del programa.";

    public static void main (String []args){

        boolean wantsToContinue = true;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println(menu);
            int option = input.nextInt();

            switch (option){
                case 1: {
                    BufferedReader reader = new BufferedReader();
                    break;
                }

                case 2: {
                    wantsToContinue = false;
                    break;
                }
            }

        } while (wantsToContinue);

    }
}
