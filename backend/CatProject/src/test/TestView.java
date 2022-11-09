package test;

import java.sql.SQLException;

import model.dao.PrimaryDAO;
import model.dto.CatDTO;

public class TestView {

	public static void main(String[] args) throws SQLException {
		CatDTO cat = new CatDTO("품종1", "설명1", "성격1", CatDTO.HairType.단모종, "원산지1", "크기1");
		PrimaryDAO.insertCat(cat);
	}

}