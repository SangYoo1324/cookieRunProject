package Cookies;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class mouseEventGame implements MouseListener {
	JButton JB;
	ImageIcon II;
	ImageIcon IIR;
	int num;
	public mouseEventGame(JButton JB,ImageIcon II, ImageIcon IIR) {
		this.JB = JB;
		this.II = II;
		this.IIR = IIR;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	

		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JB.setIcon(II);
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JB.setIcon(IIR);
		System.out.println("released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
