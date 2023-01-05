package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class HogeIndex
 */
@WebServlet("/HogeIndex")
public class HogeIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = getServletContext();
		SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");

		if (siteEV == null) {
			siteEV = new SiteEV();
		}

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		SiteEVLogic logic = new SiteEVLogic();
		if (action != null && action.equals("like")) {
			logic.like(siteEV);
		} else if (action != null && action.equals("dislike")) {
			logic.dislike(siteEV);
		}

		application.setAttribute("siteEV", siteEV);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/hogeIndex.jsp");
		dispatcher.forward(request, response);
	}

}
