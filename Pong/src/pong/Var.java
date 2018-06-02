package pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Var {
	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int x = 20, y = 185;
	static int gegnerx = 755, gegnery = 185 ;
	
	static double ballx = 200, bally = 500;
	static double vitesse=1;
	static boolean modeCouleurs = true;

	static long debutJeu = 0;
	
	static boolean moveup = false, movedown = false;
	static int balldirx = 1, balldiry = -1;
    static int playerPoints = 0, gegnerPoints = 0;
    static Font pixelfont;
    
	protected static boolean gegnermoveup= false;
	protected static boolean gegnermovedown= false;
	static boolean gegnerModeAuto = true;
	
	
	public Var() {
try {
	pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File ("coders_crux.ttf")).deriveFont (125f);
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File ("coders_crux.ttf")));
} catch (FontFormatException | IOException e) {
	
	e.printStackTrace();
}
	}

}
