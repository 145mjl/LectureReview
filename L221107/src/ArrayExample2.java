import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요.");
		int num=sc.nextInt();
		System.out.println("점수를 입력하세요.");
		int[] scores=new int[num];
		int sum=0;
		
		for(int i=0;i<num;i++) {
			scores[i]=sc.nextInt();
			System.out.printf("scores[%d] : %d\n",i,scores[i]);
			sum+=scores[i];
		}
		
		System.out.printf("sum : %d\n",sum);
		System.out.printf("avg : %f\n",sum/(double)num);
		
		sc.close();
		
	}
}
