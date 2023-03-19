package jdbc;
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class ExecuteSql {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","xmz020920");
            Statement s=c.createStatement();
            String sql="insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);
            System.out.println("执行插入语句成功");
            s.close();
            c.close();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
//        }finally{
//            if(s!=null)
//            try{
//                    s.close();
//                }catch (SQLException e){
//                    e.printStackTrace();
//                }
//            if(c!=null)
//                try{
//                    c.close();
//                }catch (SQLException e){
//                    e.printStackTrace();
//                }
        }
    }
}
