package ca.mfgpker.game.entities;

import java.net.InetAddress;

import ca.mfgpker.game.InputHandler;
import ca.mfgpker.game.level.Level;

public class PlayerMP extends Player{

	public InetAddress ipAddress;
	public int port;
	
	public PlayerMP(Level level, int x, int y, InputHandler input, String username, InetAddress ipAddresss, int port) {
		super(level, x, y, input, username);
		this.ipAddress = ipAddresss;
		this.port = port;
	}
	
	public PlayerMP(Level level, int x, int y, String username, InetAddress ipAddresss, int port) {
		super(level, x, y, null, username);
		this.ipAddress = ipAddresss;
		this.port = port;
	}
	
	@Override
	public void tick(){
		super.tick();
	}
}
