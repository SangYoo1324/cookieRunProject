package Cookies;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class mouseEventGame implements MouseListener {
	ImageIcon II;
	
	public mouseEventGame(ImageIcon II) {
		this.II = II;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	

		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		II= new ImageIcon(Main.class.getResource("/Images/eclairIcon.png"));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
