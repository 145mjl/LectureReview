package treeMap.NavigableMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class DescendingMapEx {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores=new TreeMap<Integer,String>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		NavigableMap<Integer,String> descendingMap =scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet=descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
		
		NavigableMap<Integer,String> ascendingMap=descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");
		}
		System.out.println();
	}
}
//Collection 과 Key
//Key는 key와 value의 쌍으로 저장

//Collection - List와 Set
//중복가능과 중복불가
	//List - ArrayList , Vector , LinkedList
	//ArrayList와 Vector
	//thread safe X , O
	//ArrayList와 LinkedList
	//구조의 차이
	//Set - hashSet , treeSet
	//정렬기능 X, O


//Key - hashMap, hashtable , treeMap
	//hash와 tree
	//정렬기능 X,O
	//hashMap과 hashtable
	//threadsafe X , O