package p201;

public class Ex5_10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		//numArr 배열에 난수 10개(0~9)생성하여 대입
		for(int i=0;i<numArr.length;i++) {
//			System.out.println(numArr[i]=(int)(Math.random()*10));
//			가독성 높이기
			numArr[i]=(int)(Math.random()*10);
			System.out.println(numArr[i]);
		}
		System.out.println();
		
		
		//버블소트
		//changed부분은 없어도 정렬은 됨
		for(int i=0;i<numArr.length-1;i++) {
			boolean changed=false;
			
			for(int j=0;j<numArr.length-1;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp=numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=tmp;
					changed=true;
				}
			}
			if(!changed) //changed==false가 true일때 break과 같은 뜻임
				break;
		}
		
		for(int k=0;k<numArr.length;k++) {
			System.out.print(numArr[k]+" ");
		}
		System.out.println();
	}
}
