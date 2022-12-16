package comparatorEx;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Person arg0) {
		if(age<arg0.age)
//		if(age>arg0.age)//age 내림차순
			return -1;
		else if(age==arg0.age)
			return 0;
		else
			return 1;
	}
}

public class Main {
	public static void main(String[] args) {
		TreeSet<Person> treeSet=new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name+":"+person.age);
		}
		
	}
}
