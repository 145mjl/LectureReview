package fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

public class FileUtil {
	
	public static MultipartRequest uploadFile(HttpServletRequest req,String saveDirectory,int maxPostsize) {
		
		try {
			return new MultipartRequest(req, saveDirectory, maxPostsize, "UTF-8");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void download(HttpServletRequest req,HttpServletResponse resp,String directory,String sfileName,String ofileName) {
		
		//directory값은 "/Upload"라서 제대로 가공해준다
		String sDirectory=req.getServletContext().getRealPath(directory);
		try {
			//파일을 찾아 입력 스트림 생성
			File file=new File(sDirectory,sfileName);
			InputStream inputStream=new FileInputStream(file);
			
			//한글깨짐 방지
			String client=req.getHeader("User-Agent");//브라우저 알아오기
			if(client.indexOf("WOW64")== -1){//익스플로러인지
				ofileName=new String(ofileName.getBytes("UTF-8"),"ISO-8859-1");//아닐 경우 UTF-8
			}else{
				ofileName=new String(ofileName.getBytes("KSC5601"),"ISO-8859-1");//internet explorer
			}
			
			//파일 다운로드용 응답 헤더 설정.
			resp.reset();
			resp.setContentType("application/octet-stream");
			resp.setHeader("Content-Disposition", "attachment; filename=\""+ofileName+"\"");
			resp.setHeader("Content-length", ""+file.length());
			
			//response 내장 객체로부터 OutputStream 객체 생성
			OutputStream outputStream=resp.getOutputStream();
			
			//출력스트림에 파일 내용 출력
			byte b[]=new byte[(int)file.length()];
			int readBuffer=0;
			while((readBuffer=inputStream.read(b))>0){
				outputStream.write(b, 0, readBuffer);
				//스트림에서 읽어들인것을 (써낸것을) 저장할 것인데 ...
				//byte 배열에 저장하며
				//byte 배열의 index 0부터 시작한다.
				//int 길이만큼 저장한다. (만약 한방에 다 읽거나 쓰는경우 int len은 byte배열의 길이로 한다)
			}
			
			//입출력 스트림 닫음
			inputStream.close();
			outputStream.close();
		}catch(FileNotFoundException e) {
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteFile(HttpServletRequest req,String directory,String fileName) {
		String sDirectory=req.getServletContext().getRealPath(directory);
		File file=new File(sDirectory+File.separator+fileName);
		if(file.exists()) {
			file.delete();
		}
	}
}
