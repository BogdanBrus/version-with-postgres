package org.mvcedit.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private HibernateUtil(){}//Singleton = close construct
	
	//sessionFactory init()
	static{
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch(Throwable e){
			System.out.println("popali");
			throw new ExceptionInInitializerError(e);
		}
	}
	
	//get obj sessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	

}
