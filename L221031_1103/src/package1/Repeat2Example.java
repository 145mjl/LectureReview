package package1;
public class Repeat2Example {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
//출력문을 1부터 10까지 수동기입하는것보다 유지보수가 쉽다
//가령 1부터 100까지로 바꾸려면 조건식을 i<=100하면 된다.
//i의 선언위치는 for문 안이므로 for문을 벗어나면 i에 할당된 메모리가 해제된다.
//디버그로 i값과 i<=10을 넣고 확인해보기