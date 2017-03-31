package dao;

import java.sql.SQLException;
import java.util.List;

import org.mvcedit.models.Partner;

public interface Dao {
	public void addObj(Object partner)throws SQLException;
	public void deleteObj(Object partner)throws SQLException;
	public Object getObj(int phone)throws SQLException;
	public List<Object> getListObj()throws SQLException;
	public void updateObj(Object partner)throws SQLException;
}
