package utils;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	Map<String,Cookie> cookieMap=new HashMap<String,Cookie>();
	
	//Map<이름,쿠키객체> 생성자
	public CookieBox(HttpServletRequest request) {
		Cookie[] cookies=request.getCookies();
		
		if(cookies!=null && cookies.length>0) {
			for(int i=0;i<cookies.length;i++) {
				cookieMap.put(cookies[i].getName(), cookies[i]);
			}
		}
	}
	
	//쿠키 값 가져오기(param name)
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	
	//쿠키 값 가져오기 (param name)
	public String getValue(String name) throws IOException{
		Cookie cookie=cookieMap.get(name);
		if(cookie==null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(),"UTF-8");
	}
	
	//쿠키 존재 여부 확인(param name)
	public boolean exists(String name) {
		return cookieMap.get(name)!=null;
	}
	
	//쿠키 생성 메서드 (Overload)
	//이름,값
	//이름,값,path,유지시간
	//이름,값,path,유지시간,domain
	public static Cookie createCookie(String name,String value) {
		Cookie cookie=new Cookie(name,value);
		return cookie;
	}
	
	public static Cookie createCookie(String name,String value,String path,int maxAge) {
		Cookie cookie=new Cookie(name,value);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	public static Cookie createCookie(String name,String value,String path,
			int maxAge,String domain) {
		Cookie cookie=new Cookie(name,value);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		cookie.setDomain(domain);
		
		return cookie;
	}
}
