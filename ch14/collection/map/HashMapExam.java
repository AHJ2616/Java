package ch14.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
	//map 타입은 (key,value) 값으로 나눈다.
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
	map.put("국어", 85);
	map.put("영어", 100);
	map.put("수학", 100);
	map.put("과학", 100);
	map.put("자바", 100);
	map.put("DB", 100);
	map.put("자바", 50); //key 값은 중복X -> 나중에 저장된 값이 이전의 값에 덮어진다(교체됨)
	
	
	System.out.println("Total Entry : "+map.size());
	System.out.println("자바 키의 값 : "+map.get("자바"));
		
	
	}//main method end
	
}//class end

