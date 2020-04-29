package flappy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Peppa Pig's Flappy Bird game
 * @author Team 5: Peppa Pig
 *
 */
public class FlappyBird implements ActionListener, MouseListener, KeyListener {
	public static FlappyBird flappyBird;
	
	// size of game display
	public final int WIDTH = 800, HEIGHT = 800;
	
	// used to display the game
	public Renderer renderer;
	
	// the bird that the player controls
	public Avatar bird;
	
	// array of rectanges which will form the obstacles
	public ArrayList<Rectangle> columns;
	
	public ArrayList<Double> scores;
	// ticks manages time in the game
	// yMotion is the motion of the bird
	// score records number of successful jumps
	public int ticks, yMotion, score;
	
	// boolean variables for when game is over and for when the game has started
	public boolean gameOver, started = true;
	
	// used to randomly place obstacles in game
	public Random rand;
	
	// FlappyBird game object
	public FlappyBird() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		rand = new Random();
		
		jframe.add(renderer);
		jframe.setTitle("Flappy Bird");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.addMouseListener(this);
		jframe.addKeyListener(this);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		// randomizes bird avatar
		int randomAvatar = rand.nextInt(5);
		if (randomAvatar == 0) {
			bird = new ClassicBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		} else if (randomAvatar == 1) {
			bird = new BlueBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		} else if (randomAvatar == 2) {
			bird = new OrangeBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		} else if (randomAvatar == 3) {
			bird = new BlackBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		} else if (randomAvatar == 4) {
			bird = new WhiteBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		}
		
		columns = new ArrayList<Rectangle>();
		scores = new ArrayList<Double>();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
		
		timer.start();
	}
	
	// main method that starts Flappy Bird game
	public static void main(String [] args) {
		System.out.println("Press \"A\" to get your average score!");
		flappyBird = new FlappyBird();
	}
	
	// adds obstacles (in the form of columns) in the game
	public void addColumn(boolean start) {
		int space = 300;
		int width = 100;
		int height = 50 + rand.nextInt(300);
		
		if (start) {
			columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
			columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
		} 
		else {
			columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));
			columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
		}
	}
	
	// displays the obstacles in the game display
	public void paintColumn(Graphics g, Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}
	
	// causes the bird object to jump: main player movement
	public void jump() {
		if (gameOver) {
			int randomAvatar = rand.nextInt(5);
			if (randomAvatar == 0) {
				bird = new ClassicBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			} else if (randomAvatar == 1) {
				bird = new BlueBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			} else if (randomAvatar == 2) {
				bird = new OrangeBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			} else if (randomAvatar == 3) {
				bird = new BlackBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			} else if (randomAvatar == 4) {
				bird = new WhiteBird(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			}
			
			columns.clear();
			yMotion = 0;
			addScore(score);
			score = 0;
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);	
			
			gameOver = false;
		}
		if(!started) {			
			started = true;
		}
		else if(!gameOver) {			
			if (yMotion > 0) {				
				yMotion = 0;
			}		
			yMotion -= 10;
		}
	}
	
	// invokes playing of game
	@Override
	public void actionPerformed(ActionEvent e) {
		int speed = 10;		
		ticks++;		
		
		if (started) {			
			for(int i = 0; i < columns.size(); i++) {
				Rectangle column = columns.get(i);
				column.x -= speed;
			}		
			if(ticks % 2 == 0 && yMotion < 15) {		
				yMotion += 2;
			}
		
			for(int i = 0; i < columns.size(); i++) {			
				Rectangle column = columns.get(i);			
				if (column.x + column.width < 0) {				
					columns.remove(column);				
					if (column.y == 0) {					
					addColumn(false);
				
					}
				}				
			}
		
			bird.y += yMotion; //bird movement
			for (Rectangle column : columns) { //check for collision			
				if ((column.y == 0) && (bird.x + bird.width / 2 > column.x + column.width / 2 - 10) &&  (bird.x + bird.width / 2 < column.x + column.width / 2 + 10)) {					
					score++;
				}				
				if(bird.intersects(column)) {					
					gameOver = true;
					if (bird.x <= column.x) {					
						bird.x = column.x - bird.width;						
					}	
					else {						
						if(column.y != 0) {							
							bird.y = column.y - bird.height;
						}					
						else if (bird.y < column.height) {							
							bird.y = column.height;
						}
					}				
				}			
			}
		
			if (bird.y > HEIGHT - 120 || bird.y < 0) {			
				gameOver = true;
			}		
			if (bird.y + yMotion >= HEIGHT - 120) {	
				
				bird.y = HEIGHT - 120 - bird.height;
				
			}
			
			renderer.repaint();
		}
	}
	
	// manages the graphics for the display
	public void repaint(Graphics g) {
		// color of background
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// color of ground
		g.setColor(Color.orange);
		g.fillRect(0, HEIGHT-120, WIDTH, 120);
		
		// color of grass
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT-120, WIDTH, 20);
		
		// color of bird avatars
		bird.repaint(g);
		
		// color of obstacles
		for (Rectangle column : columns) {
			paintColumn(g, column);
		}
		
		// color of words
		g.setColor(Color.white);
		g.setFont(new Font("Arial", 1, 100));
		
		if(!started) {
			g.drawString("Click to start!", 75, HEIGHT / 2 - 50);
		}
		
		if(gameOver) {
			g.drawString("Game Over!", 100, HEIGHT / 2 - 50);
		}
		
		if(!gameOver && started) {
			g.drawString(String.valueOf(score), WIDTH / 2 - 25, 100);
		}

	}
	
	public int getScore() {
		return score;
	}
	
	public void addScore(double x) {
		scores.add(x);
	}
	
	public void clearScores() {
		scores.clear();
	}
	
	// Calculates the average score of the players runs before exited manually
	public void calculateAverage() {
		int games = scores.size();
		double avg;
		double sum = 0;
		for(int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);
		}
		avg = sum / games;
		System.out.printf("Your average score is: %.2f\n",avg);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			jump();
		}
		if ((e.getKeyCode() == KeyEvent.VK_A) && scores.size() > 0) { //calculates the average score of the player 
				calculateAverage();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	

}
