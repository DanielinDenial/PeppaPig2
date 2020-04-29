package flappy;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Used to display the game
 * @author Team 5: Peppa Pig
 *
 */
public class Renderer extends JPanel {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		FlappyBird.flappyBird.repaint(g);
	}
}
