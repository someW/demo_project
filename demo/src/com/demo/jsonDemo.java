package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class jsonDemo {
	
	public static Map<String,Object> getObjMap(){
		
		return new HashMap<String,Object>();
	}
	
	public static void main(String[] args) {
		Map<String,Map<String,Map<String,Map<String,List<Map<String,Object>>>>>>
			map = new HashMap<>();
		Map<String,Object> obMap = getObjMap();
		obMap.put("name", "img11111");
		obMap.put("size", "11111");
		obMap.put("url", "/11313/123213/213213/23");
		obMap.put("aa", "cccccc");
		obMap.put("bb", "cdddddd");
		List<Map<String,Object>> list = new ArrayList<>();
		list.add(obMap);
		Map<String,List<Map<String,Object>>> listMap = new HashMap<>();
		listMap.put("Img", list);
		Map<String,Map<String,List<Map<String,Object>>>> map1 = new HashMap<>();
		map1.put("Imgs", listMap);
		Map<String,Map<String,Map<String,List<Map<String,Object>>>>> map2 = new HashMap<>();
		map2.put("ImgsF", map1);
		Map<String,Map<String,Map<String,Map<String,List<Map<String,Object>>>>>>
				map3 = new HashMap<>();
		map3.put("ImgesSS", map2);
		
		JSONObject jo = JSONObject.parseObject(JSON.toJSONString(map3));
		
		System.out.println(((JSONObject) jo.get("ImgesSS")).get("ImgsF")); 
		
		System.out.println(jo.toJSONString());
	}

}
