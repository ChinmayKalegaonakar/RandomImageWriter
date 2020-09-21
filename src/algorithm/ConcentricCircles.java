package algorithm;


import java.awt.image.BufferedImage;

import brush.Brush;
import color.ColorManager;
import util.Util;
import java.awt.Graphics2D;
import java.awt.Color;

//doesnt work
public class ConcentricCircles extends Algorithm {
    int x;
    int y;
    int radius;
    int spacing;
    
    public ConcentricCircles(ColorManager colm){
        this.colorManager = colm;
    };

    ConcentricCircles(int x, int y, int radius, int spacing) {

    }

    @Override
    public BufferedImage paint(BufferedImage image) {
        // TODO Auto-generated method stub
        
        Graphics2D g2d = (Graphics2D) image.getGraphics();
        
        for( int i = 0;i<=10 ;i++){
            Color color = colorManager.getColorFromRandomPalette();
            g2d.setColor(color);
            g2d.drawOval(50,50, 100-i*10, 100-i*10);
        }
       
        return image;

    }
}
