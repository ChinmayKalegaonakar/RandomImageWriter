package algorithm;

import java.awt.image.BufferedImage;

import color.ColorManager;

import java.awt.Color;
import java.awt.Graphics2D;

public class ConcentricSquares extends Algorithm {

    int distance;
    int sideLength;
    public ConcentricSquares(ColorManager colm, int _distance, int _sideLength){
        this.colorManager = colm;
        distance = _distance;
        sideLength = _sideLength;
    }

    @Override
    public BufferedImage paint(BufferedImage image) {
        int height = image.getHeight();
        int width = image.getWidth();
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        int xoff =0 ,yoff =0 , length =0;
        for( int i = 0;i<=10 ;i++){
            length = sideLength - i*10;
            xoff = (width/2) - (length/2);
            yoff = (height/2) - (length/2);
            Color color = colorManager.getColorFromRandomPalette();
            g2d.setColor(color);
            g2d.drawRect(xoff,yoff,length,length);
        }
       
        return image;
    }
    
}
