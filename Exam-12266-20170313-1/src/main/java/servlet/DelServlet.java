package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.Connect;


public class DelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 System.out.println("开始");
		int file_id  = Integer.parseInt(request.getParameter("file_id"));
		String sql ="delete from file_list where file_id=?";
		
		try {
			PreparedStatement ps= Connect.connect().prepareStatement(sql);
			 ps.setInt(1,file_id);
			 ps.execute();
			 System.out.println("结束");
			 getServletContext().getRequestDispatcher("/ListServlet").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
