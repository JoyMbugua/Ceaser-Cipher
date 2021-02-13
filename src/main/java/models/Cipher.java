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

}
