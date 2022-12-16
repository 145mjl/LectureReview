package setInterface.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		//타입 표기하여 warning제거 
		
		if(ts.add("korea")) {
			System.out.println("첫 번째 korea 추가 성공");
		}else {
			System.out.println("첫 번째 korea 추가 실패");
		}
		if(ts.add("china")) {
			System.out.println("첫 번째 china 추가 성공");
		}else {
			System.out.println("첫 번째 china 추가 실패");
		}
		if(ts.add("america")) {
			System.out.println("첫 번째 america 추가 성공");
		}else {
			System.out.println("첫 번째 america 추가 실패");
		}
		if(ts.add("china")) {
			System.out.println("두 번째 china 추가 성공");
		}else {
			System.out.println("두 번째 china 추가 실패");
		}
		
		System.out.println("Iterator로 전체 원소 순회 ----------------");
		Iterator<String> it=ts.iterator();
		//타입 정해줬으면 Iterator클래스에도 해야함
		while(it.hasNext()) {
			System.out.println(it.next());
			//Iterator클래스의참조변수.next();
		}
	}
}
//Tree구조의 최상층은 root라고 한다
//HashSet처럼 중복값 허용 X (Set Collection의 특징)
//차이점은 정렬기능이 있음