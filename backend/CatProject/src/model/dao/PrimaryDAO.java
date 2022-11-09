package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dto.CatDTO;
import util.DBUtil;

public class PrimaryDAO { //DAO : DB와 연동해 데이터를 입력, 수정, 삭제 등을 수행하는 클래스. 여기서 본격적인 SQL 쿼리가 수행됨.
  
  //DB정보
    // table 이름 : PRIMARY_TB
    // 컬럼명 : ID_PK, SPECIES, DESCRIPTION, TEMPER, HAIR_TYPE, ORIGIN, SIZE
      //※주의사항 
        // -ID_PK는 auto_increment이므로, DB에 저장할 때는 id값을 넣지 않는다. (id값은 DB에서 자동으로 생성되기 때문)
        // -HAIR_TYPE은 enum이므로, DB에 저장할 때는 hairType.name()을 넣는다.

  // Insert, Update, Delete methods ...
  // I. 새로운 Cat을 DB에 저장하는 메소드
  public static boolean insertCat(CatDTO cat) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      con = DBUtil.getConnection();
      //insert문은 ID_PK로 인해 컬럼명 명시 필요
      String sql = "INSERT INTO PRIMARY_TB (SPECIES, DESCRIPTION, TEMPER, HAIR_TYPE, ORIGIN, SIZE) VALUES (?, ?, ?, ?, ?, ?)";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, cat.getSpecies());
      pstmt.setString(2, cat.getDescription());
      pstmt.setString(3, cat.getTemper());
      pstmt.setString(4, cat.getHairType().name());
      pstmt.setString(5, cat.getOrigin());
      pstmt.setString(6, cat.getSize());
      int result = pstmt.executeUpdate();


      if (result == 1) { //.executeUpdate() :: Compile된 DML문을 실행시킴. 성공적으로 수행된 경우 1, 실패한 경우 0 을 반환한다.
        return true;
      }
    } finally {
      DBUtil.close(con, pstmt);
    } return false;
    }

    public static boolean deleteCat(int id) throws SQLException { //※ 특이사항 : DTO 대신 id값을 받아서 삭제
      Connection con = null;
      PreparedStatement pstmt = null;
      

      try {
        //id를 string으로 변환
        String idStr = String.valueOf(id);

        con = DBUtil.getConnection();
        String sql = "DELETE FROM PRIMARY_TB WHERE ID_PK = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idStr);
        int result = pstmt.executeUpdate();

        if (result == 1) {
          return true;
        }
    } finally {
      DBUtil.close(con, pstmt);
    } return false;
    }
  }
