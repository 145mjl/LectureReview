package classMath;

public class Main {
	public static void main(String[] args) {
		int v1=Math.abs(-5);
		double v2=Math.abs(-3.14);
		System.out.println("v1 :"+v1);
		System.out.println("v2 :"+v2);
		
		//ceiling 올림
		double v3=Math.ceil(5.3);//6
		System.out.println("v3 :"+v3);
		double v4=Math.ceil(-5.3);//-5.0
		System.out.println("v4 :"+v4);
		
		//floor 버림
		double v5=Math.floor(5.3);//5.0
		System.out.println("v5 :"+v5);
		double v6=Math.floor(-5.3);//-6.0
		System.out.println("v6 :"+v6);
		
		double v7=Math.max(5, 9);
		System.out.println("v7 :"+v7);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v8 :"+v8);
		
		double v9=Math.min(5, 9);
		System.out.println("v9 :"+v9);
		double v10=Math.min(5.3, 2.5);
		System.out.println("v10 :"+v10);
		
		double v11=Math.random();
		System.out.println("v11 :"+v11);
		
		//가장 가까운 정수의 실수값
		//반올림과 거의 비슷한 결과를 낸다
		double v12=Math.rint(5.3);
		System.out.println("v12 :"+v12);
		double v13=Math.rint(5.7);
		System.out.println("v13 :"+v13);
		
		//반올림
		//올림 버림은 엑셀처럼 roundup rounddown이 아니니까 주의
		double v14=Math.round(5.3);
		System.out.println("v14 :"+v14);
		double v15=Math.round(5.7);
		System.out.println("v15 :"+v15);
		
		double value=12.3456;
		double tmp1=value*100;//1234.56
		long tmp2=Math.round(tmp1);//1235
		double v16=tmp2/100.0;//12.35
		System.out.println("v16 :"+v16);
	}
}
