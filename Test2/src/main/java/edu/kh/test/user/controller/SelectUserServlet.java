package edu.kh.test.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.test.user.model.service.UserService;
import edu.kh.test.user.model.vo.User;

@WebServlet("/selectUser")
public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService service = new UserService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		User result = service.selectOne(userId);
		
		if (result != null) {
			request.setAttribute("uid", result);
			request.getRequestDispatcher("/WEB-INF/views/searchSuccess.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/searchFail.jsp").forward(request, response);
		}
	}


}
