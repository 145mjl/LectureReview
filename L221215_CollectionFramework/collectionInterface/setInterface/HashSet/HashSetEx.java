package setInterface.HashSet;

import java.util.HashSet;
import java.util.Set;

class Member{
	public String name;
	public int age;
	
	public Member(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {//객체 비교
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
			//객체의 멤버변수 2개가 같을 경우 같은 객체로 판단되어 true 리턴
			//그렇지 않을 경우 false
		}else {
			return false;
		}
	}
	
	public int hashCode() {
		return name.hashCode()+age;
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
//		set.add(new Member("홍길동",29));
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체 수 : "+set.size());
	}
}
