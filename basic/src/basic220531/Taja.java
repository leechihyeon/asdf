package basic220531;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Taja implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print(e.getKeyChar());
		
	}

	@Override//Ű�� ������ ����Ǵ� �Լ�
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
