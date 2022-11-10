package service;

public class CatService {
	private static CatService instance = new CatService();
	
	private CatService(){}
	
	public static CatService getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
}