package Cookies2;

import java.awt.Graphics;
import java.awt.*;
import javax.swing.ImageIcon;

public class skillInfo extends Thread{
	public static int x, y;
	private String skillName ;
	private Image Freeze = new ImageIcon(Main.class.getResource("/Images/SkillEffect/freeze.png")).getImage();
	private Image Shield = new ImageIcon(Main.class.getResource("/Images/SkillEffect/shield.png")).getImage();
	 GameScreen gs;
	 int mobHp;
	public skillInfo(String skillName) {
		this.skillName = skillName;
		
	}

	
	public void screenDraw( Graphics g) {
		if(this.skillName.equals("Amplify"))
		{
			g.drawImage(Shield, 100,100, null);
			g.drawImage(Shield, 100,350, null);
			g.drawImage(Shield, 100,600, null);
			g.drawImage(Shield, 400,300, null);
			g.drawImage(Shield, 400,500, null);
			System.out.println("amplify draw");
		}
		if(this.skillName.equals("Freeze")) {
			g.drawImage(Freeze,850,100+y,null );
			System.out.println("freeze draw");
		}
		
		
	}
	public void descend() {
		if(skillName.equals("Freeze")) {
			y+=10;
			System.out.println("Skillproceed");
			getHit();
		}
		if(skillName.equals("amplify")){
			y+=5;
		System.out.println("shield done");
		
		}
	
			
	}
	@Override 
	public void run() {
	try {
		while(true) {
			descend();
			if(GameScreen.isSkillProceed) {
				Thread.sleep(10);
				
			}
		//do not touch	//if((100+y)==900) {
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
	if(y==gs.MonsterButton1.getY()) {
		y=0;
		GameScreen.isSkillProceed= false;
		System.out.println("hit!");
		//hp decrease
		mapScreen ms = new mapScreen();
		for (int i = 0; i<ms.monsterList.size(); i++) {
		 mobHp= ms.monsterList.get(i).getHp();
		mobHp-= 10;
		System.out.println(mobHp);}
		
	}
}

public void getShield() {
	
}
}
