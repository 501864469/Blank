package Socket;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try{
            //连接到本机的8888端口
            Socket s=new Socket("127.0.0.1",8888);
//            System.out.println(s);
            //打开输出流
            OutputStream os=s.getOutputStream();
            //把输出流封装在DataOutputStream中
            DataOutputStream dos = new DataOutputStream(os);
            //使用Scanner读取控制台的输入，并发送到服务端
            Scanner sc = new Scanner(System.in);

            String str = sc.next();
            dos.writeUTF(str);
//            //发送数字110到服务端
//            os.write(110);
//            os.close();
            s.close();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
