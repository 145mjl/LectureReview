package arrayListLinkedListTest;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList(2000000);
		LinkedList ll=new LinkedList();
		
		System.out.println("=순차적으로 추가하기=");
		System.out.println("ArrayList :"+add1(al));
		System.out.println("LinkedList :"+add1(ll));
		System.out.println();
		System.out.println("=중간에 추가하기=");
		System.out.println("ArrayList :"+add2(al));
		System.out.println("LinkedList :"+add2(ll));
		System.out.println();
		System.out.println("=중간에서 삭제하기=");
		System.out.println("ArrayList :"+remove2(al));
		System.out.println("LinkedList :"+remove2(ll));
		System.out.println();
		System.out.println("=순차적으로 삭제하기=");
		System.out.println("ArrayList :"+remove1(al));
		System.out.println("LinkedList :"+remove1(ll));
		
	}
	public static long add1(List list) {
		long start=System.currentTimeMillis();
		for(int i=0; i<100000 ;i++) list.add(i+"");
		long end=System.currentTimeMillis();
		return end-start;
	}
	public static long add2(List list) {
		long start=System.currentTimeMillis();
		for(int i=0; i<100000 ;i++) list.add(500,"X");
		long end=System.currentTimeMillis();
		return end-start;
	}
	public static long remove1(List list) {
		long start=System.currentTimeMillis();
		for(int i=list.size()-1; i>=0 ;i--) list.remove(i);
		long end=System.currentTimeMillis();
		return end-start;
	}
	public static long remove2(List list) {
		long start=System.currentTimeMillis();
		for(int i=0; i<100000 ;i++) list.remove(i);
		long end=System.currentTimeMillis();
		return end-start;
	}
	
}

//반복횟수 10k는 너무 빠르고 1M은 너무 느려서 100k로
//=순차적으로 추가하기=
//ArrayList :17
//LinkedList :20
//
//=중간에 추가하기=
//ArrayList :1765
//LinkedList :89
//
//=중간에서 삭제하기=
//ArrayList :1366
//LinkedList :9101
//
//=순차적으로 삭제하기=
//ArrayList :2
//LinkedList :3