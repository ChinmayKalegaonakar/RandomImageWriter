package brush;

public class SquareBrush extends Brush{
	
	public SquareBrush() {
		this.HEIGHT = 1;
		this.WIDTH = 1;
		this.BRUSH_NAME = "SQUARE_BRUSH";
	}
	
	public SquareBrush(int width, int height) {
		this.HEIGHT = height;
		this.WIDTH = width;
		this.BRUSH_NAME = "SQUARE_BRUSH";
	}

}
