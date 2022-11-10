package controller;

import service.PictureService;

public class PictureController {
	private static PictureController instance = new PictureController();
	private PictureService pictureService = PictureService.getInstance();
	
	private PictureController() {}
	
	public static PictureController getInstance() {
		return instance;
	}
	
	
}