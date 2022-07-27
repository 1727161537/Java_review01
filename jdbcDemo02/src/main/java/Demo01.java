import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql://localhost:3306/booksystem";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //执行sql语句
        String sql = "update book set bookName ='java' where bookId = 5";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        connection.close();
        statement.close();
    }
    //
}
