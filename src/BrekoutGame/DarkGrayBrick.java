/* Skapad av Jonas Schymberg
 * Kurs: DVGA02
 * VT - 24
 * Uppgift: Laboration2 - Breakoutspel */

package BrekoutGame;

import java.awt.Color;

public class DarkGrayBrick extends ColoredBrick {
	/* Anropar super med:
	 * x, y, width, height, color, hp, hitScore, killScore, powerUp */
	public DarkGrayBrick(int x, int y, int width, int height) {
		super(x, y, width, height, Color.DARK_GRAY, 4, 4, 10, "multiBall");

	}

}
