package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.dto.PictureDTO;
//PictureDTO의 필드명 :  
  //PIC_ID_PK
  //PIC_URL : 사진 url 주소 
  //PRIMARY_TB_ID_FK : 외래키 (Cat테이블의 ID_PK)
import util.DBUtil;

public class PictureDAO {
  public static boolean insertPicture(PictureDTO pictureDTO) {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      con = DBUtil.getConnection();
      String sql = "INSERT INTO PICTURES_TB VALUES(?, ?, ?)";
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, pictureDTO.getPicId());
      pstmt.setString(2, pictureDTO.getPicUrl());
      pstmt.setInt(3, pictureDTO.getPrimaryTbId());
      int result = pstmt.executeUpdate();

      if (result == 1) {
        return true;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBUtil.close(con, pstmt);
    } return false;
    }
  public static boolean deletePicture(int id) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      //id를 string으로 변환
      String idStr = String.valueOf(id);

      con = DBUtil.getConnection();
      String sql = "DELETE FROM PICTURES_TB WHERE PIC_ID_PK = ?";
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

  public static boolean updatePicture(PictureDTO pictureDTO) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      String idStr = String.valueOf(pictureDTO.getPicId());

      con = DBUtil.getConnection();
      String sql = "UPDATE PICTURES_TB SET PIC_URL = ?, PRIMARY_TB_ID_FK = ? WHERE PIC_ID_PK = ?";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, pictureDTO.getPicUrl());
      pstmt.setInt(2, pictureDTO.getPrimaryTbId());
      pstmt.setString(3, idStr);
      int result = pstmt.executeUpdate();

      if (result == 1) {
        return true;
      }
  } finally {
    DBUtil.close(con, pstmt);
  } return false;
  }

  public static boolean searchPicture(int pk) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      String idStr = String.valueOf(pk);

      con = DBUtil.getConnection();
      String sql = "SELECT * FROM PICTURES_TB WHERE PIC_ID_PK = ?";
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

  //FK인 PRIMARY_TB_ID_FK로 검색시 해당하는 사진들을 모두 검색해주는 메소드
  public static boolean searchPictureByFK(int fk) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      String idStr = String.valueOf(fk);

      con = DBUtil.getConnection();
      String sql = "SELECT * FROM PICTURES_TB WHERE PRIMARY_TB_ID_FK = ?";
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
