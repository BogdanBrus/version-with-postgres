
package factory;

import daoImpl.TempDaoImpl;


public class Factory{
	//private static Factory instance = new Factory();
	//private TempDaoImpl tempDaoImpl;
	//private Partner partner;
	
	//private static Factory getInstance(){
	//	return Factory.instance;
	//}
	
	//public TempDaoImpl getObjDao(Object partner){
	//	tempDaoImpl = new TempDaoImpl(partner.getClass());
	//	return tempDaoImpl;
	//}
	
	
	
	public static TempDaoImpl getTempDaoImpl(Object table){
		TempDaoImpl tempDaoImpl = new TempDaoImpl(table.getClass());
		return tempDaoImpl;
	}
	
	
	
	

}