package objectClass.hashCode;

public class KeyEx {
	public static void main(String[] args) {
		Key k1 = new Key(3);
		Key k2 = new Key(5);
		Key k3=k1;
		
		System.out.println("k1.hashCode() : "+k1.hashCode());
		System.out.println("k2.hashCode() : "+k2.hashCode());
		System.out.println("k3.hashCode() : "+k3.hashCode());
	}
}
//Hash
//탐색의 한 방법
//bucket에 묶어서 분류하여 worstcase를 찾는데 드는 비용을 줄인다.

//예를 들어 Hash Function이 
//F(x) = y = x % 4이고 15를 찾으려고 하면
//bucket은 다음과 같이 분류하므로 3에서 찾으면 된다.
//0 : 4,8,12,16
//1 : 1,5,9,13
//2 : 2,6,10,14
//3 : 3,7,11,15