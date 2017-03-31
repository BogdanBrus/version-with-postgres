package org.mvcedit.services;

import javax.inject.Inject;
import javax.inject.Named;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.mvcedit.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

@Named("serviceUser")
public class ServiceUser implements UserDetailsService{

	@Inject
	private SessionFactory sessionFactory;
	
	public ServiceUser(){
	
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Query query = sessionFactory.getCurrentSession().createQuery("from User u Where u.username=:username");
		query.setParameter("username", username);
		
		User result = (User)query.uniqueResult();
		
		return result;
	}
	
}
