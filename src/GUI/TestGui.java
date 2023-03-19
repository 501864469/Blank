package GUI;
import javax.swing.JFrame;
import javax.swing.JButton;
public class TestGui {
    public static void main(String[] args){
        JFrame f=new JFrame("lol");
        f.setSize(400,400);
        f.setLocation(200,200);
        //组件设置为绝对定位
        f.setLayout(null);
        JButton b=new JButton("777777");
        b.setBounds(50,50,280,30);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
