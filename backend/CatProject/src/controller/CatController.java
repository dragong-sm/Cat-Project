package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import exception.NotExistException;
import model.dto.CatDTO;
import service.CatService;
import org.json.*;

@WebServlet("/cat")
public class CatController {
  public void doService(HttpServletRequest request, HttpServletResponse response) throws SQLException, NotExistException, IOException{
    System.out.println("서버 구동됨");
	  
    request.setCharacterEncoding("UTF-8");
    String command = request.getParameter("command");

    // 고양이 정보 요청시 request template
		// {command: getCatInfo, catId: 1} -> CatController로 보냄 -> getCat(1) 호출해서 DTO 넘겨줌
		// {command: getCatPics, catId: 1} -> PictureController -> getCatPics(1) 호출해서 넘겨줌		
		if (command == null) {
      //에러처리
    }
    if (command == "getCatInfo") {
      int catId = Integer.parseInt(request.getParameter("catId")); //String으로 request.getParameter("catId")를 했을 때, int로 형변환해줘야함
      CatDTO cat = CatService.getInstance().getCat(catId);
      //cat을 json으로 변환
        //JsonObject를 사용해서 변환
        JSONObject json = new JSONObject();
        json.put("catId", cat.getId());
        json.put("species", cat.getSpecies());
        json.put("description", cat.getDescription());
        json.put("temper", cat.getTemper());
        json.put("hairType", cat.getHairType());
        json.put("origin", cat.getOrigin());
        json.put("size", cat.getSize());

      //json을 response에 담아서 보내기
      response.setContentType("application/json");
      response.setCharacterEncoding("UTF-8");
      response.getWriter().write(json);
    }
  }
} 