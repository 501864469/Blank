package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestSocket {
    public static void main(String[] args){
        try {
            InetAddress host = InetAddress.getLocalHost();
            String ip = host.getHostAddress();
            System.out.println("本机Ip地址:" + ip);
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}
