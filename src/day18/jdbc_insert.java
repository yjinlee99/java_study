package day18;

import java.sql.*;
import java.util.Scanner;

public class jdbc_insert {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Class.forName("org.mariadb.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/sampledb","root","maria");

        // 3. 사용 ( DML - Insert ) Statement / PreparedStatement
        System.out.println();
//        Statement stmt = conn.createStatement();
        // INSERT INTO gift VALUES(2, '스팸', 800, 1200)
//        String sql = "INSERT INTO gift VALUES(12, '스팸2', 800, 1200)"; // 쿼리문
//        int result = stmt.executeUpdate(sql); // 정상적으로 처리되었는지 ?

        String sql = "INSERT into gift values (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,sc.nextInt());
        pstmt.setString(2, sc.next());
        pstmt.setInt(3,sc.nextInt());
        pstmt.setInt(4, sc.nextInt());

        int result = pstmt.executeUpdate();

        System.out.println(result + " 개 데이터 추가 성공함");

        // 4. 닫기
//        stmt.close();
        pstmt.close();
        conn.close();

        //SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.
    }
}
