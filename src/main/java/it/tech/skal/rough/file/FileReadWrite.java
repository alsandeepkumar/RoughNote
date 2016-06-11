package it.tech.skal.rough.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String a[]) {
	/*
		try {
			File orignalFile = new File(
					"C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/config/ES_TB_AIM_EST_CFG.ksh");
			String fileNames = "ES_TB_BOX,ES_TB_COVER,ES_TB_SEPARATOR,ES_TB_FILE,ES_TB_LOGDELTA,ES_TB_CUST_OWNER,ES_TB_CUST_SEGMENT,ES_TB_REPO_GCIN,ES_TB_REPO_LCIN,ES_TB_REQUEST_USERADMIN,ES_TB_SEPARATOR_DATE,ES_TB_ACCESS_MATRIX_STAGING,ES_TB_OCR_JOB,ES_TB_SEPARATOR_CASE_MAP,ES_TB_REQUEST_COVER,ES_TB_REQUEST_DOCUMENT,ES_TB_REQUEST_COVER_ARCHIVE,ES_TB_REQUEST_COVER_AC,ES_TB_REQUEST_DOCUMENT_AC,ES_TB_REQUEST_IDENTIFIER,ES_TB_REQUEST_IDENTIFIER_AC,ES_TB_FILE_BLANKPAGE,ES_TB_FILE_BLANKPAGE_JOB,ES_TB_FILE_BLANKPAGE_PROC,ES_TB_SYS_CONF_AUDIT_TRAIL,ES_TB_AIM_EST_FILE,ES_TB_EXTRACT_TEMP,ES_TB_REQUEST_DOCUMENT_DATE,ES_TB_REQUEST_DOCUMENT_DATE_AC,ES_TB_REQ_DOC_DATE_ARCHIVE,ES_TB_REQUEST_DOCUMENT_ARCHIVE,ES_TB_INTERFACE_LOG";
			FileReader fileReader = new FileReader(orignalFile);
			FileWriter fileWriter = null;
			String[] fileName = fileNames.split(",");
			for (String name : fileName) {
				fileWriter = new FileWriter(new File(
						"C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/transaction/" + name + ".ksh"));
				int c;
				while ((c = fileReader.read()) != -1) {
					fileWriter.write(c);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 

	*/
		try {
			String fileNames = "ES_TB_ACCESS_MATRIX,ES_TB_AIM_EST_AUDIT,ES_TB_AUDIT_INFO,ES_TB_BULK_USR_CSV_REQ,ES_TB_BULK_USR_REQ,ES_TB_USER,ES_TB_USER_LOGIN_LOG,ES_TB_USER_RMO_REQUEST,ES_TB_USER_RMO_REQUEST_FUNROLE";
			String[] fileName = fileNames.split(",");
			for (String name : fileName) {
			File file = new File("C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/config/ES_TB_AIM_EST_CFG.ksh");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "", oldtext = "";
			while ((line = reader.readLine()) != null) {
				
				oldtext += line + "\r\n";
			}
			reader.close();
			// replace a word in a file
			// String newtext = oldtext.replaceAll("drink", "Love");

			// To replace a line in a file
			String newtext = oldtext.replace("ES_TB_AIM_EST_CFG", name);

			FileWriter writer = new FileWriter(new File(
					"C:/Users/alsan/Downloads/NCS/mysql_import/KSH shell scripts/user/" + name + ".ksh"));
			writer.write(newtext);
			writer.close();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	

}
