import java.io.*;

public class PrePushHook {
    public static void main (String[] args) throws IOException{

        // Args[0] == local
        // Args[1] == remote

        System.out.println("Local :"+args[0]);
        System.out.println("Remote :"+args[1]);

        boolean res = (args[1].contains("HugoFerry"));
        System.out.println("Bonjour, 'HugoFerry' dans le remote, push accepté");
        System.out.println(res);
        if(res){
            System.exit(0);
        }else {
            System.exit(1);
        }
    }
}