package classFileDialog;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		FileDialog fileOpen = new FileDialog(f,"File Open",FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("C:\\Windows");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());
	}
}
//아무것도 선택하지 않으면 nullnull 출력하며, 파일을 선택하면 다음과 같이 출력된다 (실행은 구현 안했음)
//C:\Users\Administrator\Downloads\licensing.module.xdl64

// ... Downloads : getDirectory()
// licensing... : getFile()