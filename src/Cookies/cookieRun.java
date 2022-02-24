package Cookies;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cookieRun extends JFrame {

private Image screenImage;
private Graphics screenGraphic;
private Image background = new ImageIcon(Main.class.getResource("/Images/MainPAge.jpg")).getImage();
private ImageIcon startButtonBasicImage= new ImageIcon(Main.class.getResource("/Images/startButtonBasic.png"));
private JButton startButton = new JButton(startButtonBasicImage);
mapScreen ms = new mapScreen();
GameScreen gs = new GameScreen();
//public static GameScreen gs;
//public static mapScreen ms;

public static  boolean isStageSelect = false;
public static boolean isGameScreen = false;
public static boolean isMainScreen =true;
	public cookieRun(){
/*
	
		*/		
		
			setUndecorated(true);// important or no components will be shown
			setTitle("Calc");	
			setSize(1800,900);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setBackground(new Color(0,0,0,0));// important or background will not be transparent
			setLayout(null);//important
		
			

			startButton.setBounds(40 ,330,400, 100);
			startButton.setBorderPainted(false);
			startButton.setContentAreaFilled(false);
			add(startButton);
			JTextField inputSpace = new JTextField();
			inputSpace.setEditable(true);
			inputSpace.setBackground(Color.WHITE);
			inputSpace.setHorizontalAlignment(JTextField.RIGHT);
			inputSpace.setFont(new Font("Arial",Font.BOLD,50));
			inputSpace.setBounds(8,10,270,70);
			add(inputSpace);
			
		JPanel startExitPanel = new JPanel();
		startExitPanel.setLayout(new GridLayout(4,1, 1, 1));
		startExitPanel.setBounds(800,300, 150,304);
		startExitPanel.setBackground(new Color(0,0,0,0));
	
		
		String [] buttonNames = new String[4];
		buttonNames [0] = "Start";
		buttonNames [1] = "Exit";
		buttonNames [2] = "Set";
		buttonNames [3] = "Tips";
		JButton buttons[]= new JButton[buttonNames.length];
		for(int i=0; i<buttonNames.length; i++) {
			buttons [i] = new JButton(buttonNames[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD,20));
			buttons[i].setBackground(Color.GRAY);
			buttons[i].setBorderPainted(false);
			buttons[i].setForeground(Color.WHITE);
			buttons[i].setVisible(true);
			
		
			if(i==0) {//start button
				buttons[i].addMouseListener(new MouseAdapter() {
					@Override 
					public void mousePressed(MouseEvent e) {
						
						startExitPanel.setVisible(false);
						inputSpace.setVisible(false);
						startButton.setVisible(false);
						isMainScreen = false;
						isStageSelect= true;
						
						
				
						
					}
				});
				startExitPanel.add(buttons[i]);
			}
			if(i==1) {
				buttons[i].addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						try {
							Thread.sleep(100);
						}catch(InterruptedException ex){//thread sleeping cathc
							ex.printStackTrace();
						}
						exitProgram();
					}
					
				});
				startExitPanel.add(buttons[i]);
			}

			else startExitPanel.add(buttons[i]);
			
		}
		
	
		
		
	
		
		
		add(startExitPanel);
			
		
		
	
		
		

	}
public void paint(Graphics g) {
	screenImage = createImage(1800,900);
	screenGraphic = screenImage.getGraphics();
	screenDraw(screenGraphic);
	g.drawImage(screenImage, 0, 0, null );
	
}

public void screenDraw(Graphics g) {
	
	if(isMainScreen) {
		g.drawImage(background, 0,0,null);
	}

	
	 if(isStageSelect) {
		
		
		
		
		ms.screenDraw(g);
		stageSelectDraw();
		
	
		
	}
	if(isGameScreen) {
			gs.screenDraw(g);
			gameScreenDraw();
	
		}
	

	paintComponents(g);
	this.repaint();
}

public void exitProgram() {
	System.exit(0);
	
}
public void stageSelectDraw() {
	
	add(ms.mapSelectionPanel);
}
public void gameScreenDraw() {
	//remove(ms.mapSelectionPanel);
	ms.mapSelectionPanel.setVisible(false);
	
	add(gs.charIconSlot);
	add(gs.backLine);
	add(gs.frontLine);
	add(gs.monsterLine);
		
}
}
