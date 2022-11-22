package inheritance.Override;

public class ComputerEx {
	public static void main(String[] args) {
		int r=10;
		
		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(r));
		
		Computer c = new Computer();
		System.out.println(c.areaCircle(r));
		
	}
}
