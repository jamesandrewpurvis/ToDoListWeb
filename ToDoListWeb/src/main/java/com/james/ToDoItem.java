package com.james;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ToDoItem")
public class ToDoItem 
{
	@Id
	@Column(name = "itemID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mID;
	
	@Column(name = "itemName")
	private String mItemName = null;
	
	@Column(name = "itemDateTime")
	private String mItemDateTime = null;
	
	public int returnItemID()
	{
		return mID;
	}
	
	public String returnItemName()
	{
		return mItemName;
	}
	
	public String returnItemDateTime()
	{
		return mItemDateTime;
	}
	
	public ToDoItem(String name, String dateandtime)
	{
		this.mItemName = name;
		this.mItemDateTime = dateandtime;
	}
	
	public ToDoItem()
	{
		
	}

}
