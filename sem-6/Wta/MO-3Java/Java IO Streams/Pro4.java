import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pro4 {

    public static void main(String[] args) throws FileNotFoundException , IOException {
        System.out.println("Enter fileName ");
        Scanner cin = new Scanner( System.in);
        File file =new File(cin.next());
       FileReader fi = new FileReader(file);
       char []buffer = new char[1024];
           int c ;
       while ((c=fi.read(buffer))!=-1){
           System.out.println(buffer);
       }

    }
}
