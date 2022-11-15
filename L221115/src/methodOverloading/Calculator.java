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
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int res1=cal.plus(5,10);
		double res2=cal.plus(10.5, 20.3);
		System.out.println(res1);
		System.out.println(res2);
	}
}
