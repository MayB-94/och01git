package och01git;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Board
 */
@WebServlet("/Board")
public class Board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>게시판</h1>");
		out.println("<table border=\"1\"");
		out.println("<tr>");
		out.println("<td>제목</td>");
		out.println("<td>" + title + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>작성자</td>");
		out.println("<td>" + writer + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>작성일</td>");
		out.println("<td>" + new Date() + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>내용</td>");
		out.println("<td>" + content + "</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body></html>");
	}

}
