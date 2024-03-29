package kh.test.jbckh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.jbckh.member.model.service.MemberService;

@WebServlet("/login.login")
public class LoginDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mid = request.getParameter("mid");
		String mpwd = request.getParameter("mpwd");
		Member vo = new Member(mid, mpwd);
		String result = new MemberService().login(mid);
		String sendUrl = request.getContextPath();
		// TODO session
		if (mpwd == null) {
			// 아이디가 존재하지않습니다.
		} else if (mpwd.equals(result)) {
			System.out.println("로그인 성공");
			request.setAttribute("loginId", mid);
			request.getSession().setAttribute("successFailMsg", "로그인 성공");
			request.getSession().setAttribute("SsLoginId", mid);
			sendUrl += "/board/list";
		} else {
			System.out.println("로그인 실패");
			request.getSession().setAttribute("failMsg", "로그인 실패");
			sendUrl += "/error";
		}
		response.sendRedirect(sendUrl);
	}

}
