package test;

import java.sql.SQLException;

import model.dao.PrimaryDAO;
import model.dto.CatDTO;
import service.CatService;

public class TestView {

	public static void main(String[] args) throws SQLException {
//		CatDTO cat = new CatDTO("코숏", "이런저런설명", "적당함", CatDTO.HairType.단모종, "원산지1", "크기1");
//		PrimaryDAO.insertCat(cat);

			// [부트캠프 홍성민님] [오후 3:05] [
  // {
  //   "id": 0,
  //   "species": "노르웨이숲고양이",
  //   "description": "수백 년의 세월을 거쳐 북유럽의 혹독한 날씨를 견딜 수 있는 방수성 장모로 진화한 것으로 보인다. 성장하는 데에 오래 걸리지만 완전히 어른이 되었을 때의 큼직한 체격은 야성미를 더욱 더해준다.",
  //   "origin": "노르웨이, 자연적 발생",
  //   "personality": "야성적인 면과 상냥한 면을 겸비하고 있다. 사람을 좋아하고 끈끈한 유대를 중시하는 사랑스러운 성격이면서 나무타기를 좋아하는 장난꾸러기다.",
  //   "weight": "5.5~7kg",
  //   "hair": "중장모"
  // },

		//CatDTO 순서 : species, description, personality, hair, origin, weight
	// private String species;
	// private String description;
	// private String temper;
	// private HairType hairType; //※ hairType(HAIR_TYPE)은 enum이므로, DB에 저장할 때는 hairType.name()을 넣는다.
	// private String origin;  
	// private String size;
	CatDTO norwegian = new CatDTO(
		1,
		"노르웨이숲고양이",
		"수백 년의 세월을 거쳐 북유럽의 혹독한 날씨를 견딜 수 있는 방수성 장모로 진화한 것으로 보인다. 성장하는 데에 오래 걸리지만 완전히 어른이 되었을 때의 큼직한 체격은 야성미를 더욱 더해준다.",
		"야성적인 면과 상냥한 면을 겸비하고 있다. 사람을 좋아하고 끈끈한 유대를 중시하는 사랑스러운 성격이면서 나무타기를 좋아하는 장난꾸러기다.",
		CatDTO.HairType.장모종,
		"노르웨이, 자연적 발생",
		"5.5~7kg"
	);
	
	PrimaryDAO.insertCat(norwegian);
  // {
  //   "id": 1,
  //   "species": "스핑크스",
  //   "description": "털이 전혀 없는 것처럼 보이나, 실제로는 복숭아의 털과 같은 매우 짧고 부드러운 털이 나 있다. 턱수염과 눈썹이 있는 경우도 있다. 드물게 꼬리의 끝 부분에...
	}


}