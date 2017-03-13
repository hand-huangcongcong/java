package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.Connect;
import service.File_List;


public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public QueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		if(request.getSession().getAttribute("username")==null){
			 request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			try {
				conn  = Connect.connect();
				String sql = "select * from file_list where title like '%?%' or description like '%?%'";
				String title = request.getParameter("title");
				String description = request.getParameter("description");
				PreparedStatement ps;
					ps = conn.prepareStatement(sql);
					ps.setString(1, title);
					ps.setString(2, description);
					ResultSet rst = ps.executeQuery();
					 List<File_List> list = new ArrayList<File_List>();
					 File_List fl = new File_List();
						while(rst.next()){
							fl.setFile_id(rst.getInt(1));
							fl.setTitle(rst.getString(2));
							fl.setDescription(rst.getString(3));
							fl.setLanguage(rst.getString(4));
							list.add(fl);
						}
						request.setAttribute("list", list );
						conn.close();
					 getServletContext().getRequestDispatcher("file_list.jsp").forward(request, response);
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