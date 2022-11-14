package package1;
//향상된 for문
public class AdvForExample {
	public static void main(String[] args) {
		int[] scores = { 9, 7, 8, 9, 8 };

		int sum = 0;
//		for(int s:scores) {
//			sum+=s;
//		}

		for (int s = 0; s < scores.length; s++) {
			sum += scores[s];
		}
		
		System.out.println("sum : " + sum);
	}
}
