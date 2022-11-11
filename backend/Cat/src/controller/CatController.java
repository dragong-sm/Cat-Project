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
			    //request객체의 정보를 출력
					System.out.println("요청방식: "+request.getMethod());
					System.out.println("요청URI: "+request.getRequestURI());
					System.out.println("요청URL: "+request.getRequestURL());
					System.out.println("요청명령 : "+request.getQueryString());

			//Object Mapper를 사용하여 request에 담긴 데이터를 추출
			// 예시
					// ver2
//		ObjectMapper mapper = new ObjectMapper();
//		User user = mapper.readValue(request.getInputStream(), User.class);
//		System.out.println(user);
		
//		System.out.println("async");
//		response.setContentType("text/html; charset=UTF-8");

		//전달되는 데이터 
		  //         command: 'getCatInfo',
  //         catId: 1
  //       }
//
//			ObjectMapper mapper = new ObjectMapper();
//			JSONObject json = mapper.readValue(request.getInputStream(), JSONObject.class);
//			System.out.println(json);
//			
//			

	}	
}
