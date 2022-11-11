package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import exception.NotExistException;
import model.dto.PictureDTO;
import service.PictureService;

@WebServlet("/picture")
public class PictureController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서버 접속 잘됨");
		
		System.out.println(request.getParameter("catId"));
		request.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("command"); // 요청 종류 판별
		PictureService service = PictureService.getInstance();
		System.out.println(command);
//		ObjectMapper mapper = new ObjectMapper();
//		PictureDTO picture = mapper.readValue(request.getInputStream(), PictureDTO.class);
//		System.out.println(picture);
		
	    if(command.equals("getPicture")) {
//				try {
//					getPicture(request, response, service);
//				} catch (ServletException | IOException | SQLException | NotExistException e) {
//					e.printStackTrace();
//				}
			
	    }else if(command.equals("getPictures")) {
	    	getPictures(request, response, service);
	    } 
	}
	
//	public void getPicture(HttpServletRequest request, HttpServletResponse response, PictureService service) 
//			throws ServletException, IOException, SQLException, NotExistException{
//				
//				
//		
//				int id = Integer.parseInt(request.getParameter("catId"));// 사진 id	
//		
//				ArrayList<PictureDTO> pictures = service.getPicture(id);
//				
//				JSONArray jArray = new JSONArray();
//				
//			    for (int i = 0; i < pictures.size(); i++) {
//			    	JSONObject obj = new JSONObject();
//					obj.put("PIC_URL", pictures.get(i).getPicUrl());
//					jArray.put(obj);
//				}
//			    
//			    response.setContentType("application/json; charset=UTF-8");
//			    response.getWriter().write(jArray.toString());	
//				System.out.println("사진 가져오기 성공");
//	}   
	
	public void getPictures(HttpServletRequest request, HttpServletResponse response, PictureService service) throws ServletException, IOException{
	    
	    	try {
	    		int id = Integer.parseInt(request.getParameter("catId"));// 사진 id	//1 
				ArrayList<String> pictures = service.getPictures(id); // 
				
				JSONArray jArray = new JSONArray();
				
			    for (int i = 0; i < pictures.size(); i++) {
			    	JSONObject obj = new JSONObject();
					obj.put("PIC_URL", pictures.get(i));
					jArray.put(obj);
				}
			    
			    response.setContentType("application/json");
			    response.setCharacterEncoding("UTF-8");
			    response.getWriter().write(jArray.toString());	
				
			} catch (SQLException | NotExistException e) {
				e.printStackTrace();
			}catch(NumberFormatException e){
				e.printStackTrace();
			}     
	}
		
}
