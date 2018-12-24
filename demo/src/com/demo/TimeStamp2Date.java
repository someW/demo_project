package com.demo;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 时间戳转换成时间
 * @author WBB
 *
 */
public class TimeStamp2Date {
	
	    public static void main(String[] args){
	        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	        String sd = 
	        		sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
	        System.out.println(sd);
	   }

}
