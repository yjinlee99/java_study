package day18.jdbc_mvc.connUtil;

import java.sql.*;

public class ConnectionSingletonHelper {
    // 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)
    private static Connection conn;
    private ConnectionSingletonHelper() { }

    public static Connection getConnection(String dsn, String userid, String pwd) {
        //Connection conn = null;

        if( conn != null ) {
            return conn;
        }

        try {
            if( dsn.equals("mysql")) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/SampleDB",     // SampleDB 예시임
                        userid, pwd);

            } else if( dsn.equals("oracle")) {
                Class.forName("oracle.jdbc.OracleDriver");
                conn = DriverManager.getConnection(
                        "jdbc:oracle:thin:@127.0.0.1:1521:xe",
                        userid, pwd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return conn;
        }
    }

    public static void close() throws SQLException {

        if( conn != null ) {
            if( !conn.isClosed() ) {
                conn.close();
            }
        }
    }
}