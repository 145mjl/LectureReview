package inheritance.polymorphism.CarEx;

public class CarEx {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = c1.run();
			String[] lo= {"앞왼쪽","앞오른쪽","뒤왼쪽","뒤오른쪽"};
			int[] life = {15,13,14,17};
			
			if(problemLocation!=0 && (problemLocation==1 ||problemLocation==2)) {
				System.out.println(lo[problemLocation-1]+" 한국타이어로 교체");
				c1.tires[problemLocation-1]
						=new HankookTire(lo[problemLocation-1],
								life[problemLocation-1]);
			}else if(problemLocation!=0 && (problemLocation==3 ||problemLocation==4)) {
				System.out.println(lo[problemLocation-1]+" 금호타이어로 교체");
				c1.tires[problemLocation-1]
						=new KumhoTire(lo[problemLocation-1],
								life[problemLocation-1]);
			}
			
//			switch(problemLocation) {
//			
//			case 1:
//				System.out.println("앞왼쪽 한국타이어로 교체");
////				c1.frontLeft=new HankookTire("앞왼쪽",15);
//				c1.tires[0]=new HankookTire("앞왼쪽",15);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 한국타이어로 교체");
////				c1.frontRight=new HankookTire("앞오른쪽",13);
//				c1.tires[1]=new HankookTire("앞오른쪽",13);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 금호타이어로 교체");
////				c1.backLeft=new KumhoTire("뒤왼쪽",14);
//				c1.tires[2]=new KumhoTire("뒤왼쪽",14);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 금호타이어로 교체");
////				c1.backRight=new KumhoTire("뒤오른쪽",17);
//				c1.tires[3]=new KumhoTire("뒤오른쪽",17);
//				break;
//				
//			}
			System.out.println("--------------------------");
		}
		
	}
}
//lecture
//기능별로 객체를 나눈 구조
//나눠서 좀더 복잡하게 보이지만 유지보수가 쉬운형태

//객체별 기능(개인 메모)
//Tire,KumhoTire,HankookTire 
//	1.멤버변수 : 바퀴 수명 관련 변수
//		최대횟수, 누적횟수
//	2.메서드 : 바퀴 수명 다했을 때 고장메세지 출력
//		조건문
//Car
//	1.멤버변수 : 바퀴 4개
//		타이어객체 참조변수 4개를 선언한다. 
//		객체배열을 사용하면 편리함
//	2. 메서드 : 운전 기능 , 운전종료 기능
//		(1)운전 기능
//			실행 1번에 타이어 4개에 변화를 주어야 하므로, 반복문으로 멤버변수 4개를 전부 불러낸다.
//			배열을 내용으로 하는 반복문
//		(2) 운전종료 기능
//			메세지를 출력한다. 또는 boolean값을 리턴하기도 한다.
//CarEx
//	1.멤버변수
//		자동차 1개를 운전하므로, Car참조변수 1개
//	2.메서드
//		주행 횟수마다(반복문 형태) 타이어의 수명을 출력하고(-->Car클래스의 run메서드) 
//		수명이 0이 되면(조건문 형태) 교체한다(-->타이어 참조변수에 새 객체 주소값을 할당)
