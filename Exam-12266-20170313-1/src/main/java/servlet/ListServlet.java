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


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement sta = null;
		if(request.getSession().getAttribute("username")==null){
			 getServletContext().getRequestDispatcher("index.jsp").forward(request, response);
		}else{ 
		
			try {
				conn  = Connect.connect();
				sta= conn.createStatement();
				String sql = "select * from file_list";
				List<File_List> list = new ArrayList<File_List>();
				ResultSet rst = conn.createStatement().executeQuery(sql);
				
				while(rst.next()){
					File_List fl = new File_List();
					fl.setFile_id(rst.getInt(1));
					fl.setTitle(rst.getString(2));
					fl.setDescription(rst.getString(3));
					fl.setLanguage(rst.getString(4));
					list.add(fl);
					System.out.println(rst.getInt(1));
				}
				request.setAttribute("list", list );
				conn.close();
				request.getRequestDispatcher("file_list.jsp").forward(request, response);
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
