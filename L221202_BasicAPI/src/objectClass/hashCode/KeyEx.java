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