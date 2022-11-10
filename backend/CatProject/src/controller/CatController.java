package controller;

import service.CatService;

public class CatController {

	private static CatController instance = new CatController();
	private CatService catService = CatService.getInstance();
	
	private CatController() {}
	
	public static CatController getInstance() {
		return instance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
