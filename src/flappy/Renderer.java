package flappy;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Renderer extends JPanel{

	private static final long serialVersionUID = 1L;//to satisfy a warning
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g); //paints/renders things onto game window
		
		FlappyBird.flappyBird.repaint(g); //to allow things to be rendered in the FlappyBird class
	}

}
