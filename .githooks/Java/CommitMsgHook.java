import java.io.*;

public class CommitMsgHook {
    public static void main (String[] args) throws IOException{

        File file = new File(args[0]);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        st = br.readLine();
        System.out.println("length = "+st.length());
        while (st != null){
            System.out.println("Commit message :");
            System.out.println("\""+st+"\"");
            boolean res = (st.length()%2 == 0);
            System.out.println("Nombre de caractère : "+res);

            st = br.readLine();
        }
        System.exit(0);
    }
}