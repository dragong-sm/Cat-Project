package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import exception.NotExistException;

import service.PictureService;

@WebServlet("/picture")
public class PictureController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서버 접속 잘됨");
		request.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("command"); // 요청 종류 판별
		PictureService service = PictureService.getInstance();
		
		System.out.println("catId : " + request.getParameter("catId"));
		System.out.println("command : " + command);
		
	    if(command.equals("getPicture")) {
				try {
					getPicture(request, response, service);
				} catch (ServletException | IOException | SQLException | NotExistException e) {
					e.printStackTrace();
				}
			
	    }else if(command.equals("getPictures")) {
	    	getPictures(request, response, service);
	    } 
	}
	
	public void getPicture(HttpServletRequest request, HttpServletResponse response, PictureService service) 
			throws ServletException, IOException, SQLException, NotExistException{
				
			try {
				int id = Integer.parseInt(request.getParameter("catId"));// 사진 id	//1 
				String picture = null;
				picture = service.getPicture(id); // 
				System.out.println(picture);
				
				
			   
			    response.setContentType("application/json; charset=UTF-8");
			   
			    response.getWriter().write(new ObjectMapper().writeValueAsString(picture));	
			    
			} catch (SQLException | NotExistException e) {
				e.printStackTrace();
			}   
				System.out.println("사진 가져오기 성공");
	}   
	
	public void getPictures(HttpServletRequest request, HttpServletResponse response, PictureService service) throws ServletException, IOException{
	    
	    	try {
	    		int id = Integer.parseInt(request.getParameter("catId"));// 사진 id	//1 
				ArrayList<String> pictures = service.getPictures(id); // 
				
			    System.out.println("이미지 URL : " + pictures);
			    response.setContentType("application/json; charset=UTF-8");
			   
			    response.getWriter().write(new ObjectMapper().writeValueAsString(pictures));	
				
			} catch (SQLException | NotExistException e) {
				e.printStackTrace();
			}   
	}
		
}
