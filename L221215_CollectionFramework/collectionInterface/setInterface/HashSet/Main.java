package setInterface.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		set.add("Java");
		set.add("JDBC");
		//set 은 들어오는 순서가 의미가 없다.
		//그래서 데이터를 순회하는 전용 자료구조인 iterator를 생성한다
		
		int size=set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		iterator=set.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
