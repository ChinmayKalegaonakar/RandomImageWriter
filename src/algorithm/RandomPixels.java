package algorithm;

import java.awt.image.BufferedImage;

import brush.Brush;
import color.ColorManager;

public class RandomPixels implements Algorithm {
	public ColorManager colorManager;
	public Brush brush;
	public RandomPixels(ColorManager colm, Brush brush){
		this.colorManager = colm;
		this.brush = brush;
	}
	
	public BufferedImage randomRandom(BufferedImage image) {
		int height = image.getHeight();
		int width = image.getWidth();
		int pixel = 0;
		for(int y = 0; y < height;){
	       for(int x = 0; x < width;){
	    	   pixel = colorManager.getRandomColorFromPalette();
	    	   for(int u = 0; u < brush.getHEIGHT();u++ ) {
	    		   for(int v = 0;v < brush.getWIDTH();v++) {
	    			   if(brush.isBrushMasked(u,v)) {
	    				   
	    				   image.setRGB(
	    						   ensureRange(x+v,0,width-1),
	    						   ensureRange(y+u,0,height-1),
	    						   pixel
	    						   );
	    			   }
	    		   }
	    	   }
	        
	        x += brush.getWIDTH();
	       }
	       y += brush.getHEIGHT();
	    }
		return image;
	}
	
	int ensureRange(int value, int min, int max) {
		   return Math.min(Math.max(value, min), max);
		}
}
