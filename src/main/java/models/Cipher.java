package models;

public class Cipher {
    private String word;
    private int password;

    public Cipher(String word, int key){
        this.word = word;
        this.password = key;
    }

    public String getWord(){

        return this.word;
    }

    public int getKey(){
        return this.password;
    }
    public boolean isPositive(){
        return this.getKey() > 0;
    }
    public char[] toArray(){
        char[] arr = this.word.toUpperCase().toCharArray();

        return arr;
    }

    public String cipherWord() {
        String cipheredWord = "";
        char letter;

        char[] newArr = this.toArray();

        for (int i = 0; i < newArr.length; i++) {
            // convert to ascii
            int charCode = (char)(newArr[i]);

            if (charCode >= 'A' && charCode <= 'Z') {
                // add the password
                int shiftedChar = charCode + this.password;

                if (shiftedChar > 'Z') {
                    shiftedChar = charCode - (26 - this.password);
                }

                letter = (char) shiftedChar;
                cipheredWord = cipheredWord + letter;
            } else {
                cipheredWord += newArr[i];
            }



        }
        return cipheredWord;
    }
}
