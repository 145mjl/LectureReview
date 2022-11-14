package p191;

import java.util.Arrays;

public class Ex5_2 {
 public static void main(String[] args) {
	 int[] ar1=new int[10];
	 int[] ar2=new int[10];
	 int[] ar3=new int[] {100,95,80,70,60};
	 char[] ar4=new char[] {'a','b','c','d'};
	 
	 for(int i=0;i<ar1.length;i++) {
		 ar1[i]=i+1;
	 }
	 
	 for(int i=0;i<ar2.length;i++) {
		 ar2[i]=(int)(Math.random()*10)+1;
	 }
	 
	 System.out.println();
	 System.out.println(Arrays.toString(ar1));
	 System.out.println(Arrays.toString(ar2));
	 System.out.println(Arrays.toString(ar3));
	 System.out.println(Arrays.toString(ar4));
	 System.out.println(ar3);
	 System.out.println(ar4);
 }
}
//틀린부분 : 직접 적다보니 Arrays.toString뒤에 대괄호를 썼다
//메서드() 형태를 기억하기
