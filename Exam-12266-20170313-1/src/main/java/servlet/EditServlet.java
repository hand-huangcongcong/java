package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.Connect;

public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("username")==null){
			 getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			System.out.println("file_id"+request.getParameter("file_id"));
			int file_id  = Integer.parseInt(request.getParameter("file_id"));
			String sql = "update file_list set title=?, description=?, language = ? where file_id =?";
			String title = request.getParameter("title");
			String description = request.getParameter("description");
			int language = Integer.parseInt(request.getParameter("language"));
			PreparedStatement ps;
			try {
				ps = Connect.connect().prepareStatement(sql);
				ps.setString(1, title);
				ps.setString(2, description);
				ps.setInt(3, language);
				ps.setInt(4, file_id);
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

}
