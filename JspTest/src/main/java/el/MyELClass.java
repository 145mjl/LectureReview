package el;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyELClass {
	public String getGender(String jumin) {
		String returnStr="";
		int genderInt=Integer.parseInt(jumin.substring(7,8));
		if(genderInt==1||genderInt==3) {
			returnStr="남자";
		}else if(genderInt==2||genderInt==4) {
			returnStr="여자";
		}else {
			returnStr="주민번호 오류입니다.";
		}
		return returnStr;
	}
	
	public static boolean isNumber(String value) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher=pattern.matcher(value);
		return matcher.find();
		
//		char[] chArr=value.toCharArray();
//		for(int i=0;i<chArr.length;i++) {
//			if(!(chArr[i]>='0' && chArr[i]<='9')) {
//				return false;
//			}
//		}
//		return true;
	}
	
	public static String showGugudan(int limitDan) {
		StringBuffer sb=new StringBuffer();
		
		try {
			sb.append("<table border='1'>");
			for(int i=2;i<=limitDan;i++) {
				sb.append("<tr>");
				for(int j=1; j<=9;j++) {
					sb.append("<td>");
					sb.append(i);
					sb.append(" x ");
					sb.append(j);
					sb.append(" = ");
					sb.append(i*j);
					sb.append("</td>");
				}
				sb.append("</tr>");
			}
			sb.append("</table>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
