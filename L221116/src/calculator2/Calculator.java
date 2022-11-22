package calculator2;

public class Calculator {
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width,double height) {
		return width*height;
	}
	
	
	public static void main(String[] args) {
		Calculator cal1 = new Calculator();
		
		double res1=cal1.areaRectangle(4.0);
		double res2=cal1.areaRectangle(4.0,6.0);
		
		System.out.println(res1);
		System.out.println(res2);
	}
}
//생성자 오버로딩을 시험해보려면 인스턴스생성을 여러번해야하지만
//<--생성자는 인스턴스가 생성되면 자동 호출되는 특수메서드이기 때문
//메서드는 그럴 필요X