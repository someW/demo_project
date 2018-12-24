package com.tit1;

public class staticFactory {
	//¾²Ì¬¹¤³§
	public static boolean valueOf(boolean b) {
		return b? Boolean.TRUE : Boolean.FALSE ;
	}
	
	public interface Service{
		
	}
	
	public interface Provider{
		Service newService();
	}

}
