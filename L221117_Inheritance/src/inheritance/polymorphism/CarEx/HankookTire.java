package inheritance.polymorphism.CarEx;

public class HankookTire extends Tire {
	public int accumulatedRotation;

	HankookTire(String location,int maxRotation){
		super(location,maxRotation);
	}

	public boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "의 HankookTire의 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println(location + "의 HankookTire 펑크");
			return false;
		}
	}
}
