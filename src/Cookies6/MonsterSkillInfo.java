package Cookies6;

import java.awt.Image;
import java.util.ArrayList;
import java.awt.*;

import javax.swing.ImageIcon;

public class MonsterSkillInfo extends Thread {
private Image Freeze = new ImageIcon(Main.class.getResource("/Images/SkillEffect/freeze.png")).getImage();
private String skillName;
private int Dmg;
GameScreen gs = new GameScreen();

ArrayList<Cookie> cookieList = gs.returnCookieList();
	
MonsterSkillInfo(String skillName, int Dmg){
	
	this.skillName= skillName;
	this.Dmg = Dmg;
	
}

public void screenDraw(Graphics g) {
	if(skillName == "Default Attack");
}

public void skillUse() {
	if(skillName == "default Attack") {
		
	}
}
public int minHpIndex() {
	int min=1000;
	int minIndex=0;

	
	for(int i= 0; i<cookieList.size(); i++) {
		min=Math.min(cookieList.get(i).getHp(), min);
		if(min>=cookieList.get(i).getHp()) {
			minIndex =i;
		}
	}
	
	return minIndex;
}

public void monsterAttackProcess() {
	
}
}
