package org.mvcedit.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.mvcedit.models.Partner;

/**
 * class for work with DB and table partners
*/
@Named
public class ServicePartner {
	
	@Inject
	private SessionFactory sessionFactory;
	public ServicePartner(){}
	
	@Transactional
	public List<Partner> getAllPartner(){
		Query query = sessionFactory.getCurrentSession().createQuery("from Partner");
		return query.list();
	}
	
	
	
}
