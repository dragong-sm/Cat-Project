package service;

public class PictureService {
	private static PictureService instance = new PictureService();
	
	private PictureService(){}
		
	public static PictureService getInstance() {
		return instance;
	}
}