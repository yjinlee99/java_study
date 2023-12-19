package day18.day18_jdbc_mvc.view;

import day18.day18_jdbc_mvc.controller.GiftController;

import java.sql.SQLException;



public class MainEntry {  // view 
	
	public static void main(String[] args) throws SQLException {
		
		GiftController.connect();  // DB 연결
		GiftController.menu();  // 메뉴 호출 
	}
}
