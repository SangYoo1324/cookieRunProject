package Cookies6;

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

MapScreen ms = new MapScreen(0,1,2,3,4,0,1,2,3,4);
int charIndex;
//skillRelated
//Identify the char Index on the ArrayList 
public static int monsterIndex;// Identify the monster Index on the ArrayList 
public static boolean isSkillProceed= false;
public static boolean isStaticSkill= false;

private String skillName;

public SkillInfo si;
public MonsterSkillInfo msi; 
private int mobHp1def = ms.monsterList.get(ms.select1).getHp();
private int mobHp2def = ms.monsterList.get(ms.select2).getHp();
private int mobHp3def = ms.monsterList.get(ms.select3).getHp();
private int mobHp4def = ms.monsterList.get(ms.select4).getHp();
private int mobHp5def = ms.monsterList.get(ms.select5).getHp();


private int mobHp1= (int)(150*(ms.monsterList.get(ms.select1).getHp())/mobHp1def);;
private int mobHp2= (int)(150*(ms.monsterList.get(ms.select2).getHp())/mobHp2def);;
private int mobHp3= (int)(150*(ms.monsterList.get(ms.select3).getHp())/mobHp3def);;
private int mobHp4= (int)(150*(ms.monsterList.get(ms.select4).getHp())/mobHp4def);;
private int mobHp5= (int)(150*(ms.monsterList.get(ms.select5).getHp())/mobHp5def);;

private int charHp1= (int)(2.5*ms.cookieList.get(ms.charSelect1).getHp());;
private int charHp2= (int)(2.5*ms.cookieList.get(ms.charSelect2).getHp());;
private int charHp3= (int)(2.5*ms.cookieList.get(ms.charSelect3).getHp());;
private int charHp4= (int)(2.5*ms.cookieList.get(ms.charSelect4).getHp());;
private int charHp5= (int)(2.5*ms.cookieList.get(ms.charSelect5).getHp());;

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
	@Override
	public void mouseReleased(MouseEvent e) {
		charIconButton1.setIcon(charImageIcon1);
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
	@Override
	public void mouseReleased(MouseEvent e) {
		charIconButton2.setIcon(charImageIcon2);
	}
});
//charIconButton2.addMouseListener(new mouseEventGame(charIconButton2,charImage2, charImageIcon2, "Amplify",1));
//ms.cookieList.get(1).getSkill2()

charIconButton3.setBounds(800, 750,89, 80);
charIconButton3.setVisible(true);
charIconButton3.setBorderPainted(false);
charIconButton3.setBackground(new Color(0,0,0,0));
charIconButton3.addMouseListener(new MouseAdapter() {

	@Override
public void mousePressed(MouseEvent e) {
		buttonClick2();
}
	@Override
public void mouseReleased(MouseEvent e) {
	charIconButton3.setIcon(charImageIcon3);
}
});


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
MonsterButton1.addMouseListener(new MouseAdapter() {

	@Override
public void mousePressed(MouseEvent e) {
		
			msi = new MonsterSkillInfo(ms.monsterList.get(0).getSkill1(), ms.monsterList.get(0).getDmg());
			if(msi.minHpIndex()== 0){
				if(SkillInfo.isShieldOn== true) {
					si.shieldHp-=10;
				System.out.println("Shield Attacked");
				}else
				charHp1 -=10;
				System.out.println("CharAttacked");
			
			}
			
			if(msi.minHpIndex()== 1){
				if(SkillInfo.isShieldOn== true) {
					si.shieldHp-=10;
					System.out.println("Shield Attacked");
				}else
				charHp2 -=10;
				System.out.println("CharAttacked");
			
			}
				
			if(msi.minHpIndex()== 2){
				if(SkillInfo.isShieldOn== true) {
					si.shieldHp-=10;
					System.out.println("Shield Attacked");
				}else
				charHp3 -=10;
				System.out.println("CharAttacked");
			
			}
				
			if(msi.minHpIndex()== 3){
				if(SkillInfo.isShieldOn== true) {
					si.shieldHp-=10;
					System.out.println("Shield Attacked");
				}else
				charHp4 -=10;
				System.out.println("CharAttacked");
			
			}
				
			if(msi.minHpIndex()== 4){
				if(SkillInfo.isShieldOn== true) {
					System.out.println("Shield Attacked");
					si.shieldHp-=10;
				}else
				charHp5 -=10;
				System.out.println("CharAttacked");
			
			}
				
		System.out.println("MonsterAttack");
		System.out.println(msi.minHpIndex());
		

}
	@Override
public void mouseReleased(MouseEvent e) {
		
	charIconButton3.setIcon(charImageIcon3);
}
});
	
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
	
//(int)(1.5*si.mobHp)
	//Mob hpBar
	g.fillRect(900, 250, mobHp1, 50);
	g.setColor(Color.GREEN);
	g.fillRect(900, 450,mobHp2, 50);
	g.setColor(Color.GREEN);
	g.fillRect(1100, 250,mobHp3, 50);
	g.setColor(Color.GREEN);
	g.fillRect(1100, 450,mobHp4, 50);
	g.setColor(Color.GREEN);
	g.fillRect(1300, 350, mobHp5, 50);
	g.setColor(Color.GREEN);
	
	//char hpBar
	g.fillRect(100, 50, charHp1, 50);
	g.setColor(Color.GREEN);
	g.fillRect(100, 300,charHp2, 50);
	g.setColor(Color.GREEN);
	g.fillRect(100, 550,charHp3, 50);
	g.setColor(Color.GREEN);
	g.fillRect(400, 250,charHp4, 50);
	g.setColor(Color.GREEN);
	g.fillRect(400, 450, charHp5, 50);
	g.setColor(Color.GREEN);
	
	
	if(isSkillProceed)
	si.screenDraw(g);
	if(isStaticSkill)
	si.StaticScreenDraw(g);
	
	//Monster Hp Icons


}
public void buttonClick0() {
	
	charIndex =0;
	String skillName =ms.cookieList.get(charIndex).getSkill2();
	charIconButton1.setIcon(charImage1);
	System.out.println("pressed");
	isSkillProceed= true;
	si= new SkillInfo(skillName,ms.cookieList.get(charIndex).getDmg());
	
	si.start();
	
	System.out.println(skillName);
	
	mobHp1-=si.Dmg;
	mobHp2-=si.Dmg;
	mobHp3-=si.Dmg;
	mobHp4-=si.Dmg;
	mobHp5-=si.Dmg;
	
}

public void buttonClick1() {
	
	charIndex =1;
	String skillName =ms.cookieList.get(charIndex).getSkill2();
	charIconButton2.setIcon(charImage2);
	System.out.println("pressed");
	isSkillProceed= true;
	isStaticSkill =true;
	si= new SkillInfo(skillName, ms.cookieList.get(charIndex).getDmg());
	
	
	System.out.println(skillName);
}

public void buttonClick2() {
	
	charIndex =2;
	String skillName =ms.cookieList.get(charIndex).getSkill2();
	charIconButton3.setIcon(charImage3);
	System.out.println("pressed");
	isSkillProceed= true;
	
	si= new SkillInfo(skillName, ms.cookieList.get(charIndex).getDmg());
	si.start();
	
	if(charHp1<=250)
		charHp1+=30;
		if(charHp2<=250)
			charHp2+=30;
		if(charHp3<=250)
			charHp3+=30;
		if(charHp4<=250)
			charHp4+=30;
		if(charHp5<=250)
			charHp5+=30;
	
	System.out.println(skillName);
}

public ArrayList<Cookie> returnCookieList() {
	
	return ms.cookieList ;
} 
}