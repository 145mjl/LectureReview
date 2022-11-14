package p110;

public class OperatorEx21 {
	public static void main(String[] args) {
		System.out.printf("10==10.0f \t %b\n", 10 == 10.0f);
		System.out.printf("'0'==0 \t %b\n", '0' == 0);
		System.out.printf("'A'==65 \t %b\n", 'A' == 65);
		System.out.printf("'A'>'B' \t %b\n", 'A' > 'B');
		System.out.printf("'A'+1!='B' \t %b\n", 'A' + 1 != 'B');
		
//		\t앞에 공간이(공백포함) 얼마인지에 따라서 간격을 벌리는 기준이 PC마다 다름
//		내 PC의 기준은 8칸임
//		위처럼 썼을때는 '0'==0 이 7칸이라서 혼자 간격이 짧다.
	}
}
