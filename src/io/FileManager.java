package io;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class FileManager {
	
	// new file
	public File newFile(String fileName) {
		return FileFactory.getOneFile();
	}
	
	// saveFile
	public void saveFile(File file, BufferedImage bufferedImage) {
		try {
			ImageIO.write(bufferedImage,"png",file);
			System.out.println("save sucessfull at "+ file.getAbsolutePath());
		}catch(Exception e) {
			System.out.println("save Failed");
		}
	}
//	
//	loadFile
//	
//	mergeFiles

}
