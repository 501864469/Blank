import java.io.IOException;
import java.io.InputStream;
public class Demo {
        public static void main(String[] args) {
            // 控制台输入
            try (InputStream is = System.in;) {
                while (true) {
                    // 敲入a,然后敲回车可以看到
                    // 97 13 10
                    // 97是a的ASCII码
                    // 13 10分别对应回车换行
                    int i = is.read();
                    System.out.println(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

