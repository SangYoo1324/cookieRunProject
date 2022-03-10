package Cookies6;
import java.awt.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MapScreen extends JFrame {
	int select1;
	int select2;
	int select3;
	int select4;
	int select5;
	int charSelect1;
	int charSelect2;
	int charSelect3;
	int charSelect4;
	int charSelect5;
	
	
	
	
	JPanel mapSelectionPanel;
	ArrayList<Cookie> cookieList = new ArrayList<Cookie>();
	ArrayList<Monster> monsterList = new ArrayList<Monster>();
	private Image fieldImage = new ImageIcon(Main.class.getResource("/Images/fieldImage.png")).getImage();
	public MapScreen( int charSelect1, int charSelect2,int charSelect3,int charSelect4,int charSelect5,
			int select1, int select2, int select3, int select4, int select5){
		this. select1 = select1;
		this. select2 = select2;
		this. select3 = select3;
		this. select4 = select4;
		this. select5 = select5;
		this. charSelect1 = charSelect1;
		this. charSelect2 = charSelect2;
		this. charSelect3 = charSelect3;
		this. charSelect4 = charSelect4; 
		this. charSelect5 = charSelect5; 
		
		
		
		mapSelectionPanel = new JPanel();
		mapSelectionPanel.setLayout(new GridLayout(3,3,1,1));
		mapSelectionPanel.setBounds(300,300, 500,500);
		mapSelectionPanel.setBackground(new Color(0,0,0,0));
	
		
		cookieList.add(new Cookie("frostQueen","frostQueen.png","frostQueenIcon.png","Freeze","Zero", 10, 100,"back") );
		cookieList.add(new Cookie("eclair","elcair.png","eclairIcon.png","Amplify","Shield", 10, 90,"front") );
		cookieList.add(new Cookie("pureVanilla","pureVanilla.png","pureVanillaIcon.png","heal","defBuff", 10, 80, "back") );
		cookieList.add(new Cookie("mokka","mokka.png","mokkaIcon.png","dotHeal","dmgReduction", 10, 100,"back") );
		cookieList.add(new Cookie("holyBerry","holyBerry.png","holyBerryIcon.png","selfHeal","dmgReduction", 10, 100,"front") );
	
		
		monsterList.add(new Monster("blueMonster.png","defaultAttack",10,100,"back"));
		monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
		monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
		monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
		monsterList.add(new Monster("doggieMonster.png","defaultAttack",10,100,"back"));
		
		
		String[] mapName = {"Chapter1","Chapter2","Chapter3","Chapter4","Chapter5","Chapter6","Chapter7","Chapter8","Chapter9"};
		JButton mapbuttons[] = new JButton[mapName.length];
		for(int i=0; i<mapName.length; i++) {
			mapbuttons [i] = new JButton(mapName[i]);
			mapbuttons[i].setFont(new Font("Arial", Font.BOLD,20));
			mapbuttons[i].setBackground(Color.GRAY);
			mapbuttons[i].setBorderPainted(false);
			mapbuttons[i].setForeground(Color.WHITE);
			mapbuttons[i].setVisible(true);
			if(i==0) {//start button
				mapbuttons[i].addMouseListener(new MouseAdapter() {
					@Override 
					public void mousePressed(MouseEvent e) {
						CookieRun.isStageSelect = false;
						CookieRun.isGameScreen = true;
						
				
				
						
					}
				});
				mapSelectionPanel.add(mapbuttons[i]);
			}
			else mapSelectionPanel.add(mapbuttons[i]);
				
			
	}
		
	}
	
	
		

	public void screenDraw(Graphics g) {
		g.drawImage(fieldImage,0,0,null);
		/*
		 * 
		 * why we don't put components on screendraw method
		 * panel wil be generated again and again when screenDraw() method excecutes
		 * with repaint() method. we should fix it generated and make it not generate again 
		 * 
		mapSelectionPanel = new JPanel();
		mapSelectionPanel.setLayout(new GridLayout(3,3,1,1));
		mapSelectionPanel.setBounds(300,300, 500,500);
		mapSelectionPanel.setBackground(new Color(0,0,0,0));
		//mapSelectionPanel.setVisible(true);
		
		String[] mapName = {"Chapter1","Chapter2","Chapter3","Chapter4","Chapter5","Chapter6","Chapter7","Chapter8","Chapter9"};
		JButton mapbuttons[] = new JButton[mapName.length];
		for(int i=0; i<mapName.length; i++) {
			mapbuttons [i] = new JButton(mapName[i]);
			mapbuttons[i].setFont(new Font("Arial", Font.BOLD,20));
			mapbuttons[i].setBackground(Color.GRAY);
			mapbuttons[i].setBorderPainted(false);
			mapbuttons[i].setForeground(Color.WHITE);
			mapbuttons[i].setVisible(true);
			if(i==0) {//start button
				mapbuttons[i].addMouseListener(new MouseAdapter() {
					@Override 
					public void mousePressed(MouseEvent e) {
						cookieRun.isStageSelect = false;
						cookieRun.isGameScreen = true;
						
				
				
						
					}
				});
				mapSelectionPanel.add(mapbuttons[i]);
			}
			else mapSelectionPanel.add(mapbuttons[i]);
				
			
	}*/
		}
	
	public void fade() {
		mapSelectionPanel.setVisible(false);
	}
}