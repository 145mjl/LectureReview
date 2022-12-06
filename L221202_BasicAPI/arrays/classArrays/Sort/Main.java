package classArrays.Sort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores= {99,68,36,29,88};
		
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		
		String[] names= {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
	}
}
//내림차순도 가능하다
//sort메서드에 Collections클래스의 Collections.reverseOrder()를 추가로 인자를 전달한다
//이것은 Comparator로 직접 구현해야하지만 내림차순은 자주 사용하므로 Collections클래스에서 기본제공하는 것이다.
//String배열은 바로 사용해도 되지만, int배열의 경우 Integer로 Boxing하고 사용해야한다.