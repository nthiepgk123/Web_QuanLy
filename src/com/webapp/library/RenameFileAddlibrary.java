package com.webapp.library;

import org.apache.commons.io.FilenameUtils;

public class RenameFileAddlibrary {
	public static String renameFile(String filename) {
		return FilenameUtils.getBaseName(filename) +"-" + System.nanoTime()+"."+FilenameUtils.getExtension(filename); 
	}
}
