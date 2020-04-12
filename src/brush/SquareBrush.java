package brush;

public class SquareBrush extends Brush{
	
	private static final int[][] squarePattern = {{1,1},{1,1}};

	public SquareBrush() {
		this.HEIGHT = 1;
		this.WIDTH = 1;
		this.BRUSH_NAME = "SQUARE_BRUSH";
		this.pattern = new int[this.HEIGHT][this.WIDTH];
	}
	
	public SquareBrush(int height,int width) {
		this.HEIGHT = height;
		this.WIDTH = width;
		this.BRUSH_NAME = "SQUARE_BRUSH";
		this.pattern = new int[height][width];
		for(int i = 0; i<height ;i++) {
			for(int j = 0; j < width;j++) {
				this.pattern[i][j] = 1;
			}
		}
	}

}
