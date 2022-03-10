package Cookies6;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.*;
public class Music extends Thread{
private Player player;
private boolean isLoop;
private File file;
private FileInputStream fis;
private BufferedInputStream bis;

public Music(String name, boolean isLoop) {
	try {
		this.isLoop= isLoop;
		file = new File(Main.class.getResource(name).toURI());
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
}

public void close() {
	isLoop = false;
	player.close();
	this.interrupt();
	
}

@Override
public void run() {
	try {
		do {
			fis = new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			player = new Player(bis);
			player.play();
		
			
		}while(isLoop);
	}catch(Exception e) {
	System.out.println(e.getMessage());
}
}
}