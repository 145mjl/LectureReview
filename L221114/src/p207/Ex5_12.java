package p207;

public class Ex5_12 {
	public static void main(String[] args) {
		String[] names= {"Kim","Park","Yi"};
		//String배열의 각 요소인 "Kim"등을 디버그해보면 'K','i','M'의 char배열인 것을 확인가능
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}
		
		System.out.println();
		String tmp=names[2];
		System.out.println("tmp:"+tmp);
		names[0]="Yu";
		
		System.out.println();
		for(String str:names)
			System.out.println(str);
	}
}
