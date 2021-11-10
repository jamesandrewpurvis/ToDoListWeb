package com.james;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

public class App 
{
    	public static ToDoList mInstance = new ToDoList();
    	public static SessionFactory mDatabaseInstance = StaticSessionFactory.returnSessionFactory();
    	public static Session mSession = mDatabaseInstance.openSession();
    	
    	public static void main(String[] args)
    	{
    		mInstance.printList();
    	}
    	
    	private static void printHeader()
    	{
    		System.out.println("##########################################################################");
    		System.out.println("                         DayPlanner                                       ");
    		System.out.println("                    By: James Purvis                                      ");
    		System.out.println("###########################################################################");
    		System.out.println(" ");
    	}
    	
    	private static void printMenuOptions()
    	{
    		System.out.println("Main Menu: ");
    		System.out.println("1. View the To-Do Items");
    		System.out.println("2. Add a to-do item");
    		System.out.println("3. Delete a to-do item");
    		
    	}
    	
    	private static void refreshMenu()
    	{
    		printMenuOptions();
    		waitForInput();
    	}
    	
    	private static void waitForInput()
    	{
    		Scanner mScanner = new Scanner(System.in);
    		int mSelection = mScanner.nextInt();
    		
    		switch(mSelection)
    		{
    		    case 1:
    		    	mInstance.printList();
    		    	refreshMenu();
    			break;
    			
    		    case 2:
    		    	Scanner mScanner1 = new Scanner(System.in);
    		    	System.out.println("Please enter a description of the event: ");
    		    	String mEventName = mScanner1.nextLine();
    		    	System.out.println("Please enter a date in the following format (ex: 01/01/2021):");
    		    	String mDate = mScanner1.nextLine();
    		    	System.out.println("Please enter a time in the following format (ex: 07:00pm)");
    		    	String mTime = mScanner1.nextLine();
    		    	
    		    	ToDoItem mItem = new ToDoItem(mEventName, mDate + " : " + mTime);
    		    	
    		    	mInstance.addToList(mItem);
    		          
    		    	try
    		    	{
    		    	
    		    	//mSession.save(mItem);
    		    	//mSession.getTransaction().commit();
    		    	}
    		    	catch(Exception e)
    		    	{
    		    		e.printStackTrace();
    		    	}
    		    	
    		    	System.out.println("Added " + mItem.returnItemName() + " " + "to your To-Do-List successfully!");
    		    	System.out.println(" ");
    		    	refreshMenu();
    		    break;
    		    
    		    case 3:
    		    	Scanner mScanner2 = new Scanner(System.in);
    		    	System.out.println("Please choose a item to remove from your toDoList: ");
    		    	System.out.println(" ");
    		    	mInstance.printList();
    		    	int mSelectedID = mScanner2.nextInt();
    		    	
    		    	try
    		    	{
    		    		App.mSession.beginTransaction();
    		    		Query mQuery = App.mSession.createQuery("DELETE FROM ToDoItem WHERE itemID = '" + mSelectedID + "'");
    		    	    int mResultNumber = mQuery.executeUpdate();
    		    	    mSession.getTransaction().commit();
    		    	    
    		    	    if (mResultNumber > 0)
    		    	    {
    		    	    	System.out.println("You've sucessfully removed this item from your ToDoList!");
    		    	    }
    		    	}
    		    	catch(HibernateException e)
    		    	{
    		    		e.printStackTrace();
    		    	}
    		    	refreshMenu();
    		    break;
    		}
    	}
    }
