package com.sd.fw.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection(String dirverClassName, String url, String id, String passwd){
		Connection conn = null;
		try{
			Class.forName(dirverClassName);
			conn = DriverManager.getConnection(url, id, passwd);
		}catch(Exception ex){
			System.out.println(ex);
			throw new RuntimeException("db 접속시 오류 발생 : " + ex);
		}
		return conn;
	}
	
	public static Connection getConnection(String url, String id, String passwd){
		return getConnection("", url, id, passwd);
	}
	
	//Company 2
	public static Connection getConnection(){
		return getConnection("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
	}
	
//	//Court
//	public static Connection getConnection(){
//		return getConnection("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@192.168.128.11:1521:orcl", "stc00", "stc00");
//	}
	
	public static void main(String args[]){
		Connection conn = DBUtil.getConnection();
		if(conn != null)
			System.out.println("ok");
		else
			System.out.println("error");
	}
	
}


/*
tomcat DataSource 설정
<Resource auth="Container" name="shopDS"
type="javax.sql.DataSource" username="java00" password="java00"
driverClassName="oracle.jdbc.driver.OracleDriver" maxIdle="2"
maxWait="5000" validationQuery="SELECT SYSDATE FROM DUAL"
url="jdbc:oracle:thin:@127.0.0.1:1521:ora9" maxActive="1" />

*/