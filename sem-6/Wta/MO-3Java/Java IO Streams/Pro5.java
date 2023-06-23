import java.io.*;
import java.util.Scanner;

public class Pro5 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        System.out.println("enter file name ");
        Scanner cin = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(new File(cin.next())));
        String line;
        int countLine=0;
        int countWords=0;
        int countChars =0;
    
        while ((line = br.readLine()) != null) {

            System.out.println(line);
            countLine++;
            countWords+=line.split(" ").length;
            countChars += line.length();

        }
        System.out.println("count Line ="+countLine);
        System.out.println("count words ="+countWords);
        System.out.println("count chars ="+countChars);

    }
}
