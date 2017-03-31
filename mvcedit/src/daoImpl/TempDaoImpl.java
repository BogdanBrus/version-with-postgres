package daoImpl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.mvcedit.models.Partner;
import org.mvcedit.util.HibernateUtil;

import dao.Dao;

public class TempDaoImpl implements Dao{
	    private Class currentClass = null;
	    
	    
	    public TempDaoImpl(Class currentClass){
	    	this.currentClass = currentClass;
	    }
	//arg[0] = 0-add;     1-delete;   2-get;   3-getAll
	//arg[1] = Partner;   Partner;    phone;
	//arg[2] = Partner.class
		private Object template(Object... arg) {
			Object response = null;
			
			try(Session session = HibernateUtil.getSessionFactory().openSession();){
				
				session.beginTransaction();
				
				if(arg != null) {
					Integer i = (Integer)arg[0];
					
					switch (i) {
					case 0:  
						session.save(arg[1]);
						break;
					case 1:  
						session.delete(arg[1]);
						break;
					case 2: 
						response =  session.get( (Class) arg[2], (Serializable) arg[1]);
						//if (response.toString().indexOf("@") == -1 ) response = "0/"+response;
						break;
					case 3:  
						response = session.createCriteria((Class) arg[2]).list();
						break;
					case 4:  
						session.update(arg[1]);
						break;
					}
				}
				session.getTransaction().commit();
			}catch(Exception e) {
				e.printStackTrace();
			} 
			return response;
		}
		
		
	    Object []arr = new Object[3];
	    public void addObj(Object partner) throws SQLException {
			arr[0] = 0;//add
			arr[1] = partner;
			template(arr);
		}

	    public void deleteObj(Object partner) throws SQLException {
			arr[0] = 1;//delete
			arr[1] = partner;
			template(arr);
		}

	    public Object getObj(String id) throws SQLException, NullPointerException {
			
			arr[0] = 2;//get
			arr[1] = id;
			arr[2] = this.currentClass;
			Object partner =  template(arr);
			return partner;
		}

	    public List<Object> getListObj() throws SQLException {
			
			arr[0] = 3;//getAll
			arr[2] = this.currentClass;
			List<Object> list = (List<Object>) template(arr);
			return list;
		}
	
	    
	    //For update need all field
	    public void updateObj(Object partner){
	    	arr[0] = 4;//getAll
			arr[1] = partner;
			template(arr);
	    }
		@Override
		public Object getObj(int phone) throws SQLException {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	
	
}