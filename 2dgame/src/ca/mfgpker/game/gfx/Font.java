package ca.mfgpker.game.gfx;

public class Font {

	private static String chars = "" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ      " + "0123456789.,:;'\"!?$%()-=+/      ";

	public static void render(String msq, Screen screen, int x, int y, int colour, int scale) {
		msq = msq.toUpperCase();

		for (int i = 0; i < msq.length(); i++) {
			int charIndex = chars.indexOf(msq.charAt(i));
			if (charIndex >= 0) screen.render(x + (i * 8), y, charIndex + 30 * 32, colour, 0x00 , scale);
		}
	}
}
