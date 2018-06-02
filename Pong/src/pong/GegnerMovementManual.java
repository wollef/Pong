package pong;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovementManual {

	Timer move;

	public GegnerMovementManual() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				if (Var.gegnerModeAuto == false) {
					if (Var.gegnermoveup == true) {
						if (Var.gegnery >= 20) {
							Var.gegnery -= 2;
				
						}
					} else if(Var.gegnermovedown) {
						if(Var.gegnery <= Var.screenheight - 200) {
							Var.gegnery +=2 ;
						}
					}
				}
			}
		}, 0, 4);

	}

}
