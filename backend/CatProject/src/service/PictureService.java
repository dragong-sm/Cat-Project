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
	
	// 조회
	public ArrayList<PictureDTO> searchPictureByFK(int fk) throws SQLException, NotExistException {
		return PictureDAO.searchPictureByFK(fk);
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