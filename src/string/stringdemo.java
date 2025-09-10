package string;

import java.sql.SQLOutput;

public class stringdemo {
    public static void main(String[] args) {
        String s1= new String("ashwani");
       for(int i=0;i<s1.length();i++){
           System.out.print(s1.charAt(i));
       }
       //reverse of string
        System.out.println();
        for(int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }
}
