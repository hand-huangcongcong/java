package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.Connect;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		//Statement sta = null;
		
		String username = request.getParameter("username");
		request.getSession().setAttribute("username", username);;
		String pwd = request.getParameter("pwd");
		System.out.println("username"+username+",pwd"+pwd);
		try {
			conn  = Connect.connect();
			//sta= conn.createStatement();
			String sql = "select count(1) from file_user where file_name=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			System.out.println("111");
			if(rs.next()&&(rs.getInt(1)==1)){
				
					System.out.println(rs.getInt(1));
					
					getServletContext().getRequestDispatcher("/ListServlet").forward(request, response);
			
				}else{
				conn.close();
				//sta.close();
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("驱动异常");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql异常");
			e.printStackTrace();
		
			
		}
	}

}
