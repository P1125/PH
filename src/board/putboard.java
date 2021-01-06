package board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class putboard
 */
@WebServlet("/putboard")
public class putboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public putboard() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.getBoardList();

		String xml = "<dataset>";
		for (BoardVO bod : list) {
			xml += "<record>";  
			xml += "<boardNo>" + bod.getBoardNo() + "</boardNo>" + "<title>" + bod.getTitle() + "</title>"
					+ "<content>" + bod.getContent() + "</content>" + "<writer>" + bod.getWriter() + "</writer>"
					+ "<creationDate>"+ bod.getCreationDate() + "</creationDate>";
		
			xml += "</record>";
		}
		xml += "</dataset>";

		response.getWriter().append(xml);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
