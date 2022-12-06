package p265;

class Data {int x;}

public class ReferensParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;

		System.out.printf("main() : x = %d\n",d.x);
		
		change(d);
		System.out.printf("After change(d.x)\nmain() : = %d ",d.x);
		
	}
	
	static void change(Data d) {
		d.x=1000;
		System.out.printf("change() : x = %d\n",d.x);

	}

}
