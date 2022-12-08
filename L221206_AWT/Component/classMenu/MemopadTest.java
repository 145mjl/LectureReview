package classMenu;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MemoPadEx{
	
	private Frame f;
	private MenuBar mBar;
	private Menu[] menu;
	private MenuItem[][] mItems;
	private String[] menuList= {"파일","편집","서식","보기","도움말","확대하기/축소하기"};
	private String[][] mItemsList= {{"새로 만들기","새 창","열기","저장","다른 이름으로 저장",
			"페이지 설정","인쇄",
			"끝내기"},
			{"실행 취소",
			"잘라내기","복사","붙여넣기","삭제",
			"Bing으로 검색","찾기","다음 찾기","이전 찾기","바꾸기","이동",
			"모두 선택","시간/날짜"},
			{"자동 줄 바꿈","글꼴"},
			{},//메뉴 중 보기는 menu[5]와 CheckboxMenuItem statusbar만 추가함
			{"도움말 보기","피드백 보내기",
			"메모장 정보"},			
			{"확대","축소","확대하기/축소하기 기본값 복원"}
	};
	private CheckboxMenuItem statusbar;
	private PopupMenu pMenu1,pMenu2;
	private MenuItem[] pMenuItem;
	private String[] pMenuItemsList= {"실행 취소","잘라내기","복사","붙여넣기","삭제","모두 선택","오른쪽에서 왼쪽으로 읽기","유니코드 제어 문자 표시","Bing으로 검색"};
	
	public MemoPadEx() {//초기화
		f = new Frame("제목 없음 - Windows 메모장");
		mBar=new MenuBar();
		menu=new Menu[menuList.length];
		for(int i=0;i<menu.length;i++) {
			menu[i]=new Menu(menuList[i]);
		}
		mItems=new MenuItem[mItemsList.length][];//가변배열
		for(int i=0;i<mItemsList.length;i++) {
			mItems[i]=new MenuItem[mItemsList[i].length];
			//행열의 길이가 정해진것은 mItemsList이며
			//mItems는 정해지지 않았으므로 각 행마다 초기화해주어야 한다
			for(int j=0;j<mItemsList[i].length;j++) {
				mItems[i][j]=new MenuItem(mItemsList[i][j]);
				
			}
		}
		statusbar=new CheckboxMenuItem("상태 표시줄");
		pMenu1=new PopupMenu();
		pMenu2=new PopupMenu("유니코드 제어 문자 삽입");
		pMenuItem=new MenuItem[pMenuItemsList.length];
		for(int i=0;i<pMenuItemsList.length;i++) {
			pMenuItem[i]=new MenuItem(pMenuItemsList[i]);
		}
	}
	
	public void startFrame() {//set , add
		f.setSize(300,200);
		
		
		for(int i=0;i<menuList.length-1;i++) {//확대축소 제외
			mBar.add(menu[i]);
		}
		
		
		for(int i=0;i<mItemsList.length;i++) {
			if(menu[i].getLabel().equals("보기")) {//메뉴 라벨이 "보기"일때
				menu[i].add(menu[5]);//확대축소
				menu[i].add(statusbar);//상태표시줄(체크박스 메뉴 아이템)
			}
			for(int j=0;j<mItemsList[i].length;j++) {//가변배열에서 입력받아 초기화
				menu[i].add(mItems[i][j]);
			}
		}
		menu[0].insertSeparator(5);
		menu[0].insertSeparator(8);
		menu[1].insertSeparator(1);
		menu[1].insertSeparator(6);
		menu[1].insertSeparator(13);
		menu[4].insertSeparator(2);
		//insertSeperator()의 index의 정확한 의미 : 분리선이 index번째 메뉴아이템이 되는 것
		//또한 pMenu1.add(pMenu2);처럼 메뉴가 끼어있는 경우 빼고 세어야함
		
		f.setMenuBar(mBar);//frame 객체에 추가시켜야 보이게 된다
		
		
		f.add(pMenu1);
		for(int i=0;i<pMenuItem.length;i++) {
			if(i==pMenuItem.length-1) {
				pMenu1.add(pMenu2);
			}
			pMenu1.add(pMenuItem[i]);
		}
		pMenu1.insertSeparator(1);
		pMenu1.insertSeparator(6);
		pMenu1.insertSeparator(8);
		pMenu1.insertSeparator(12);
		
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
					pMenu1.show(f, e.getX(), e.getY());
				}
			}
		});
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
	}
}


public class MemopadTest {
	
	public static void main(String[] args) {
		
		
		MemoPadEx m1 = new MemoPadEx();
		m1.startFrame();
		
	}
}

