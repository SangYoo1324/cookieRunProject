package Cookies;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;


public class GameScreen {
private Image fieldImage = new ImageIcon(Main.class.getResource("/Images/fieldImage.png")).getImage();
JPanel charIconSlot = new JPanel();
JPanel frontLine = new JPanel();
JPanel backLine =  new JPanel();
JPanel monsterLine = new JPanel();
ArrayList<cookie> cookieList = new ArrayList<cookie>();
ArrayList<Monster> monsterList = new ArrayList<Monster>();
//mouseEventGame meg;


private int mouseX, mouseY;
public int Idrag=0;
public GameScreen(){

	cookieList.add(new cookie("frostQueen","frostQueen.png","frostQueenIcon.png","Freeze","Zero", 10, 100,"back") );
	cookieList.add(new cookie("eclair","elcair.png","eclairIcon.png","amplify","Shield", 10, 100,"front") );
	cookieList.add(new cookie("pureVanilla","pureVanilla.png","pureVanillaIcon.png","heal","defBuff", 10, 100, "back") );
	cookieList.add(new cookie("holyBerry","holyBerry.png","holyBerryIcon.png","selfHeal","dmgReduction", 10, 100,"front") );
	cookieList.add(new cookie("mokka","mokka.png","mokkaIcon.png","dotHeal","dmgReduction", 10, 100,"back") );

	
	monsterList.add(new Monster("blueMonster.png","defaultAttack",10,100,"back"));
	monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
	monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
	monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
	monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
	
	//charIconSlot
	charIconSlot.setLayout(new GridLayout(1,cookieList.size(), 1, 1));
	charIconSlot.setBounds(600, 600, 500,400);
	charIconSlot.setBackground(new Color(0,0,0,0));
	//charIconSlot.setVisible(true);
	
	ImageIcon charIcon[] = new ImageIcon[cookieList.size()];
	JButton buttonIcon[]  = new JButton[cookieList.size()];
	int[] buttonX = new int[cookieList.size()];
	int[] buttonY = new int[cookieList.size()];
 //	for(Idrag=0; Idrag<cookieList.size(); Idrag++) {
		while(Idrag<cookieList.size()) {
		charIcon[Idrag]=  new ImageIcon(Main.class.getResource("/Images/"+cookieList.get(Idrag).getCookieIcon()));
		buttonIcon[Idrag] = new JButton(charIcon[Idrag]);
		buttonIcon[Idrag].setVisible(true);
		buttonIcon[Idrag].setBorderPainted(false);
		buttonIcon[Idrag].setContentAreaFilled(false);
		buttonIcon[Idrag].setFocusPainted(false);
	//	mouseEventGame meg = new mouseEventGame(charIcon[Idrag]);
		buttonIcon[Idrag].addMouseListener(new mouseEventGame(charIcon[Idrag]));
	
		charIconSlot.add(buttonIcon[Idrag]);
		Idrag++;
	}
	
	//backLinePlacing
	backLine.setBounds(10, 100, 400,600);
	backLine.setBackground(new Color(0,0,0,0));
	int backLineNum = 0;
	for(int i =0; i<cookieList.size(); i++ ) {
		if(cookieList.get(i).getType().equals("back")){
			charIcon[i]=  new ImageIcon(Main.class.getResource("/Images/"+cookieList.get(i).getCookieImage()));
			buttonIcon[i] = new JButton(charIcon[i]);
			buttonIcon[i].setVisible(true);
			buttonIcon[i].setBorderPainted(false);
			buttonIcon[i].setContentAreaFilled(false);
			buttonIcon[i].setFocusPainted(false);
			backLine.add(buttonIcon[i]);
			backLineNum++;
		}else continue;
		backLine.setLayout(new GridLayout(backLineNum,1, 20, 70));
		
	}
//frontLinePlacing
	frontLine.setBounds(300, 100, 500,600);
	frontLine.setBackground(new Color(0,0,0,0));
	int frontLineNum = 0;
	for(int i =0; i<cookieList.size(); i++ ) {
		if(cookieList.get(i).getType().equals("front")){
			charIcon[i]=  new ImageIcon(Main.class.getResource("/Images/"+cookieList.get(i).getCookieImage()));
			buttonIcon[i] = new JButton(charIcon[i]);
			buttonIcon[i].setVisible(true);
			buttonIcon[i].setBorderPainted(false);
			buttonIcon[i].setContentAreaFilled(false);
			buttonIcon[i].setFocusPainted(false);
			frontLine.add(buttonIcon[i]);
			backLineNum++;
		}else continue;
		frontLine.setLayout(new GridLayout(frontLineNum,1, 20, 70));
		
	}
	
	
//monsterPlacing
	
	monsterLine.setLayout(new GridLayout(monsterList.size(),1, 20, 20));
	monsterLine.setBounds(1000, 100, 500,700);
	monsterLine.setBackground(new Color(0,0,0,0));
	ImageIcon monsterIcon[] = new ImageIcon[monsterList.size()];
	JButton monsterbuttonIcon[]  = new JButton[monsterList.size()];
	for(int i = 0; i<monsterList.size(); i++) {
		monsterIcon[i]=  new ImageIcon(Main.class.getResource("/Images/"+monsterList.get(i).getMonsterImage()));
		monsterbuttonIcon[i] = new JButton(monsterIcon[i]);
		monsterbuttonIcon[i].setVisible(true);
		monsterbuttonIcon[i].setBorderPainted(false);
		monsterbuttonIcon[i].setContentAreaFilled(false);
		monsterbuttonIcon[i].setFocusPainted(false);
		monsterLine.add(monsterbuttonIcon[i]);
	}
	
}
public void screenDraw(Graphics g) {
	g.drawImage(fieldImage,0,0,null);

	


}

}