package algorithm;

import java.awt.image.BufferedImage;

import color.ColorManager;

public abstract class Algorithm {
	ColorManager colorManager;
	public abstract BufferedImage paint(BufferedImage image);
}