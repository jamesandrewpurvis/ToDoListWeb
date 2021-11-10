package com.james;

import java.io.IOException;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/AddItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mEventName = request.getParameter("eventName");
		String mEventTime = request.getParameter("eventTime");
		
		App.main(null);
		

    	ToDoItem mItem = new ToDoItem(mEventName, mEventTime);
    	
    	App.mInstance.addToList(mItem);
          
    	try
    	{
    	
    		App.mSession.beginTransaction();
    	    App.mSession.save(mItem);
          	App.mSession.getTransaction().commit();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	System.out.println("Added " + mEventName + " " + mEventTime);
    	
		
		response.sendRedirect("view.jsp");
	}

}


