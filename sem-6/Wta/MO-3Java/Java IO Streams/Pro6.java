import java.io.*;
import java.util.Scanner;

public class Pro6 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Enter fileName to be copied from  ");
        System.out.println("Enter FileName to be written to ");

        Scanner cin = new Scanner(System.in);
//        FileOutputStream fi= new FileOutputStream(new File(cin.next()));
//        fi.write('x');
//        can only write one char
        String c1 = cin.next();
        String c2= cin.next();

        BufferedReader fin = new BufferedReader(new InputStreamReader( new FileInputStream(new File(c1))));
        BufferedWriter fout = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(new File(c2))));

        String s ;
        while ((s= fin.readLine())!=null)
        {
            fout.write(s);
            fout.newLine();
            s=null;
        }


    fin.close();
        fout.close();

    }
}
