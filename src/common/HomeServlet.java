package common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹서블릿 에러시 아약스웹(프로젝트에서) 빌드패스 -> 라이브러리에서 톰캣 add해준다.
// http://localhost:8088/AjaxWeb/home  // 표식으로 끌고와야한다.
/**
 *
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HomeServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		List<EmployeeVO> list = dao.getEmpList();

		String xml = "<dataset>";
		for (EmployeeVO emp : list) {
			xml += "<record>"; // <id>1</id><first_name>kildong</first_name><last_name>Hong</last_name></record>";
			xml += "<empId>" + emp.getEmployeeId() + "</empId>" + "<firstName>" + emp.getFirstName() + "</firstName>"
					+ "<lastName>" + emp.getLastName() + "</lastName>" + "<email>" + emp.getEmail() + "</email>"
					+ "<phoneNumber>" + emp.getPhoneNumber() + "</phoneNumber>" + "<hireDate>" + emp.getHireDate()
					+ "</hireDate>" + "<jobId>" + emp.getJobId() + "</jobId>" + "<salary>" + emp.getSalary()
					+ "</salary>";
			xml += "</record>";
		}
		xml += "</dataset>";

		response.getWriter().append(xml);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
