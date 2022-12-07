package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Calculator{
	public static void calculator(String str) {
		//규칙 : 숫자는 계속계속쓸수있음(텍스트필드에 반영)
		//규칙2 : 연산자(=,백스페이스,부호바꾸기 제외)는 연속으로 쓰면 누적합하지말고 바꾸어버릴것(텍스트필드에도 반영)
		//규칙3 : .은 숫자값에 포함되면서도 연속으로 쓰면 무시해야함(텍스트필드에 반영) 또한 . 다음엔 숫자가 와야함
		//=를 입력하기 전까지는 계속 문자열을 누적합함(계산 메서드 쪽은 계속 계산은 하되 출력은 하면안됨)
		//=를 입력하면 결과를 출력함(계산메서드쪽은 결과를 출력해야함)
		double result=0;
		String opStr="";
		boolean dot=false;
		boolean op=false;
		int count=0;
		//경우의 수
		//숫자숫자 -> 이어붙임
		//숫자. -> 스킵
		//숫자연산자 -> 스킵
		//숫자= ->ouput
		//숫자부호 -> 부호바꾸기
		//숫자백스페이스 ->지우기
		//.숫자 -> 소수점계산해주기
		//.숫자숫자숫자... -> 계속 소수점 //count변수 필요
		
		//.. -> .이 1개로 취급
		//.연산자 ->.이 무시됨
		
		if(isNumeric(str)&&!dot) {//직전에 연산자 입력 없음
		}else if(isNumeric(str)&&dot){//.숫자 입력됨 -> 소수점반영
			
		}else if(dot && str.equals(".")) { 
		}else if(!dot && str.equals(".")) {
			
		}else{
		}
		
		
	}
	
	//숫자인지 검사하는 메서드
	//예외처리도 복습하기...
	public static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}

public class Main extends WindowAdapter implements ActionListener{
	
	private Frame f;
	private TextField input;
	private Panel p1;
	private Panel p2;
	private Panel p3;
	private Button[] num;
	private Button[] operator;
	private String[] operList=new String[]{"+","-","x","÷","=","←","+/-","."};
	
	public Main() {
		f=new Frame("계산기");
		input=new TextField(10);
		
		p1=new Panel();
		p2=new Panel();
		num=new Button[10];
		for(int i=0;i<num.length;i++) {
			num[i]=new Button(""+i);//0 ~ 9
		}
		
		p3=new Panel();
		operator=new Button[operList.length];
		for(int i=0;i<operator.length;i++){
			operator[i]=new Button(operList[i]);
		}
	}
	
	public void startFrame() {
		f.setSize(300,600);
		f.add(input);
		f.add(p1,BorderLayout.CENTER);
		f.add(p2,BorderLayout.SOUTH);
		f.add(p3,BorderLayout.EAST);
		
		p1.setLayout(new GridLayout());
		for(int i=1;i<num.length;i++) {
			p1.add(num[i]);
		}
		
		p2.setLayout(new GridLayout());//아래쪽
		p2.add(operator[6]);
		p2.add(num[0]);
		p2.add(operator[7]);//개선해야할부분
		
		p3.setLayout(new GridLayout());//오른쪽
		for(int i=0;i<operator.length-3;i++) {
			p3.add(operator[i]);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//액션퍼폼드메서드는 간단하게 모든입력에 반응하게만 설계
		
//		StringTokenizer st = new StringTokenizer(tmp,"+|-|x|÷|+/-");
//		int count=st.countTokens();
//		double[] ar=new double[count];
//		for(int i=0;i<count;i++) {
//			ar[i]=Double.parseDouble(st.nextToken());
//		}
		//**구분자를 여러개 사용하려면 | 연산자를 사용하면 된다**
		//**parse메서드 복습할것
		
		String tmp="";
		
		for(int i=0;i<num.length;i++) {
			if(e.getActionCommand().equals(i+"")) {
				tmp=i+"";
			}
		}
		
		for(int i=0;i<operator.length;i++) {
			if(e.getActionCommand().equals(operList[i])){
				tmp=operList[i];
			}
		}
		
		Calculator.calculator(tmp);
	}
	
	
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}
	
}
//계산기에 쓸만한 기능들
//Frame
//Button
//Panel
//GridLayout - 아래쪽 패널
//TextField
//ActionListner
//WindowListner - Adapter
