package util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Util {
	
	public static int ensureRange(int value, int min, int max) {
		   return Math.min(Math.max(value, min), max);
		}
	public static int moreThan2(int i) {
		if(i<=2) return 3; else return i;
	}
	public static boolean inBetween(int number,int start,int end) {
		if(number>=start && number <= end) return true; else return false;
	}
	public static BufferedImage imageFromFile(File file) throws IOException {
		return ImageIO.read(file);
	}

}
