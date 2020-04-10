package brush;

public class BrushFactory {
	
	public static Brush getSquareBrush() {
		return new SquareBrush();
	}
	
	public static Brush getSquareBrush(int width, int height) {
		return new SquareBrush(width, height);
	}

}
