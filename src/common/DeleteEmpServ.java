package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmp")
public class DeleteEmpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteEmpServ() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	//localhost/AjaxWeb/deleteEmp?empId=210  <-ajax호출시 이렇게 넘기겟다  210받아서 넘겨준다.	
	 String id = request.getParameter("empId");  // 파라메타 이름 화면삭제할때 넘겨주는것
	 id = id == null? "0" : id; // 파라메타를넘겻는데 null이면 0값을 (의미없는값 -1상관없음) 넘기겠다. null이아니면 원래값을.
	 int employeeId = Integer.parseInt(id); // integer값으로바꿔주겠다.
	 EmployeeVO vo = new EmployeeVO();
	 vo.setEmployeeId(employeeId);
	 
	 EmpDAO dao = new EmpDAO();
	 if(dao.deleteEmp(vo)) {
		 response.getWriter().append("<h1>OK</h1>");
	 }else {
		 response.getWriter().append("<h1>NG</h1>");
	 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
