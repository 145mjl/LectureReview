package hashSet;

import java.util.HashSet;

public class Ex4 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		
		System.out.println(set);
	}
}

class Person2{
	String name;
	int age;
	
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp=(Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name+age).hashCode();
	}
	public String toString() {
		return name+":"+age;
	}
}

//클래스 Person2에서 equals, hashCode 메서드를 재정의하지 않으면 결과는 다음과 같다.
//[David:10, abc, David:10]

//즉 HashSet의 add메서드는 equals()메서드와 hashCode()메서드를 호출하여 동일 객체 여부를 판별함을 알 수 있다
