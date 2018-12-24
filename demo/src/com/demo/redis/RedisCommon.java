package com.demo.redis;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisCommon {
	
	public static Jedis connectReis() {
		 //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.126.128");
        System.out.println("连接成功");
        //查看服务是否运行
//        System.out.println("服务正在运行: "+jedis.ping());
        
        return jedis;
	}
	
	
	
	public static void main(String[] args) {
		Jedis jedis = connectReis();
		 //设置 redis 字符串数据
        jedis.set("keyhahhahahah", "阿斯顿撒大");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("keyhahhahahah"));
        Set<String> keys = jedis.keys("*");
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
        	System.out.println("redis-key: "+it.next() );
//        	jedis.del(it.next());
        }
        jedis.del("keyhahhahahah");
        
	}

}
