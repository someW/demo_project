package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class FileDemo {
	public static void main(String[] args) {
		//1. �ҵ�Ŀ���ļ�
	    File file = new File("C:\\Users\\Thinkpad\\Pictures\\1.jpg");
	    //�������ݵ�����ͨ����
	    int content = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] b = new byte[fileInputStream.available()];
			System.out.println(fileInputStream.available());
			fileInputStream.read(b);
			BASE64Encoder encode = new BASE64Encoder(); 
			String base64 = encode.encode(b);
			System.out.println(base64);
			
			//��ȡ�ļ��е�����
//			 while((content = fileInputStream.read())!=-1){
//			        System.out.print((char)content);
//			    }
			// read() ��ȡһ���ֽڵ����ݣ��Ѷ�ȡ�����ݷ��ء�
			//�ر���Դ    ʵ���Ͼ����ͷ���Դ�� 
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	

}
