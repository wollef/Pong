package pong;

import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);
	
		Graphics2D g2d = (Graphics2D) g ;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
	//	boolean modeColors = true;
		
		if (Var.modeCouleurs) 
			g.setColor(Color.DARK_GRAY);
		else
			g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
	
		g.setColor(Color.WHITE);	
		for(int i = 0; i<= 30; i++) {
			g.fillRect(Var.screenwidth/2 -5, i * 20, 10, 10);
		}
		
		if (Var.modeCouleurs) 
			g.setColor(Color.BLUE);		

		if (Var.modeCouleurs) 
			g.fillRoundRect(Var.x, Var.y, 25, 150,15,15);
		else
			g.fillRect(Var.x, Var.y, 25, 150);
		
		if (Var.modeCouleurs) 
			g.setColor(Color.GREEN);
	
		if (Var.modeCouleurs) 
			g.fillRoundRect(Var.gegnerx, Var.gegnery, 25, 150,15,15); 
		else
			g.fillRect(Var.gegnerx, Var.gegnery, 25, 150); 
			
		if (Var.modeCouleurs) 
			g.setColor(Color.RED);
		
		g.setFont(Var.pixelfont);
		g.drawString("" + Var.playerPoints, Var.screenwidth/2 - 95, 75);
		g.drawString("" + Var.gegnerPoints+(Var.gegnerModeAuto ? " *" : ""), Var.screenwidth/2 + 50, 75);

		if (Var.modeCouleurs) 
			g.setColor(Color.ORANGE);		

		if (Var.modeCouleurs) 
			g.fillOval((int)Var.ballx, (int) Var.bally, 20, 20);
		else
			g.fillRect((int)Var.ballx, (int) Var.bally, 20, 20);
		
		repaint();
	}

}
