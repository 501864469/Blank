package jdbc;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class ExecuteQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","xmz020920");
             Statement s=c.createStatement();){
            String sql="select *from hero";
            ResultSet rs=s.executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString(2);
                float hp=rs.getFloat("hp");
                int damage=rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d\t",id,name,hp,damage);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
