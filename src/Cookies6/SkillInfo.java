package Cookies6;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
 class HealBubble {
	  Image heal;
		 int x,y;
		HealBubble(int x, int y, Image heal){
			this.x = x;
			this.y = y;
			this.heal = heal;
			
		}
}

public class SkillInfo extends Thread{
	public int x, y;
	public int y2,y3,y4,y5;
	public String skillName ;
	public int Dmg;
	GameScreen gs = new GameScreen();
	//mapScreen ms= new mapScreen(0,1,2,3,4,0,1,2,3,4);
	public int shieldHp= gs.returnCookieList().get(2).getDmg()*10;;
	public int char1ShieldHp= shieldHp;
	public int char2ShieldHp= shieldHp;
	public int char3ShieldHp= shieldHp;
	public int char4ShieldHp= shieldHp;
	public int char5ShieldHp= shieldHp;
	
	HealBubble healBubble;
	
	
	private Image Freeze = new ImageIcon(Main.class.getResource("/Images/SkillEffect/freeze.png")).getImage();
	private Image Shield = new ImageIcon(Main.class.getResource("/Images/SkillEffect/shield.png")).getImage();
	private Image Heal = new ImageIcon(Main.class.getResource("/Images/SkillEffect/heal.png")).getImage();
	//private ImageIcon HealIcon = new ImageIcon(Main.class.getResource("/Images/SkillEffect/heal.png"));
	//private JLabel HealLabel = new JLabel(HealIcon);
	ArrayList<HealBubble> healArr = new ArrayList<HealBubble>();
	
	 
	 
	
	public static boolean isShieldOn =false;
	//private boolean isFixed = false;
	
	public SkillInfo(String skillName, int Dmg) {
		this.skillName = skillName;
		this.Dmg = Dmg;
		
	if(skillName == "heal") {
		healArr.add(new HealBubble(100,0, Heal));
		healArr.add(new HealBubble(100,0,Heal));
		healArr.add(new HealBubble(100,0,Heal));
		healArr.add(new HealBubble(400,0,Heal));
		healArr.add(new HealBubble(400,0,Heal));
	}
	
		//if(this.isStatic == true) {
	//	isFixed = true;//remains true unless if nobody touches this var
		//}

		
	}

	
	public void screenDraw( Graphics g) {// runs continuously, so , don't change var
		// like isFixed = true; because it won't be fixed
	
	
		if(this.skillName.equals("Freeze")) {
			g.drawImage(Freeze,850,100+y,null );
			System.out.println("freeze draw");
		}
		if(this.skillName.equals("heal")){{
			g.drawImage(Heal,  healArr.get(0).x,100, null);
			g.drawImage(Heal,  healArr.get(1).x,350, null);
			g.drawImage(Heal,  healArr.get(2).x,600, null);
			g.drawImage(Heal,  healArr.get(3).x,300, null);
			g.drawImage(Heal,  healArr.get(4).x,500, null);
			System.out.println("heal draw");
		}
		
		
		}
		
		/*
	
		*/
		
	/*	if(this.skillName.equals("Amplify"))
		{
			isStatic= true;
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
		if(isStatic == true) {
			g.drawImage(Shield, 100,100, null);
			g.drawImage(Shield, 100,350, null);
			g.drawImage(Shield, 100,600, null);
			g.drawImage(Shield, 400,300, null);
			g.drawImage(Shield, 400,500, null);
		}
	*/	
		
		
	}
	
	public void StaticScreenDraw(Graphics g) {

		
		getShield(g);
	}
	
	public void descend() {
		if(skillName.equals("Freeze")) {
			y+=10;
			System.out.println("Skillproceed");
			getHit();
		}
		if(skillName.equals("heal")) {
			y+=10;
			y2+=10;
			y3+=10;
			y4+=10;
			y5+=10;
			System.out.println("HealProceed");
			//getHealed();
		}
	
	
			
	}
	
	
	/*
	 * public void start1() {
		
			try {
				while(true) {
					y+=10;
					System.out.println("Heal1proceed");
					if(y== gs.charLabel1.getY()) {
						System.out.println("char1Healed");
						y= 0;
					}
					if(GameScreen.isSkillProceed) {
						Thread.sleep(10);
						
					
					}else {
						interrupt();
						y=0;
						break;
					}
				}
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		
	}
	 * */
	@Override 
	public void run() {
		
		if(skillName.equals("Freeze")) {
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
		if(skillName.equals("heal")) {
			try {
				while(true) {
					
					if(GameScreen.isSkillProceed) {
						Thread.sleep(1000);
						getHealed();
					}else {
						interrupt();
						//y=0;
						break;
					}
				}
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	
	}
public void getHit() {
	//gs = new GameScreen();
	if(y==gs.MonsterButton1.getY()) {
		
		System.out.println("hit!");
		y=0;
		GameScreen.isSkillProceed= false;
		
		
	
		//hp decrease
	//	mapScreen ms = new mapScreen();
		//for (int i = 0; i<ms.monsterList.size(); i++) {
			
	//		mobHp-= 50;
	//	}
		//	ms.monsterList.get(i).setHp(ms.monsterList.get(i).getHp()-50);
		//	System.out.println(ms.monsterList.get(i).getHp());}
		
	}
}
public void getHealed(){
GameScreen.isSkillProceed= false;
healArr.clear();
		
	
}

public void getShield(Graphics g) {

	
if(shieldHp!=0) {
	isShieldOn = true;
	g.drawImage(Shield, 100,100, null);
	g.drawImage(Shield, 100,350, null);
	g.drawImage(Shield, 100,600, null);
	g.drawImage(Shield, 400,300, null);
	g.drawImage(Shield, 400,500, null);
	
	}
else {
	isShieldOn =false;
	GameScreen.isStaticSkill = false;
}


	g.setColor(Color.WHITE);
	g.fillRect(100, 50, (int) (shieldHp*2.5), 50);
	g.setColor(Color.WHITE);
	g.fillRect(100, 300,(int) (shieldHp*2.5), 50);
	g.setColor(Color.WHITE);
	g.fillRect(100, 550 ,(int) (shieldHp*2.5), 50);
	g.setColor(Color.WHITE);
	g.fillRect(400, 250, (int) (shieldHp*2.5), 50);
	g.setColor(Color.WHITE);
	g.fillRect(400, 450, (int) (shieldHp*2.5), 50);
	System.out.println("ShieldHp draw");
	

	
	
}
}
