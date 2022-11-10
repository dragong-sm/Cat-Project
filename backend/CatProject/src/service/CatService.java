package service;

import java.sql.SQLException;

import exception.NotExistException;
import model.dao.PrimaryDAO;
import model.dto.CatDTO;

public class CatService {
	private static CatService instance = new CatService();
	
	private CatService(){}
	
	public static CatService getInstance() {
		return instance;
	}

 // 에러처리를 위한 메소드
 public void notExistCat(int cid) throws NotExistException, SQLException {
	CatDTO cat = PrimaryDAO.searchCat(cid);
	if(cat == null) {
		throw new NotExistException("존재하지 않는 고양이입니다.");
	}
 }	
}