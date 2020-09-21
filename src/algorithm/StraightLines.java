package algorithm;

import java.awt.image.BufferedImage;

import brush.Brush;
import color.ColorManager;
import util.Util;


/*
Straight lines with gaps
*/
public class StraightLines extends Algorithm {

    ColorManager colorManager;
    Brush brush;
	int slope;
	int vGap;
	int hGap;

    public StraightLines(ColorManager colm, Brush brush, int slope){
		this.colorManager = colm;
        this.brush = brush;
		this.vGap = slope;
		this.hGap = slope;
	}

	public StraightLines(ColorManager colm, Brush brush, int x, int y){
		this.colorManager = colm;
        this.brush = brush;
		this.vGap = y;
		this.hGap = x;
	}
    @Override
    public BufferedImage paint(BufferedImage image) {
        int height = image.getHeight();
		int width = image.getWidth();
		int pixel = 0;
		for(int y = 0; y < height;){
			pixel = colorManager.getRandomColorFromPalette();
	       for(int x = 0; x < width;){ 
	    	   for(int u = 0; u < brush.getHEIGHT(); u++) {
	    		   for(int v = 0;v < brush.getWIDTH(); v++) {
	    			   if(brush.isBrushMasked(u,v)) {
	    				   image.setRGB(
	    						   Util.ensureRange(x+v,0,width-1),
	    						   Util.ensureRange(y+u,0,height-1),
	    						   pixel
	    						   );
	    			   }
	    		   }
	    	   } 
	    	   x += brush.getWIDTH()*hGap;
	       }
	       y += brush.getHEIGHT()*vGap;
	    }
		return image;
    }


}