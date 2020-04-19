package flappy;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener{ //implements the ActionListener interface
	
	public static FlappyBird flappyBird;
	
	public final int WIDTH = 800, HEIGHT = 800; //sets the variables for size of the game window
	
	public Renderer renderer; //allows renderer to be used by FlappyBird
	
	public FlappyBird() { //to initialize the bird
		
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer); //renders the game contents
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates instance when window is closed
		jframe.setSize(WIDTH, HEIGHT); //sets size of window
		jframe.setResizable(false); //user cannot resize the window themselves
		jframe.setVisible(true); //game window becomes visible
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) { //method to perform/process actions on back-end
		renderer.repaint();
	}
	
	public void repaint(Graphics g) {
		
	}

	public static void main(String[] args) {
		flappyBird = new FlappyBird();

	}


}
