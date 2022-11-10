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
        //jackson 라이브러리 사용
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(cat);
      //json을 response에 담아서 보내기
      response.setContentType("application/json");
      response.setCharacterEncoding("UTF-8");
      response.getWriter().write(json);
    }
  }
} 