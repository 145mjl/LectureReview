package methodOverloading;

public class Calculator {
	int plus(int x,int y) {
		int result=x+y;
		return result;
	}
	
	double plus(double x,double y) {
		double result=x+y;
		return result;
	}
	
//	double plus(double y,double z) {
//		double result=y*z;
//		return result;
//	}
//	Duplicate method plus(double, double) in type Calculator
//	메인메서드에서 plus(실수,실수)를 호출시 두 메서드중 어떤것을 호출했는지 알수없게 된다 --> 애초에 작성금지
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int res1=cal.plus(5,10);
		double res2=cal.plus(10.5, 20.3);
		System.out.println(res1);
		System.out.println(res2);
	}
}
