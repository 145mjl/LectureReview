package setInterface.TreeSet.navigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class DescendingSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> scores=new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(Integer.valueOf(75));
		scores.add(95);
		scores.add(80);
		
		NavigableSet<Integer> descendingSet=scores.descendingSet();
		//descendingSet() - 내림차순으로 정렬된 NavigableSet을 반환
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet=descendingSet.descendingSet();
		//내림차순정렬된 set을 내림차순정렬 == 오름차순정렬
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
	
	}
}
//실무에서는 다루는 데이터가 많지 않을 경우 NavigableSet보다는 배열으로 정렬한다
//다룰 데이터가 수십만건이고 결과를 0.1s 내로 뽑아야할 경우 (DB조회에 2s 걸리면 안됨) 사용해야함