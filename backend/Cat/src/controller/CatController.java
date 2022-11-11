package controller;

import java.io.BufferedReader;
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
//import template.RequestTemp;

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
					
				
		// System.out.println(request.getParameter("data"));			
		//Query String이 command=GetCatInfo&catId=1 같은 형태로 넘어옴
		System.out.println("command : " + request.getParameter("command"));
		System.out.println("catId : " + request.getParameter("catId"));


		String command = request.getParameter("command");
//		Integer catId = Integer.parseInt(request.getParameter("catId"));
		
		//command가 "GetCatInfo"이면 catId에 해당하는 고양이 정보를 얻어와서 response에 담아서 보내기 
		if ("GetCatInfo".equals(command)) {
		try {
			CatDTO cat = null;
			cat = CatService.getInstance().getCat(1);
			System.out.println(cat); //테스트용
			response.setContentType("application/json; charset=UTF-8");
			response.getWriter().write(new ObjectMapper().writeValueAsString(cat));
		} catch (NotExistException | SQLException e) {
			e.printStackTrace();
		}

	}	
}
}
