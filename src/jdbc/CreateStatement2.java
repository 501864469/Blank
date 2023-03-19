package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateStatement2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","xmz020920");
            Statement s=c.createStatement();
            System.out.println("获取Statement对象是:"+s);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
