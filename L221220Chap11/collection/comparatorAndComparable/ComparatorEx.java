package comparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr= {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//대소문자 구분X
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//역순 정렬
		System.out.println("strArr="+Arrays.toString(strArr));
	}
}

class Descending implements Comparator{

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	인터페이스 구현시 반드시 구현해야할 메서드
	
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable){
			Comparable c1=(Comparable)o1;
			Comparable c2=(Comparable)o2;
			return c1.compareTo(c2)*-1; //-1을 곱하면 기본정렬방식의 역으로 변경된다.
//			return c2.compartTo(c1);//순서를 바꿔도 역순이 된다.
		}
		
		return -1;
		
	}
}
