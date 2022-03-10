package Cookies2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class cookieRun extends JFrame {

private Image screenImage;
private Graphics screenGraphic;

//backGround Image
private Image background = new ImageIcon(Main.class.getResource("/Images/MainPAge.jpg")).getImage();

//startButton
private ImageIcon startButtonBasicImage= new ImageIcon(Main.class.getResource("/Images/startButtonBasic.png"));
private JButton startButton = new JButton(startButtonBasicImage);

//menu Bar
private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("/Images/menuBar1920.png")));

//exit Button
private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("/Images/ExitButtonEntered.png"));//draw withpaintComponents
private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("/Images/ExitButtonBasic.png"));
private JButton exitButton = new JButton(exitButtonBasicImage);
mapScreen ms = new mapScreen();
GameScreen gs = new GameScreen();




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
		
			
			
			exitButton.setVisible(true);
			exitButton.setBounds(1750,0,50,50);
			exitButton.setBorderPainted(false);
			exitButton.setContentAreaFilled(false);
			exitButton.setFocusPainted(false);
			exitButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					exitButton.setIcon(exitButtonEnteredImage);
					exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					//Music
				}
				@Override
				public void mouseExited(MouseEvent e) {
					exitButton.setIcon(exitButtonBasicImage);
				}
				@Override 
				public void mousePressed(MouseEvent e) {
					try {
						Thread.sleep(100);
					}catch(InterruptedException ex) {
						ex.printStackTrace();
					}
					System.exit(0);//JFrame 
				}
				
			});
			add(exitButton);
			
			menuBar.setBounds(0,0,1920,50);
			menuBar.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
				
			});
			menuBar.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					
				}
				
			});
			add(menuBar);

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
	
	add(gs.charIconButton1);
	add(gs.charIconButton2);
	add(gs.charIconButton3);
	add(gs.charIconButton4);
	add(gs.charIconButton5);

	add(gs.MonsterButton1);
	add(gs.MonsterButton2);
	add(gs.MonsterButton3);
	add(gs.MonsterButton4);
	add(gs.MonsterButton5);
	
	add(gs.charLabel1);
	add(gs.charLabel2);
	add(gs.charLabel3);
	add(gs.charLabel4);
	add(gs.charLabel5);
	
		
}
}
