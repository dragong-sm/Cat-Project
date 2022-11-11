package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.PictureDTO;

import util.DBUtil;

public class PictureDAO {
  // 추가
  public static PictureDTO insertPicture(PictureDTO pictureDTO) {
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
        return pictureDTO;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      DBUtil.close(con, pstmt);
    } return null;
    }
  
  // 삭제
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
  
  // 수정
  public static boolean updatePicture(String picUrl, int primaryTbId, int picId) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;

    try {
      con = DBUtil.getConnection();
      String sql = "UPDATE PICTURES_TB SET PIC_URL = ?, PRIMARY_TB_ID_FK = ? WHERE PIC_ID_PK = ?";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, picUrl);
      pstmt.setInt(2, primaryTbId);
      pstmt.setInt(3, picId);
      int result = pstmt.executeUpdate();

      if (result == 1) {
        return true;
      }
  } finally {
    DBUtil.close(con, pstmt);
  } return false;
  }
  
  // 조회
  public static String searchPicture(int pk) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rset = null;
    String pictureUrl = null;
    
    try {
      String idStr = String.valueOf(pk);
      
      con = DBUtil.getConnection();
      String sql = "SELECT PIC_URL FROM PICTURES_TB WHERE PIC_ID_PK = ?";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, idStr);
      rset = pstmt.executeQuery();

      if (rset.next()) {
    	  pictureUrl = rset.getString("PIC_URL");
      }
  } finally {
    DBUtil.close(con, pstmt);
  } return pictureUrl;
  }

  //FK인 PRIMARY_TB_ID_FK로 검색시 해당하는 사진들을 모두 검색해주는 메소드
  public static ArrayList<String> searchPictureByFK(int id) throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rset = null;
    
    try {
      String idStr = String.valueOf(id);

      con = DBUtil.getConnection();
      String sql = "SELECT PIC_URL FROM PICTURES_TB WHERE PRIMARY_TB_ID_FK = ?";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, idStr);
      rset = pstmt.executeQuery();
      ArrayList<String> pictureUrlList = new ArrayList<String>();		  
      while (rset.next()) {
          String url = rset.getString("PIC_URL");
          pictureUrlList.add(url);
        }
        return pictureUrlList;
  } finally {
    DBUtil.close(con, pstmt);
  			} 
  }

}
