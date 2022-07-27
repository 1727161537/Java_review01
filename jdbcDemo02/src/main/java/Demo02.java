import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 设置手动添加事务
 */
public class Demo02 {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/booksystem";
            String username = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, username, password);
            //获取执行对象
            statement = connection.createStatement();
            //开启手动提交事务
            connection.setAutoCommit(false);
            //执行sql语句
            String sql1 = "update book set bookName = 'C++' where bookId = 5";
            statement.executeUpdate(sql1);
            //制造错误
            int a = 10 / 0;
            //执行另一条SQL语句
            String sql2 = "update book set bookName ='C语言' where bookId = 10";
            statement.executeUpdate(sql2);
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                //关闭资源
                connection.close();
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
