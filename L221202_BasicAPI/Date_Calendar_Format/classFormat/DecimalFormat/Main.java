package classFormat.DecimalFormat;

import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		double num=1234567.89;
//		0은 유효하지 않은 0도 표시한다
//		#는 유효하지 않은 0은 생략한다.
		
		DecimalFormat df=new DecimalFormat("0");
		System.out.println(df.format(num));
//		java.text.NumberFormat.format()
//		1234568
		
		df=new DecimalFormat("0.0");
		System.out.println(df.format(num));
//		1234567.9
		
		df=new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
//		0001234567.89000
		
		df=new DecimalFormat("#");
		System.out.println(df.format(num));
//		1234568
		
		df=new DecimalFormat("##########.#####");
		System.out.println(df.format(num));
//		1234567.89
		
		df=new DecimalFormat("#.0");
		System.out.println(df.format(num));
//		1234567.9
		
		df=new DecimalFormat("+#.0");
		System.out.println(df.format(num));
//		+1234567.9
		
		df=new DecimalFormat("-#.0");
		System.out.println(df.format(num));
//		-1234567.9
		
		df=new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
//		1,234,567.9
		
		df=new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
//		1.2E6
		
		df=new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num));
//		+1,234,568 
		
		df=new DecimalFormat("#.# %");
		System.out.println(df.format(num));
//		123456789 %
//		자동으로x100하여 백분율로 표현해준다
		
		df=new DecimalFormat("\u00A4 #.###");
		System.out.println(df.format(num));
//		₩ 1234567.89
		
		df=new DecimalFormat();
		System.out.println(df.format(num));
//		1,234,567.89 기본 생성자는 미국식 숫자 콤마찍기한다

	}
}
