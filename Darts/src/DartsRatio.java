import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.*;

public class DartsRatio extends GraphicsProgram {
	/* x i y nisu definirani kao iVar jer onda graficki program ne zeli prikazati ispravno centriranu sliku. Nabijem ga!!
	 * */
	public void run(){
		createBoard();
		for (int i = 0; i < 1000; i++){
		throwDarts();
		}
		String s = Integer.toString(k);
		GLabel label = new GLabel(s);
		label.setFont("Helvetica-100");
		add(label, 600, 300);
	}
	public void createBoard(){
		double x = (double) (getWidth() - squareSize) / 2;
		double y = (double) ((getHeight() - squareSize) / 2);
		GRect rect = new GRect(x, y, squareSize, squareSize);
		GOval oval = new GOval(x, y, squareSize, squareSize);
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		add(rect);
		add(oval);
	}
	int k = 0;
	public void throwDarts(){
		double x = (double) (getWidth() - squareSize) / 2;
		double y = (double) ((getHeight() - squareSize) / 2);
		double b = rgen.nextDouble(x, x + squareSize);
		double c = rgen.nextDouble(y, y + squareSize);
		GOval dart = new GOval (b, c, dartSize, dartSize);
		dart.setFilled(true);
		dart.setFillColor(Color.YELLOW);
		add(dart);
		if (Math.sqrt(b*b + c*c) < (x + squareSize)) {
			k += 1;
		}
		
	}
	int squareSize = 400; 
	int dartSize = 5;
    
RandomGenerator rgen = RandomGenerator.getInstance();
}
