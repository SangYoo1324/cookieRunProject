package Cookies3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;


public class GameScreen extends Thread {
private Image fieldImage = new ImageIcon(Main.class.getResource("/Images/fieldImage.png")).getImage();



//private ImageIcon monsterHpBar = new ImageIcon(Main.class.getResource("/Images/hpBar.png"));

//ArrayList<cookie> cookieList = new ArrayList<cookie>();		moved to the mapScreen
//ArrayList<Monster> monsterList = new ArrayList<Monster>();  moved to the mapScreen

mapScreen ms = new mapScreen();
int charIndex;
//skillRelated
//Identify the char Index on the ArrayList 
public static int monsterIndex;// Identify the monster Index on the ArrayList 
public static boolean isSkillProceed= false;
public boolean inflictedDmg = false;




public String skillName =ms.cookieList.get(charIndex).getSkill2();
public skillInfo si = new skillInfo(skillName);

	//Char Slot 1
	ImageIcon charImage1= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(0).getCookieImage()));
	ImageIcon charImageIcon1= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(0).getCookieIcon()));
	JButton charIconButton1 = new JButton(charImageIcon1);
	JLabel charLabel1 = new JLabel(charImage1);


	//Char Slot 2
	ImageIcon charImage2= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(1).getCookieImage()));
	ImageIcon charImageIcon2= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(1).getCookieIcon()));
	JButton charIconButton2 = new JButton(charImageIcon2);
	JLabel charLabel2 = new JLabel(charImage2);

	//Char Slot 3
	ImageIcon charImage3= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(2).getCookieImage()));
	ImageIcon charImageIcon3= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(2).getCookieIcon()));
	JButton charIconButton3 = new JButton(charImageIcon3);
	JLabel charLabel3 = new JLabel(charImage3);

	//Char slot 5
	ImageIcon charImage4= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(3).getCookieImage()));
	ImageIcon charImageIcon4= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(3).getCookieIcon()));
	JButton charIconButton4 = new JButton(charImageIcon4);
	JLabel charLabel4 = new JLabel(charImage4);
	//char Slot 5
	ImageIcon charImage5= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(4).getCookieImage()));
	ImageIcon charImageIcon5= new ImageIcon(Main.class.getResource("/Images/"+ms.cookieList.get(4).getCookieIcon()));
	JButton charIconButton5 = new JButton(charImageIcon5);
	JLabel charLabel5 = new JLabel(charImage5);


	//Monster 1
	ImageIcon MonsterImage1= new ImageIcon(Main.class.getResource("/Images/"+ms.monsterList.get(0).getMonsterImage()));
	JButton MonsterButton1 = new JButton(MonsterImage1);
	//Monster 2
	ImageIcon MonsterImage2= new ImageIcon(Main.class.getResource("/Images/"+ms.monsterList.get(1).getMonsterImage()));
	JButton  MonsterButton2 = new JButton(MonsterImage2);

	ImageIcon MonsterImage3= new ImageIcon(Main.class.getResource("/Images/"+ms.monsterList.get(2).getMonsterImage()));
	JButton MonsterButton3 = new JButton(MonsterImage3);

	ImageIcon MonsterImage4= new ImageIcon(Main.class.getResource("/Images/"+ms.monsterList.get(3).getMonsterImage()));
	JButton MonsterButton4 = new JButton(MonsterImage4);

	ImageIcon MonsterImage5= new ImageIcon(Main.class.getResource("/Images/"+ms.monsterList.get(4).getMonsterImage()));
	JButton MonsterButton5 = new JButton(MonsterImage5);	



private int mouseX, mouseY;
//public int Idrag=0;
public GameScreen(){

	
 

//cookie Infos inside the ArrayList-- moved to the mapScreen

charIconButton1.setBounds(600,750, 89, 80);
charIconButton1.setVisible(true);
charIconButton1.setBorderPainted(false);
charIconButton1.setBackground(new Color(0,0,0,0));
charIconButton1.addMouseListener(new MouseAdapter() {
	@Override
	public void mousePressed(MouseEvent e) {// from other class field. construction materials cannot be used.
		buttonClick0();
		
	}
});
//charIconButton1.addMouseListener(new mouseEventGame(charIconButton1,charImage1, charImageIcon1,"Freeze",0 ));

charIconButton2.setBounds(700, 750, 89, 80);
charIconButton2.setVisible(true);
charIconButton2.setBorderPainted(false);
charIconButton2.setBackground(new Color(0,0,0,0));
charIconButton2.addMouseListener(new MouseAdapter() {
	@Override
	public void mousePressed(MouseEvent e) {
		buttonClick1();
	}
});
//charIconButton2.addMouseListener(new mouseEventGame(charIconButton2,charImage2, charImageIcon2, "Amplify",1));
//ms.cookieList.get(1).getSkill2()

charIconButton3.setBounds(800, 750,89, 80);
charIconButton3.setVisible(true);
charIconButton3.setBorderPainted(false);
charIconButton3.setBackground(new Color(0,0,0,0));
//charIconButton3.addMouseListener(new mouseEventGame(charIconButton3,charImage3, charImageIcon3,ms.cookieList.get(2).getSkill2() ,2));

charIconButton4.setBounds(900, 750, 89, 80);
charIconButton4.setVisible(true);
charIconButton4.setBorderPainted(false);
charIconButton4.setBackground(new Color(0,0,0,0));
//charIconButton4.addMouseListener(new mouseEventGame(charIconButton4,charImage4, charImageIcon4,ms.cookieList.get(3).getSkill2(),3 ));

charIconButton5.setBounds(1000, 750, 89, 80);
charIconButton5.setVisible(true);
charIconButton5.setBorderPainted(false);
charIconButton5.setBackground(new Color(0,0,0,0));
//charIconButton5.addMouseListener(new mouseEventGame(charIconButton5,charImage5, charImageIcon5,ms.cookieList.get(4).getSkill2(), 4 ));
	


//backLinePlacing
charLabel1.setBounds(100,100,250,250);
charLabel1.setVisible(true);
charLabel1.setBackground(new Color(0,0,0,0));


charLabel2.setBounds(100,350,250,250);
charLabel2.setVisible(true);
charLabel2.setBackground(new Color(0,0,0,0));

charLabel3.setBounds(100,600,250,250);
charLabel3.setVisible(true);
charLabel3.setBackground(new Color(0,0,0,0));

charLabel4.setBounds(400,300,250,200);
charLabel4.setVisible(true);
charLabel4.setBackground(new Color(0,0,0,0));

charLabel5.setBounds(400,500,250,200);
charLabel5.setVisible(true);
charLabel5.setBackground(new Color(0,0,0,0));


//frontLinePlacing

	
	
//monsterPlacing

MonsterButton1.setBounds(900,300, 150, 150);
MonsterButton1.setVisible(true);
MonsterButton1.setBorderPainted(false);
MonsterButton1.setBackground(new Color(0,0,0,0));
	
MonsterButton2.setBounds(900,500, 150, 150);
MonsterButton2.setVisible(true);
MonsterButton2.setBorderPainted(false);
MonsterButton2.setBackground(new Color(0,0,0,0));

MonsterButton3.setBounds(1100,300, 150, 150);
MonsterButton3.setVisible(true);
MonsterButton3.setBorderPainted(false);
MonsterButton3.setBackground(new Color(0,0,0,0));

MonsterButton4.setBounds(1100,500, 150, 150);
MonsterButton4.setVisible(true);
MonsterButton4.setBorderPainted(false);
MonsterButton4.setBackground(new Color(0,0,0,0));

MonsterButton5.setBounds(1300,400, 150, 150);
MonsterButton5.setVisible(true);
MonsterButton5.setBorderPainted(false);
MonsterButton5.setBackground(new Color(0,0,0,0));
	
	
}



public void screenDraw(Graphics g) {
	g.drawImage(fieldImage,0,0,null);
	
//	if(inflictedDmg == false) {
	//hpBar
/*	g.fillRect(900, 250, (int)(1.5*ms.monsterList.get(0).getHp()), 50);
	g.setColor(Color.GREEN);
	g.fillRect(900, 450,(int)(1.5*ms.monsterList.get(0).getHp()), 50);
	g.setColor(Color.GREEN);
	g.fillRect(1100, 250,(int)(1.5*ms.monsterList.get(0).getHp()), 50);
	g.setColor(Color.GREEN);
	g.fillRect(1100, 450,(int)(1.5*ms.monsterList.get(0).getHp()), 50);
	g.setColor(Color.GREEN);
	g.fillRect(1300, 350, (int)(1.5*ms.monsterList.get(0).getHp()), 50);
	g.setColor(Color.GREEN);
//	}
	*/

	if(isSkillProceed)
	si.screenDraw(g);
	
	//Monster Hp Icons


}
public void buttonClick0() {
	
	charIndex =0;
	
	charIconButton1.setIcon(charImage1);
	System.out.println("pressed");
	isSkillProceed= true;
	inflictedDmg = true;
	
	
	si.start();

	System.out.println(skillName);
}

public void buttonClick1() {
	
	charIndex =1;
	
	charIconButton1.setIcon(charImage1);
	System.out.println("pressed");
	isSkillProceed= true;

	
	
	System.out.println(skillName);
}
public void drawEnemyHpBar(Graphics g) {
	
}
}