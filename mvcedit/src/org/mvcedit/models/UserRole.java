package org.mvcedit.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="pl_role2")
public class UserRole extends Model implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy="userRoles")
	private Set<User> user = new HashSet<>();
	
	@Enumerated(EnumType.STRING)
	private ListRole listRole;
	
	public UserRole(){
		super();
	}
	public UserRole(int id){
		super(id);
	}
	public ListRole getListRole() {
		return listRole;
	}
	public void setListRole(ListRole listRole) {
		this.listRole = listRole;
	}
	
	
	
}
