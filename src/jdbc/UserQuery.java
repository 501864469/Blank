package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserQuery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "xmz020920");
             Statement s = c.createStatement();

        ) {
            String name = "xmz";
            String password = "020920";
            String sql = "select *from user where name='" + name + "'and password='" + password + "'";
            ResultSet rs = s.executeQuery(sql);
            if (rs.next())
                System.out.println("账号密码正确");
            else
                System.out.println("账号密码错误");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
