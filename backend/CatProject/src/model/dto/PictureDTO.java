package model.dto;

public class PictureDTO {

  //Pictures_TB 테이블의 properties:
    //PIC_ID_PK : primary key(int, auto_increment)
    //PIC_URL : String (VARCHAR(200))
    //PRIMARY_TB_ID_FK : foreign key(int) //※주의 : 왜래키이므로 해당 테이블에 insert/update할 때는 먼저 PRIMARY_TB_ID_FK에 해당하는 행이 존재하는지 확인해야 한다.

    private int picId;
    private String picUrl;
    private int primaryTbId;

    //생성자 선언
    public PictureDTO(int picId, String picUrl, int primaryTbId) {
      this.picId = picId;
      this.picUrl = picUrl;
      this.primaryTbId = primaryTbId;
    }

    public PictureDTO() {}

    //getter, setter 선언
    public int getPicId() {
      return picId;
    }

    public void setPicId(int picId) {
      this.picId = picId;
    }

    public String getPicUrl() {
      return picUrl;
    }

    public void setPicUrl(String picUrl) {
      this.picUrl = picUrl;
    }

    public int getPrimaryTbId() {
      return primaryTbId;
    }

    public void setPrimaryTbId(int primaryTbId) {
      this.primaryTbId = primaryTbId;
    }

    @Override
    public String toString() {
      return "PictureDTO [picId=" + picId + ", picUrl=" + picUrl + ", primaryTbId=" + primaryTbId + "]";
    }
}

