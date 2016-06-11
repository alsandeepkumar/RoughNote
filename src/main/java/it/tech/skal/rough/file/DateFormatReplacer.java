package it.tech.skal.rough.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatReplacer {
	
	public static void main(String ap[]){/*
		String fileName = "C:/Users/alsan/Downloads/NCS/mysql_import/SCRIPTS/SCRIPTS/USER/IBG_UAT_USER_DATA_IMPORT.sql";
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = "", oldtext = "";
		while ((line = reader.readLine()) != null) {
			oldtext += line + "\r\n";
		
		Pattern pattern = Pattern.compile("date_format(str_to_date(@v[A-Z],'%d-%M-%y %h.%i.%s.%f000 %p'),'%Y-%m-%d %H.%i.%s')");
        Matcher matcher = pattern.matcher(line);
        String replaceAll = matcher.replaceAll("Joe Blocks ");
        System.out.println("replaceAll   = " + replaceAll);

        
		String newtext = oldtext.replace("ES_TB_AIM_EST_CFG", name);
		}
		reader.close();
		
		FileWriter writer = new FileWriter(new File(
				"C:/Users/alsan/Downloads/NCS/mysql_import/SCRIPTS/SCRIPTS2/IBG_UAT_USER_DATA_IMPORT.sql"));
		writer.write(newtext);
		writer.close();
	*/}

}
