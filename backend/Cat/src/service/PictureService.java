package service;

import java.sql.SQLException;
import java.util.ArrayList;

import exception.NotExistException;
import model.dao.PictureDAO;
import model.dto.PictureDTO;

public class PictureService {
	private static PictureService instance = new PictureService();
	
	private PictureService(){}
		
	public static PictureService getInstance() {
		return instance;
	}
	
	// insert/ update시 이미 존재하는 이미지인 경우
	public void notExistPicture(int pk) throws SQLException, NotExistException {
		PictureDTO picture = PictureDAO.searchPicture(pk);
		if(picture != null) {
			throw new NotExistException("이미 존재하는 이미지입니다.");
		}
	 }
	
	// 이미지 한장 조회
	public PictureDTO getPicture(int id) throws SQLException, NotExistException {
		notExistPicture(id); 
		return PictureDAO.searchPicture(id);
	}
	
	// 이미지 여러장 조회
	public ArrayList<String> getPictures(int id) throws SQLException, NotExistException {
		return PictureDAO.searchPictureByFK(id);
	}
	
	// 추가
	public PictureDTO insertPicture(PictureDTO pictureDTO) throws SQLException, NotExistException {
		return PictureDAO.insertPicture(pictureDTO);
	}
	
	// 삭제
	public boolean deletePicture(int id) throws SQLException, NotExistException {
		return PictureDAO.deletePicture(id);
	}
	
	// 수정
	public boolean updatePicture(String picUrl, int primaryTbId, int picId) throws SQLException, NotExistException {
		return PictureDAO.updatePicture(picUrl, primaryTbId, picId);
	}
	
	
}