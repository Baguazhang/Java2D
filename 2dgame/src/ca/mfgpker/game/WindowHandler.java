package ca.mfgpker.game;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import ca.mfgpker.game.net.packets.Packet01Disconnect;

public class WindowHandler implements WindowListener{

	private final Game game;
	
	public WindowHandler(Game game){
		this.game = game;
		this.game.frame.addWindowListener(this);
	}
	
	

	public void windowClosed(WindowEvent event) {
		
	}

	public void windowClosing(WindowEvent event) {
		Packet01Disconnect packet = new Packet01Disconnect(this.game.player.getUsername());
		packet.writeData(this.game.socketClient);
	}

	public void windowActivated(WindowEvent event) {
		//add player can't move if the window isn't on focus
	}
	
	public void windowDeactivated(WindowEvent event) {
		
	}

	public void windowDeiconified(WindowEvent event) {
		//remove afk status
	}

	public void windowIconified(WindowEvent event) {
		//add afk status
	}

	public void windowOpened(WindowEvent event) {
		
	}

}
