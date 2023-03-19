import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class BufferedStream {
    public static void main(String[] args) {
        File f = new File("D:/LOL.txt");
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw=new FileWriter(f);
                PrintWriter pw=new PrintWriter(fw);
        ) {
            pw.println("f");
            pw.println("u");
            pw.println("c");
            while (true) {
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
