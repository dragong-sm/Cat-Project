package model.dto;

public class CatDTO {
  // Cat이 갖는 속성
    /*  ID_PK : primary key(int, auto_increment)
        SPECIES : String  (VARCHAR(45)) 종명칭
        DESCRIPTION : STRING (VARCHAR(200)) 설명
        TEMPER : STRING (VARCHAR(45)) 성격
        HAIR_TYPE : ENUM (단모종, 장모종, 기타)
        ORIGIN : STRING (VARCHAR(45)) 출생지
        SIZE : STRING (VARCHAR(45)) 
      */

    public enum HairType {
        단모종, 장모종, 기타 //enum
    }

    private int id; //※주의점 : id(ID_PK)는 auto_increment이므로, DB에 저장할 때는 id값을 넣지 않는다. (id값은 DB에서 자동으로 생성되기 때문)
    private String species;
    private String description;
    private String temper;
    private HairType hairType; //※ hairType(HAIR_TYPE)은 enum이므로, DB에 저장할 때는 hairType.name()을 넣는다.
    private String origin;  
    private String size;

    //생성자 선언
    public CatDTO(int id, String species, String description, String temper, HairType hairType, String origin,
        String size) {
      this.id = id;
      this.species = species;
      this.description = description;
      this.temper = temper;
      this.hairType = hairType;
      this.origin = origin;
      this.size = size;
    }

    public CatDTO(String species, String description, String temper, HairType hairType, String origin,
    String size) { //auto_increment인 id값은 생성자에서 제외하고 생성 가능하도록
      this.species = species;
      this.description = description;
      this.temper = temper;
      this.hairType = hairType;
      this.origin = origin;
      this.size = size;
}

    //getter, setter 선언
    public CatDTO() {
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getSpecies() {
      return species;
    }

    public void setSpecies(String species) {
      this.species = species;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getTemper() {
      return temper;
    }

    public void setTemper(String temper) {
      this.temper = temper;
    }

    public HairType getHairType() {
      return hairType;
    }

    //String을 받아서 해당하는 enum hairType으로 지정
    public void setHairType(String hairType) {
      if(hairType.equals("단모종")) {
        this.hairType = HairType.단모종;
      } else if(hairType.equals("장모종")) {
        this.hairType = HairType.장모종;
      } else {
        this.hairType = HairType.기타;
      }
    }

    public String getOrigin() {
      return origin;
    }

    public void setOrigin(String origin) {
      this.origin = origin;
    }

    public String getSize() {
      return size;
    }

    public void setSize(String size) {
      this.size = size;
    }

    //toString
    @Override
    public String toString() {
      return "CatDTO [id=" + id + ", species=" + species + ", description=" + description + ", temper=" + temper
          + ", hairType=" + hairType + ", origin=" + origin + ", size=" + size + "]";
    }
}
