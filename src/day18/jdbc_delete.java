package day18;

import java.sql.*;

public class jdbc_delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1. Driver load ... exception 발생
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver load success!!!");

        //2. Connection & Open
        // driver:IP:portNumber/DB명
        String url = "jdbc:mariadb://localhost:3307/sampledb";
        String uid = "root";
        String pwd = "maria";

        Connection conn = DriverManager.getConnection(url,uid,pwd);
        System.out.println("connection success!!");

        //3. 사용 (DM 명령어)
        String sql = "delete from gift where gno = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, 15);

        int result = pstmt.executeUpdate();

        System.out.println(result + " 개 데이터 삭제 성공함");

        //4. 닫기(자원 변환)
        pstmt.close();
        conn.close();
    }
}
