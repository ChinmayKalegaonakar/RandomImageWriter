package brush;

public abstract class Brush {
	protected int HEIGHT;
	protected int WIDTH;
	protected int[][] pattern;
	protected String BRUSH_NAME;
	
	public int getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}
	public String getBRUSH_NAME() {
		return BRUSH_NAME;
	}
	public void setBRUSH_NAME(String bRUSH_NAME) {
		BRUSH_NAME = bRUSH_NAME;
	}
	
	public boolean isBrushMasked(int u, int v) {
		return pattern[u][v]>0?true:false;
	}
	

}
