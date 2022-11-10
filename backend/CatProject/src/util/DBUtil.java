package util;

import java.beans.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
  //DB 설정
  static Properties propertiesInfo = new Properties();
	static {
		try {
			propertiesInfo.load( new FileInputStream("db.properties") ); //db.properties 문서에 있는 값을 propertiesInfo에 반영시킨다. db.properties에는 db에 접속하기 위한 URL, USER, PASSWORD 를 기입해뒀다.
			Class.forName(propertiesInfo.getProperty("jdbc.driver")); // 드라이버의 클래스를 등록
				// propertiesInfo.getProperty()가 'jdbc.driver'에 해당하는 값을 반환 ("com.mysql.cj.jdbc.Driver") -> Class.forName()의 매개변수로 넘겨서 해당 이름을 갖는 클래스를 메모리로 로딩
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

  // getConnection() : DB연결 해주는 메소드
  public static Connection getConnection() throws SQLException {  
		return DriverManager.getConnection(propertiesInfo.getProperty("jdbc.url"), 	
											propertiesInfo.getProperty("jdbc.id"), 
											propertiesInfo.getProperty("jdbc.pw")); //위 값을 이용해서 DB 연결
	}


  // close() : DB연결 해제 해주는 메소드.  오버라이딩을 통해 다양한 파라미터를 받을 수 있도록 함.
  public static void close(Connection con) { 
    try {
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static void close(Connection con, PreparedStatement pstmt) { // DB연결 해제 해주는 메소드
    try {
      if(pstmt != null) pstmt.close();
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static void close(Connection con, Statement stmt) {
    try {
      if(stmt != null) ((Connection) stmt).close();
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static void close(Connection con, Statement stmt, ResultSet rs) {
    try {
      if(rs != null) rs.close();
      if(stmt != null) ((Connection) stmt).close();
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
    try {
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace()      ;
    }
  }


  public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
    try {
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(con != null) con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
