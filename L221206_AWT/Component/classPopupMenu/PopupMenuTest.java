package classPopupMenu;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("PopupMenu Test");
		f.setSize(300,200);
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
//				if(e.getModifiers()==e.BUTTON3_MASK) {
//					pMenu.show(f,e.getX(),e.getY());
//				}
				if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {//마우스버튼3 : 우클릭
					pMenu.show(f,e.getX(),e.getY());
				}
				/*Deprecated.  It is recommended that 
				 * extended modifier keys and getModifiersEx() be used instead. 
				 * Returns the modifier mask for this event*/
				/*It is recommended that BUTTON3_DOWN_MASK and getModifiersEx() be used instead. 
				 Note that BUTTON3_MASK has the same value as META_MASK.
				 The Mouse Button3 modifier constant.*/

			}
		});
		f.setVisible(true);
	}
}
