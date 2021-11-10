package com.james;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.jboss.jandex.Main;

public class ToDoList 
{
private List<ToDoItem> mToDoList = null;
	
	public ToDoList()
	{
		mToDoList = new ArrayList<ToDoItem>();
	}
	
	public void addToList(ToDoItem instance)
	{
		mToDoList.add(instance);
	}

	public void deleteFromList(int index)
	{
		mToDoList.remove(index);
	}
	
	public ToDoItem returnFromList(int index)
	{
		return mToDoList.get(index);
	}
	public void printList()
	{
		StringBuilder mList = new StringBuilder();
		int mCount = 0;
		
		System.out.println("#################################");
		System.out.println("      Your To-Do List                ");
		System.out.println("#################################");
		System.out.println(" ");
		
		
		try
		{
			for(ToDoItem i : returnList())
			{
				mList.append("(" + i.returnItemID() + ") " + i.returnItemName() + " " + "occurs at " + i.returnItemDateTime());
				mList.append(System.lineSeparator());
			}
			
		}
		catch(HibernateException ex)
		{
			ex.printStackTrace();
		}
		

		if (mList.isEmpty() == true)
		{
			System.out.println("Well.. looks like you've got the day free.");
			System.out.println(" ");
		}
		else
		{
		   System.out.println(mList.toString());
		}
		
	}
	
	public List<ToDoItem> returnList()
	{
		return App.mSession.createQuery("SELECT a FROM ToDoItem a").getResultList();
	}


}
