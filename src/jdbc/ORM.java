package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Charactor.Hero;
public class ORM {
    public static Hero get(int id) {
        Hero hero = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testbase?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "xmz020920");
             Statement s = c.createStatement();) {
            String sql = "select * from hero where id = " + id;

            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }
    public static void main(String[] args) {

        Hero h = get(2);
        System.out.println(h.name);

    }
}


