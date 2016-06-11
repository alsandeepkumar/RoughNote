package it.tech.skal.rough.file;

import java.io.File;

public class ListAllFileNames {
	
	public static void main(String ap[]){
		File photoFolder = new File("C:\\Users\\alsan\\Documents\\Sandeep Wedding Photo\\");
		int counter=0;
		for(File photoFile : photoFolder.listFiles()){
			counter++;
			//System.out.println(counter);
			System.out.println(photoFile.getName());
		}
	}

}
