package service;

import java.sql.SQLException;
import java.util.ArrayList;

import exception.NotExistException;
import model.dao.PrimaryDAO;
import model.dto.CatDTO;

public class CatService {
	private static CatService instance = new CatService();
	
	private CatService(){}
	
	public static CatService getInstance() {
		return instance;
	}

 //I. 에러처리를 위한 메소드
	// 1. 검색시 해당 고양이(품종)이 존재하지 않는 경우
 public void notExistCat(int cid) throws SQLException, NotExistException {
	CatDTO cat = PrimaryDAO.searchCat(cid);
	if(cat == null) {
		throw new NotExistException("존재하지 않는 고양이입니다.");
	}
 }
 // 2. insert/update시 해당 고양이(품종)이 이미 존재하는 경우
	public void alreadyExistCat(int cid) throws SQLException, NotExistException {
		CatDTO cat = PrimaryDAO.searchCat(cid);
		if(cat != null) {
			throw new NotExistException("이미 존재하는 고양이입니다.");
		}
	}
	// ------------------------------------------------------------------------------------ //

	//II. DAO를 이용한 작업 수행

	//1. getCat();
	public CatDTO getCat(int id) throws SQLException, NotExistException {
		notExistCat(id); // 먼저 고양이가 존재하는지 확인 및 에러처리; 다만 이렇게 하면 search메소드가 두 번 호출되기때문에 비효율적이다. -> *나중에 수정 요망
		return PrimaryDAO.searchCat(id);
}

	//2. getAllCats();
	public ArrayList<CatDTO> getAllCats() throws SQLException {
		return PrimaryDAO.searchAllCats();
	}

	//3. insertCat();
	public void insertCat(CatDTO cat) throws SQLException, NotExistException {
		alreadyExistCat(cat.getId()); //먼저 해당 고양이가 존재하는지 확인 및 에러처리
		PrimaryDAO.insertCat(cat);
	}

	//4. updateCat();
	public void updateCat(CatDTO cat) throws SQLException, NotExistException {
		alreadyExistCat(cat.getId());
		PrimaryDAO.updateCat(cat);
	}

	//5. deleteCat();
	public void deleteCat(int id) throws SQLException, NotExistException {
		notExistCat(id);
		PrimaryDAO.deleteCat(id);
	}
 }	
