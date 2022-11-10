package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import exception.NotExistException;
import model.dto.CatDTO;
import service.CatService;

@WebServlet("/cat")
public class CatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CatController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("요청 접수 완료");  
	    request.setCharacterEncoding("UTF-8");
	    String command = request.getParameter("command");
			CatDTO cat = null;

			if (command == null) {
	    } //에러처리
	    if (command == "getCatInfo") {
	      int catId = Integer.parseInt(request.getParameter("catId")); //String으로 request.getParameter("catId")를 했을 때, int로 형변환해줘야함
	      try {
			cat = CatService.getInstance().getCat(catId);
		} catch (SQLException | NotExistException e) {
			e.printStackTrace();
		}
				// //cat을 json으로 변환
	      	//1.JsonObject를 사용해서 변환
	      //   JSONObject json = new JSONObject();
	      //   json.put("catId", cat.getId());
	      //   json.put("species", cat.getSpecies());
	      //   json.put("description", cat.getDescription());
	      //   json.put("temper", cat.getTemper());
	      //   json.put("hairType", cat.getHairType());
	      //   json.put("origin", cat.getOrigin());
	      //   json.put("size", cat.getSize());

				//2.jackson의 ObjectMapper를 사용해서 CatDTO를 json으로 변환
				ObjectMapper mapper = new ObjectMapper();
				String json = mapper.writeValueAsString(cat);
				System.out.println(json);


				//json을 response에 담아서 보내기
				response.setContentType("application/json; charset=UTF-8");
	      response.getWriter().write(json.toString());
	    }
	}	
}
