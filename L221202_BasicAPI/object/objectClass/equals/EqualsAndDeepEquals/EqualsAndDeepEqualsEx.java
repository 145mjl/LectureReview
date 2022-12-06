package objectClass.equals.EqualsAndDeepEquals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {
	public static void main(String[] args) {
		Integer o1=1000;
		Integer o2=1000;
		//wrapper 클래스 : 
		//wrapper클래스의 일종인 Integer는 int타입 변수를 다룰 수 있는 여러가지 기능을 제공하는 클래스이다
		//wrapper클래스에 한해서 참조형변수에 기본형변수에 넣을법한 값을 바로 대입할 수 있다.
		
		
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.equals(o1, o2));
		System.out.println();
		
		Integer[] arr1= {1,2};
		Integer[] arr2= {1,2};
		
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));//배열은 Arrays클래스를 이용해서 비교할 수 있다
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
