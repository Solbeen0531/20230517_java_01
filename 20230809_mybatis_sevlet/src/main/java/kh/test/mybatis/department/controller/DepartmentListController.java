package kh.test.mybatis.department.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.mybatis.department.model.service.DepartmentService;


@WebServlet("/dept/list")
public class DepartmentListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DepartmentListController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("deptList", new DepartmentService().selectList());
		request.getRequestDispatcher("/WEB-INF/view/dept/list.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
