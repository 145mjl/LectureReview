package classMenu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300,200);
		
		MenuBar	mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		//메뉴의 모든 아이템은 이 클래스 또는 자식클래스에서 가져와야 한다.
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
//		mFile.addSeparator();//mFile.insertSeparator(3);와 동일
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("statusbar");
		mView.add(miStatusbar);
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);//기존의 Help 메뉴가 있을 경우 그것을 대체한다.
		
		f.setMenuBar(mb);
		f.setVisible(true);
		
		
	}
}
