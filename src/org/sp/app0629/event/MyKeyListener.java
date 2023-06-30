package org.sp.app0629.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener{

	public void keyTyped(KeyEvent e) {
		System.out.println("KeyTyped 호출");
	}

	//키누를때 js의 keydown과 비슷
	public void keyPressed(KeyEvent e) {
		System.out.println("KeyPressed 호출");
	}

	//키눌렀다 땔때 js의 keyup과 비슷
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased 호출");
	}

}
