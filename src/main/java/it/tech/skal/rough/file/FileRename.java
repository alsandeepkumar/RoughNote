package it.tech.skal.rough.file;

import java.io.File;

public class FileRename {
	
	public static void main(String a[]){
		File srcfolder = new File("C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/user");
		File descfolder = new File("C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/usertxt");
		for(File file : srcfolder.listFiles()) {
			System.out.println(file.getName().substring(0, file.getName().length()-4));
			file.renameTo(new File(descfolder+"/"+file.getName().substring(0, file.getName().length()-4)+".txt"));
		}
	}

}
