package listInterface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		//배열과 ArrayList의 차이
		//ArrayList는 사용중에 용량이 늘어난다
		//배열은 0번째 값을 넣지 않고 3번째값을 저장하는것이 불가능하지만 ArrayList는 가능하다
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size=list.size();
		System.out.println("총 객체수 : "+size);
		
		String skill=list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("iBATIS");
		list.remove(2);
		
		//2번째 객체를 제거하면 그 뒤 객체들이 앞으로 1씩 당겨짐
		//빈번한 객체 삽입/삭제가 발생할 경우에는 ArrayList보단 LinkedList
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
	}
}
