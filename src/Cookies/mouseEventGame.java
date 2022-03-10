package Cookies;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class mouseEventGame implements MouseListener {
	private JButton JB;
	private ImageIcon II;
	private ImageIcon IIR;
	private String skillName;
	private skillInfo si;
	public mouseEventGame(JButton JB,ImageIcon II, ImageIcon IIR, String skillName) {
		this.JB = JB;
		this.II = II;
		this.IIR = IIR;
		this.skillName = skillName;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JB.setIcon(II);
		System.out.println("pressed");
		GameScreen.isSkillProceed= true;
		si=new skillInfo(skillName);
		si.start();
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JB.setIcon(IIR);
		System.out.println("released");
//	GameScreen.isSkillProceed= false;
	
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
