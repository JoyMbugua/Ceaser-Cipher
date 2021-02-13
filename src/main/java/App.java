import models.Cipher;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to cipher or decipher?");
        try{

            String userChoice = scanner.nextLine();
            String choice = userChoice.toLowerCase();

            if(choice.equals("cipher")){
                System.out.println("Enter word to cipher: ");
                String text = scanner.nextLine();

                System.out.println("Enter password: ");
                int key = scanner.nextInt();

                Cipher newCipher = new Cipher(text, key);
                System.out.println("The encryption: " + newCipher.cipherWord());
            } else {
                System.out.println("Sorry. We do not recognize your input. Please try again");
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
