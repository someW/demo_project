package com.demo;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ʱ���ת����ʱ��
 * @author WBB
 *
 */
public class TimeStamp2Date {
	
	    public static void main(String[] args){
	        Long timeStamp = System.currentTimeMillis();  //��ȡ��ǰʱ���
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	        String sd = 
	        		sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // ʱ���ת����ʱ��
	        System.out.println(sd);
	   }

}
