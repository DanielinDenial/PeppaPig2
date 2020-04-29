package flappy;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * abstract class for the bird avatar in the game
 * @author Team 5: Peppa Pig
 *
 */
public abstract class Avatar {
	public int x, y;
	public int width, height;
	public int pixel;
	public final int WIDTH = 800, HEIGHT = 800;
	
	public abstract void repaint(Graphics g);
	public abstract boolean intersects(Rectangle column);
}
