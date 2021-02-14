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
                int shiftedChar = charCode + this.getKey();

                if (shiftedChar > 'Z') {
                    shiftedChar = charCode - (26 - this.getKey());
                }

                letter = (char) shiftedChar;
                cipheredWord = cipheredWord + letter;
            } else {
                cipheredWord += newArr[i];
            }



        }
        return cipheredWord;
    }

    public String decipherWord() {
        String decipheredWord = "";
        char letter;

        char[] newArray = this.toArray();

        for (int i = 0; i < newArray.length; i++) {
            int index = (char)(newArray[i]);
            if(index >= 'A' && index <= 'Z'){
                int newIndex = index - this.getKey();

                if(newIndex < 'A'){

                    newIndex = index + 26 - this.getKey();

                }

                letter = (char)newIndex;
                decipheredWord += letter;
            } else {
                decipheredWord += newArray[i];
            }


        }
        return decipheredWord;
    }
}
