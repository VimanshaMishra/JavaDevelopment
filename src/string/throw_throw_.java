package string;

public class throw_throw_ {
    public static void main(String[] args) {
       try{
           withdraw(100,200);
       }
       catch(Exception e){
           System.out.println(e);
       }




    }
    public static void withdraw(int bal, int amount) throws Exception{
        if(bal<amount){
            throw new Exception("my exception");
        }
        System.out.println("successful withdrawal" );
        System.out.println("bal:"+bal);
    }
}
