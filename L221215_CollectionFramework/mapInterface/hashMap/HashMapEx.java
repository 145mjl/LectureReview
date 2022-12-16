package hashMap;

import java.util.HashMap;
import java.util.Map;

class Student{
	private int sno;
	private String name;
	
	public Student(int sno,String name) {
		this.sno=sno;
		this.name=name;
	}
	
	//키 객체의 비교를 통해 중복을 걸러내므로 hashCode()와 equals()를 재정의해주어야함
	//동일한 키가 될 조건 : hashCode()가 동일 , equals() 메서드가 true 리턴
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			//Student 객체가 들어왔는지 검사
			return (sno==student.sno) && (name.equals(student.name));
			//sno와 name 멤버변수가 같으면 true를 리턴하여 key가 동일객체임을 전달한다.
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno+name.hashCode();
	}
}

public class HashMapEx {
	public static void main(String[] args) {
		Map<Student,Integer> map=new HashMap<Student,Integer>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		
		System.out.println("총 Entry 수 : "+map.size());
	}
}

//결과 : 총 Entry 수 1
//이유 : HashMap클래스가 자동으로 키 객체의 equals()와 hashCode()를 호출하도록 작성되어있다
	//참고 : Map.class - Comparable.class - Comparator.class
//사용자는 객체의 equals() , hashCode()를 재정의하여 키가 같다고 판단할 기준을 정해준다.