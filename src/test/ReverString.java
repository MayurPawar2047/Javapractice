package test;

public class ReverString {

    public static void getRev(String str) {   
        String rev = "";
        char ch;

        for (int i =0; i<= str.length()-1; i++) {  
            ch = str.charAt(i);
            rev = ch+ rev;
        }
        
        System.out.println("Reversed String: " + rev);
    }

    public static void main(String[] args) {
        getRev("Automation"); 
    }
}
