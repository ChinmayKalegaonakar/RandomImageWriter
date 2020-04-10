package io;

import java.io.File;

public class FileFactory {
	static final String ROOT_FOLDER = "/home/chinmay/eclipse-workspace/RandomImageWriter/resources/";
	static final String FILE_FORMAT = ".png";
	static final String[] FILENAMES = {
			"output1",
			"output2",
			"output3"
	};
	public static File getOneFile() {
		return new File(ROOT_FOLDER + FILENAMES[2] + FILE_FORMAT);
	}
	

}
