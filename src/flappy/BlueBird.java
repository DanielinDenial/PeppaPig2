package flappy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * BlueBird avatar with blue color
 * @author Team 5: Peppa Pig
 *
 */
public class BlueBird extends Avatar {
	
	public BlueBird(int x, int y, int width, int height) {
		super.x = x;
		super.y = y;
		super.width = width;
		super.height = height;
		super.pixel = height/6;
	}
	
	public void repaint(Graphics g) {
		// origin y
		g.setColor(Color.black);
		g.fillRect(x - pixel*8, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*7, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*6, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*5, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*4, y, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*3, y, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x + pixel, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*3, y, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*4, y, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*5, y, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*6, y, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y, pixel, pixel);
		
		// origin y - pixel
		g.setColor(Color.black);
		g.fillRect(x - pixel*8, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*7, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*6, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*5, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*4, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*3, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y - pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y - pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y - pixel, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*2, y - pixel, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*3, y - pixel, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*4, y - pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y - pixel, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*6, y - pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y - pixel, pixel, pixel);
		
		// origin y - pixel*2
		g.setColor(Color.black);
		g.fillRect(x - pixel*7, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*6, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*5, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*4, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*3, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y - pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y - pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y - pixel*2, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*2, y - pixel*2, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*3, y - pixel*2, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*4, y - pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y - pixel*2, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*6, y - pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y - pixel*2, pixel, pixel);
		
		// origin y - pixel*3
		g.setColor(Color.black);
		g.fillRect(x - pixel*6, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*5, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*4, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*3, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y - pixel*3, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y - pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y - pixel*3, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*2, y - pixel*3, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*3, y - pixel*3, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*4, y - pixel*3, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*5, y - pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*6, y - pixel*3, pixel, pixel);
		
		// origin y - pixel*4
		g.setColor(Color.black);
		g.fillRect(x - pixel*5, y - pixel*4, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*4, y - pixel*4, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*3, y - pixel*4, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y - pixel*4, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y - pixel*4, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y - pixel*4, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x + pixel, y - pixel*4, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y - pixel*4, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*3, y - pixel*4, pixel, pixel);
		g.setColor(Color.white);
		g.fillRect(x + pixel*4, y - pixel*4, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y - pixel*4, pixel, pixel);
		
		// origin y - pixel*5
		g.setColor(Color.black);
		g.fillRect(x - pixel*3, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*2, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*3, y - pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*4, y - pixel*5, pixel, pixel);
		
		// origin y + pixel
		g.setColor(Color.black);
		g.fillRect(x - pixel*9, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*8, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*7, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*6, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*5, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*4, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*3, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x + pixel, y + pixel, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x + pixel*2, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*3, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*4, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*6, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y + pixel, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*8, y + pixel, pixel, pixel);
		
		// origin y + pixel*2
		g.setColor(Color.black);
		g.fillRect(x - pixel*9, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*8, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*7, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*6, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*5, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*4, y + pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*3, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel*2, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x - pixel, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x, y + pixel*2, pixel, pixel);
		g.setColor(Color.blue);
		g.fillRect(x + pixel, y + pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*3, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*4, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*5, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*6, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*7, y + pixel*2, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*8, y + pixel*2, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*9, y + pixel*2, pixel, pixel);
		
		// origin y + pixel*3
		g.setColor(Color.black);
		g.fillRect(x - pixel*8, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*7, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*6, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*5, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*4, y + pixel*3, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*3, y + pixel*3, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*2, y + pixel*3, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel, y + pixel*3, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y + pixel*3, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*2, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*3, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*4, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*6, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y + pixel*3, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*8, y + pixel*3, pixel, pixel);
		
		// origin y + pixel*4
		g.setColor(Color.black);
		g.fillRect(x - pixel*7, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*6, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*5, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*4, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*3, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*2, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x, y + pixel*4, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x + pixel, y + pixel*4, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y + pixel*4, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*3, y + pixel*4, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*4, y + pixel*4, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*5, y + pixel*4, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*6, y + pixel*4, pixel, pixel);
		g.setColor(Color.pink);
		g.fillRect(x + pixel*7, y + pixel*4, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*8, y + pixel*4, pixel, pixel);
		
		// origin y + pixel*5
		g.setColor(Color.black);
		g.fillRect(x - pixel*6, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*5, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*4, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*3, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel*2, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x - pixel, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x + pixel, y + pixel*5, pixel, pixel);
		g.setColor(Color.lightGray);
		g.fillRect(x + pixel*2, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*3, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*4, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*5, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*6, y + pixel*5, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*7, y + pixel*5, pixel, pixel);
		
		// origin y + pixel*6
		g.setColor(Color.black);
		g.fillRect(x - pixel*4, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*3, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel*2, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x - pixel, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel, y + pixel*6, pixel, pixel);
		g.setColor(Color.black);
		g.fillRect(x + pixel*2, y + pixel*6, pixel, pixel);
	}
	
	public boolean intersects(Rectangle r) {
		return r.width > 0 && r.height > 0 && width > 0 && height > 0 && r.x < x + width && r.x + r.width > x && r.y < y + height && r.y + r.height > y;
	}
}
