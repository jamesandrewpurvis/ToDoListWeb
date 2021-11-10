package com.james;

import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteItem
 */
@WebServlet("/DeleteItem")
public class DeleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("delete.jsp");
		
		if (request.getParameter("deleteID") != null)
		{
			int mID = Integer.parseInt(request.getParameter("deleteID"));
			
			App.main(null);
			App.mSession.beginTransaction();
    		Query mQuery = App.mSession.createQuery("DELETE FROM ToDoItem WHERE itemID = '" + mID + "'");
    	    
    	    int mResultNumber = mQuery.executeUpdate();
    	    App.mSession.getTransaction().commit();
    	    
    	    if (mResultNumber > 0)
    	    {
    	    	response.sendRedirect("view.jsp");
    	    }
    
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
