
public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] oldIntArray= {1,2,3};
		int[] newIntArray= new int[5];
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+" ");
		}
		
	}
}
//디버그에 배열이름을 추가하면 배열의 값도 볼수가 있음
//expressions 창이 사라졌을땐 Window > 