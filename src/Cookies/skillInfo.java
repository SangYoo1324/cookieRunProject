package Cookies;

import java.awt.Graphics;
import java.awt.*;
import javax.swing.ImageIcon;

public class skillInfo extends Thread{
	public static int x, y;
	private String skillName ;
	private Image Freeze = new ImageIcon(Main.class.getResource("/Images/SkillEffect/freeze.png")).getImage();
	 GameScreen gs;
	 int mobHp;
	public skillInfo(String skillName) {
		this.skillName = skillName;
		
	}

	
	public void screenDraw( Graphics g) {
		if(this.skillName.equals("Freeze")) {
			g.drawImage(Freeze,500-x,100+y,null );
		}
			
		
	}
	public void descend() {
		if(skillName.equals("Freeze")) {
			y+=10;
			System.out.println("Skillproceed");
			getHit();
		}
		else
			interrupt();
			
	}
	@Override 
	public void run() {
	try {
		while(true) {
			descend();
			if(GameScreen.isSkillProceed) {
				Thread.sleep(10);
				
			}
			//if((100+y)==900) {
			//	GameScreen.isSkillProceed = false;
			//	System.out.println("hit!");
			//	y=0;}
			
	
			else {
				interrupt();
				y=0;
				break;
			}
		}
	}catch(Exception e) {
		System.err.println(e.getMessage());
	}
	}
public void getHit() {
	gs = new GameScreen();
	if(y==gs.monsterLine.getY()) {
		y=0;
		GameScreen.isSkillProceed= false;
		System.out.println("hit!");
		//hp decrease
		mapScreen ms = new mapScreen();
		for (int i = 0; i<ms.monsterList.size(); i++) {
		 mobHp= ms.monsterList.get(0).getHp();
		mobHp-= 10;
		System.out.println(mobHp);}
		
	}
}
}
