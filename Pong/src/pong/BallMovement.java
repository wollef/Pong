package pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
	Timer move;

	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				long maintenant = System.currentTimeMillis();
				double duree = maintenant - Var.debutJeu;
				Var.vitesse = 1.0 + duree / 10000.0;

				Var.ballx += Var.balldirx * Var.vitesse;
				Var.bally += Var.balldiry * Var.vitesse;
				
			}
		}, 0, 4);
	}

}
