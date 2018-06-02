package pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		 if (e.getKeyCode()== KeyEvent.VK_UP ) {
			 Var.moveup = true;
		 } else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			 Var.movedown = true;
		 } else if (e.getKeyCode()== KeyEvent.VK_Q ) {
			 Var.gegnermoveup = true;
		 } else if (e.getKeyCode()== KeyEvent.VK_W) {
			 Var.gegnermovedown = true;
		 }
		 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 if (e.getKeyCode()== KeyEvent.VK_UP ) {
			 Var.moveup = false;	
		 } else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			 Var.movedown = false;
		 } else if (e.getKeyCode()== KeyEvent.VK_Q ) {
			 Var.gegnermoveup = false;	
		 } else if (e.getKeyCode()== KeyEvent.VK_W) {
			 Var.gegnermovedown = false;
		 } else if (e.getKeyCode()== KeyEvent.VK_C) {
			 Var.modeCouleurs = true;
		 } else if (e.getKeyCode()== KeyEvent.VK_B) {
			 Var.modeCouleurs = false;
		 } else if (e.getKeyCode()== KeyEvent.VK_A) {
			 Var.gegnerModeAuto = true;
		 } else if (e.getKeyCode()== KeyEvent.VK_Z) {
			 Var.gegnerModeAuto = false;
		 } 
		 		 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	} 

}
