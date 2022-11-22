package inheritance.polymorphism.CarEx;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽",6);
//	Tire frontRight = new Tire("앞오른쪽",2);
//	Tire backLeft = new Tire("뒤왼쪽",3);
//	Tire backRight = new Tire("뒤오른쪽",4);

	Tire[] tires = {
			new Tire("앞왼쪽",6),
			new Tire("앞오른쪽",2),
			new Tire("뒤왼쪽",3),
			new Tire("뒤오른쪽",4)
			
	};
	
	int run() {
		System.out.println("주행 상태");
		
//		if(frontLeft.roll()==false) {
//			stop();
//			return 1;
//		}
//		if(frontRight.roll()==false) {
//			stop();
//			return 2;
//		}
//		if(backLeft.roll()==false) {
//			stop();
//			return 3;
//		}
//		if(backRight.roll()==false) {
//			stop();
//			return 4;
//		}
//		return 0;
		
		for(int i=0;i<tires.length;i++) {
			if(!tires[i].roll()) {
				stop();
				return i+1;
			}
		}
		return 0;
		
	}
	
	void stop() {
		System.out.println("주행 종료");
	}
	
}
