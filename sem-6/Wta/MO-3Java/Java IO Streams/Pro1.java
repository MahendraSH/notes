import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the chars ");
        char c =(char) br.read();
        while (c!='q')
        {

            System.out.println(c);
           c= (char) br.read();

        }
//        System.out.println(c);
    }
}
