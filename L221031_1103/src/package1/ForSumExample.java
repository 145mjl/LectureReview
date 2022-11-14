package package1;
public class ForSumExample {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			//sum=sum+i;를 줄여씀
		}
		System.out.println("sum = "+sum);
	}
}
