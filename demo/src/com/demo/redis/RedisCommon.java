package com.demo.redis;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisCommon {
	
	public static Jedis connectReis() {
		 //���ӱ��ص� Redis ����
        Jedis jedis = new Jedis("192.168.126.128");
        System.out.println("���ӳɹ�");
        //�鿴�����Ƿ�����
//        System.out.println("������������: "+jedis.ping());
        
        return jedis;
	}
	
	
	
	public static void main(String[] args) {
		Jedis jedis = connectReis();
		 //���� redis �ַ�������
        jedis.set("keyhahhahahah", "��˹������");
        // ��ȡ�洢�����ݲ����
        System.out.println("redis �洢���ַ���Ϊ: "+ jedis.get("keyhahhahahah"));
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
        	System.out.println("redis-key: "+it.next() );
//        	jedis.del(it.next());
        }
        jedis.del("keyhahhahahah");
        
	}

}
