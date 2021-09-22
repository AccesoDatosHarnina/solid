package liskovreal00;

import java.awt.Point;

public class Cuadrado extends Shape {

	public Cuadrado(Point point) {
		super(point);
	}

	public void mover(Movement movement) {
		System.out.println("Yo no me muevo");
	}

	@Override
	public int getAmountOFVertix() {
		return 4;
	}
}
