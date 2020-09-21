package brush;

import util.Util;

public class CrossBrush extends Brush {
	public CrossBrush(){
		this(4);
	}
	public CrossBrush(int height, int width,int thickness) {
		this.HEIGHT = Util.moreThan2(height);
		this.WIDTH = Util.moreThan2(width);
		this.BRUSH_NAME = "CROSS_BRUSH";
		this.pattern = new int[this.HEIGHT][this.WIDTH];
		for(int i = 0; i<height ;i++) {
			for(int j = 0; j < width;j++) {
				if(j == (width-1)/2)
					this.pattern[i][j] = 1;
				else if(i == (height-1)/2 )
					this.pattern[i][j] = 1;
				else
					this.pattern[i][j]=0;
			
			}
		}
	}
	public CrossBrush(int side) {
		this.HEIGHT = Util.moreThan2(side);
		this.WIDTH = Util.moreThan2(side);
		this.BRUSH_NAME = "CROSS_BRUSH";
		this.pattern = new int[this.HEIGHT][this.WIDTH];
		for(int i = 0; i<side ;i++) {
			for(int j = 0; j < side;j++) {
				if(j == (side-1)/2)
					this.pattern[i][j] = 1;
				else if(i == (side-1)/2 )
					this.pattern[i][j] = 1;
				else
					this.pattern[i][j]=0;
			
			}
		}
	}
	
	public CrossBrush(int side, int thickness) {
		this.HEIGHT = Util.moreThan2(side);
		this.WIDTH = Util.moreThan2(side);
		this.BRUSH_NAME = "CROSS_BRUSH";
		this.pattern = new int[this.HEIGHT][this.WIDTH];
		int mid = (side-1)/2;
		for(int i = 0; i<side ;i++) {
			for(int j = 0; j < side;j++) {
				if(Util.inBetween(j, mid - thickness/2, mid + thickness/2))
					this.pattern[i][j] = 1;
				else if(Util.inBetween(i, mid - thickness/2, mid + thickness/2))
					this.pattern[i][j] = 1;
				else
					this.pattern[i][j]=0;
			
			}
		}
	}
	

}
