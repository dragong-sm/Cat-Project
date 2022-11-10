package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.NotExistException;
import model.dto.PictureDTO;
import service.PictureService;

import org.json.JSONObject;
import org.json.JSONArray;

@WebServlet("/picture")
public class PictureController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command = request.getParameter("command"); // 요청 종류 판별
	    int id = Integer.parseInt(request.getParameter("id"));// 고양이 id
	    
	    PictureService service = PictureService.getInstance();
	    
	    if(command.equals("getPicture")) {
	    	try {
				ArrayList<PictureDTO> pictures = service.getPictures(id);
				
				JSONArray jArray = new JSONArray();
				
			    for (int i = 0; i < pictures.size(); i++) {
			    	JSONObject obj = new JSONObject();
					obj.put("PIC_URL", pictures.get(i).getPicUrl());
					jArray.put(obj);
				}
			    
			    response.setContentType("application/json");
			    response.setCharacterEncoding("UTF-8");
			    response.getWriter().write(jArray.toString());	
				
			} catch (SQLException | NotExistException e) {
				e.printStackTrace();
			}
	    }     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
