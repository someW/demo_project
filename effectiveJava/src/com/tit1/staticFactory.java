package com.tit1;

public class staticFactory {
	//��̬����
	public static boolean valueOf(boolean b) {
		return b? Boolean.TRUE : Boolean.FALSE ;
	}
	
	public interface Service{
		
	}
	
	public interface Provider{
		Service newService();
	}

}
