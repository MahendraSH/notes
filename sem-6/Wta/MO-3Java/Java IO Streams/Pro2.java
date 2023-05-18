import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the liens press enter to exit ");

        String s= br.readLine();
        while (!s.isEmpty()){
             s=br.readLine();
            System.out.println(s);
        }
    }
}
