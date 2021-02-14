import models.Cipher;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to cipher or decipher the text? ");
        String cipherChoice = scan.nextLine();
        String choice = cipherChoice.toLowerCase();

        System.out.println("Enter text:");
        String text = scan.nextLine();

        System.out.println("Enter password: ");
        int pass = scan.nextInt();


        Cipher textToCipher = new Cipher(text, pass);

        if(cipherChoice.equals("cipher")){
            System.out.println(textToCipher.cipherWord());
        } else if(cipherChoice.equals("decipher")){
            System.out.println(textToCipher.decipherWord());
        } else{
            System.out.println("Sorry. We do not recognize your input. Please try again");
        }

    }
}
