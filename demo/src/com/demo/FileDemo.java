package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class FileDemo {
	public static void main(String[] args) {
		//1. 找到目标文件
	    File file = new File("C:\\Users\\Thinkpad\\Pictures\\1.jpg");
	    //建立数据的输入通道。
	    int content = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] b = new byte[fileInputStream.available()];
			System.out.println(fileInputStream.available());
			fileInputStream.read(b);
			BASE64Encoder encode = new BASE64Encoder(); 
			String base64 = encode.encode(b);
			System.out.println(base64);
			
			//读取文件中的数据
//			 while((content = fileInputStream.read())!=-1){
//			        System.out.print((char)content);
//			    }
			// read() 读取一个字节的数据，把读取的数据返回。
			//关闭资源    实际上就是释放资源。 
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	

}
