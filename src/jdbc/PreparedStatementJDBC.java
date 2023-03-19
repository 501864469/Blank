package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class PreparedStatementJDBC {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql="insert into hero values(null,?,?,?)";
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "xmz020920");

            PreparedStatement ps=c.prepareStatement(sql);)
        {
            ps.setString(1,"纳尔");
            ps.setFloat(2,540.0f);
            ps.setInt(3,78);
            ps.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
