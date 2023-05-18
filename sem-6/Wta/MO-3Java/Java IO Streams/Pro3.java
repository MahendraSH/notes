import java.io.PrintWriter;

public class Pro3 {
    public static void main(String[] args) {
        PrintWriter pw =new PrintWriter(System.out, true);
        pw.println("some things ");
        pw.print("Some");
        pw.println();
        pw.write('m');
        pw.close();
    }
}
