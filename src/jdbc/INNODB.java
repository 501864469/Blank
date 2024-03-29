package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class INNODB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "xmz020920");
             Statement s = c.createStatement();) {
            // 有事务的前提下
            // 在事务中的多个操作，要么都成功，要么都失败

            c.setAutoCommit(false);

            // 加血的SQL
            String sql1 = "update hero set hp = hp +50 where id = 1";
            s.execute(sql1);

            // 减血的SQL
            // 不小心写错写成了 updata(而非update)

            String sql2 = "updata hero set hp = hp -1 where id = 1";
            s.execute(sql2);

            // 手动提交
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}