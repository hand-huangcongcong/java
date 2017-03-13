package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.Connect;


public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql = "insert into file_list(title,description,language) values(?,?,?)";
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int language = Integer.parseInt(request.getParameter("language"));
		PreparedStatement ps;
		try {
			ps = Connect.connect().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, description);
			ps.setInt(3, language);
			System.out.println(language);
			 ps.execute();
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
