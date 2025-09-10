package string;

import java.sql.SQLOutput;

public class exceptionhandling {
    public static void main(String[] args) {
        System.out.println("hello"+m1());

        }
        public static int m1(){

        try{
           return 100;
        }
        catch(Exception e){
           return 1000;
        }
        finally{
            System.out.println("finally");
        }
    }

}
