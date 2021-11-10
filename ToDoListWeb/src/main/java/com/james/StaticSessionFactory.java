package com.james;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StaticSessionFactory
{
	private static StandardServiceRegistry mRegistry;
	private static SessionFactory mSessionFactoryInstance;
	
	public static SessionFactory returnSessionFactory()
	{
		if (mSessionFactoryInstance == null)
		{
			try {
				mRegistry = new StandardServiceRegistryBuilder().configure().build();
				
			MetadataSources mSources = new MetadataSources(mRegistry);
			
			Metadata mMetadata = mSources.getMetadataBuilder().build();
			
			mSessionFactoryInstance  = mMetadata.getSessionFactoryBuilder().build();
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		return mSessionFactoryInstance;
	}

}
