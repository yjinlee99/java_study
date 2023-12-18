package day17;

import java.sql.*;

public class jdbc_select {
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

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * from gift");

        System.out.println("상품 번호\t상품명\t최저가\t최고가");
        while(rs.next()) {
            int gno = rs.getInt(1);
            String gname = rs.getString("gname");
            int g_s = rs.getInt(3);
            int g_e = rs.getInt("g_end");

            System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" +g_e);
        }

        //4. 닫기(자원 변환)
        rs.close(); stmt.close(); conn.close();
    }
}
