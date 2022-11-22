package inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone p1 = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("model : "+p1.model);
		System.out.println("model : "+p1.color);
		System.out.println("model : "+p1.channel);
		
		p1.powerOn();
		p1.bell();
		p1.sendVoice("여보세요?");
		p1.receiveVoice("안녕하세요. OOO 입니다.");
		p1.sendVoice("네, 반갑습니다");
		p1.hangUp();
		
		p1.turnOnDmb();
		p1.changChannelDmb(12);
		p1.turnOffDmb();
	}
}
