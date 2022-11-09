package model.dto;

public class PictureDTO {
	private String picUrl;
	private String picId;
	
	public PictureDTO(String picUrl, String picId) {
		super();
		this.picUrl = picUrl;
		this.picId = picId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicId() {
		return picId;
	}

	public void setPicId(String picId) {
		this.picId = picId;
	}

	@Override
	public String toString() {
		return "PictureDTO [picUrl=" + picUrl + ", picId=" + picId + "]";
	}
	
	
}