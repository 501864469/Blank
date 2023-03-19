package jdbc;

public class TestJDBC {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库加载成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
