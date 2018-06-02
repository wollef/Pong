package pong;

public class Main {

	public static void main (String[] args) {
		
		Var.debutJeu = System.currentTimeMillis();
		
		new Gui () ;
		new Var () ;
		new Movement ();
		
		new GegnerMovement();
		new GegnerMovementManual();
		
		new BallMovement();
		new BallKollision();
	}
}
