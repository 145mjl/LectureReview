package treeMap.NavigableMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class subMapEx {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		//TreeSet코드와 차이 - <>에 Integer타입 추가
		treeMap.put("apple",10);
		treeMap.put("forever",60);
		treeMap.put("description",40);
		treeMap.put("ever",50);
		treeMap.put("zoo",10);
		treeMap.put("base",20);
		treeMap.put("guess",Integer.valueOf(70));
		treeMap.put("cherry",30);
		//TreeSet은 add() , TreeMap은 put()
		
		System.out.println("[c-f 사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap=treeMap.subMap("c", true,"f",true);
		//TreeSet은 subSet()
		//TreeMap은 subMap()
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue()+"페이지");
		}
		//entry (키와 값의 집합)를 가져와야함
		//Key와 Value 모두 출력
		System.out.println();
	}
}
