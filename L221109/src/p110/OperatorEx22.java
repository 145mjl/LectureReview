package p110;

public class OperatorEx22 {
	public static void main(String[] args) {
		float f=0.1f;
		double d=0.1;
		double d2=(double)f;
		
		System.out.printf("10.0==10.0f %b\n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b\n",0.1==0.1f);
		//위의 f는 10.0을 float타입으로 표시하라는뜻이고 변수f가 아님
		System.out.printf("f=%19.17f\n",f);
		System.out.printf("d=%19.17f\n",d);
		System.out.printf("d2=%19.17f\n",d2);
		System.out.printf("d==f %b\n",d==f);
		System.out.printf("d==d2 %b\n",d==d2);
		System.out.printf("d2==f %b\n",d2==f);
		System.out.printf("(float)d==f %b\n",(float)d==f);
		//note : 실수타입 변수에 처음 실수값(리터럴)을 대입할 때
		//그 변수의 타입이 무엇이었냐가 중요하다
		//위처럼 f가 처음에 float인 이상 double로 형변환해도 똑같은 값이 나옴
	}
}
