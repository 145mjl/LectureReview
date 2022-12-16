package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		//<Key,Value>
		
		map.put("홍길동", 85);
		map.put("동장군", 90);
		map.put("권 율", 79);
		map.put("홍길동", 91);
		
		System.out.println("총 entry 수 : "+map.size());
		
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
//			String key = keyIterator.next();
//			Integer value=map.get(key);
//			System.out.println("\t"+key+" : "+value);

//			key와 그에 대한 해쉬코드를 출력하기
//			keyIterator.hashCode()는 keyIterator자체의 해쉬코드를 구하므로 각 key에 대한 해쉬코드값이 아니다.
//			아래와 같이 작성해야함
			String obj = keyIterator.next();
			System.out.println(obj + " : " +obj.hashCode());
			
//			각 key의 hashcode는 keyIterator.next().hashCode()로도 구할수있다
//			다만 System.out.println(keyIterator.next() + " : " +keyIterator.next().hashCode());
//			는 포인터가 넘어가기 때문에 원하는 값을 얻을 수 없다
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 entry 수 : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key = entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 entry 수 : "+map.size());
	}
}
