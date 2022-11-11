package test;

import java.sql.SQLException;

import model.dao.PrimaryDAO;
import model.dto.CatDTO;

public class TestView {

	public static void main(String[] args) throws SQLException {
		CatDTO cat = new CatDTO("코숏", "이런저런설명", "적당함", CatDTO.HairType.단모종, "원산지1", "크기1");
		PrimaryDAO.insertCat(cat);
	}
}