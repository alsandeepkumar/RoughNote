package it.tech.skal.rough.file;

public class GenerateColumns {
	
	public static void main(String a[]){
		String colString = "ID,@vREQUEST_ID,@vAPP_CODE,@vTIME_TOKEN,@vREQ_DATA,REQUEST_TYPE,@vPROCESS_STATUS,@vERROR_CD,@vERROR_MSG,@vCREATED_ON,@vUSID,@vUSERNAME,@vUSER_COUNTRY,@vUSER_ACCOUNT_STATUS,@vUSER_DEPT,@vUSER_AMM_SYNC_FLAG";
		String[] col = colString.split(",");

		
		for(int i=0;i<col.length;i++ ){
			col[i] = checkForV(col[i]);
			col[i] = checkdate(col[i]);
			if(i==col.length-1){
				System.out.println("'\"'||"+col[i]+"|| '\"'");					
			} else {
				System.out.println("'\"'||"+col[i]+"|| '\",'||");
			}
			
		}
	}

	private static String checkForV(String string) {
		
		if(string.startsWith("@v")) {
			string =  string.substring(2, string.length());
		}
		
		return string;
	}

	private static String checkdate(String string) {
		String keyword = "CREATED_ON,UPLOADON,UPDATED_ON,ASOF_DT,AUDITDATE,VERIFIED_ON,JOB_STARTED_DT,JOB_FINISHED_DT,CREATED_DATE,JOB_CREATED_DTTM,FILE_INIT_DTTM,PROCESSING_START_DTTM,PROCESSING_END_DTTM,FILE_RECEIVED_DTTM,PROCESSED_DATE,REPORT_GENERATED_DATE,EXP_DATE,WFSUPLOADDATE,REQUEST_DT,APPREJ_DT,DOC_EXP_DT,ACTION_ON,LOGIN_ON,TIME_TOKEN,VERIFIEDON,STARTED_DT,FINISHED_DT";
		String[] col = keyword.split(",");
		
		for(int i=0;i<col.length;i++ ){
			if(string.equals(col[i])){
				string =  "TO_CHAR("+string+",'YYYY-MM-DD HH24:MI')";
			}
		}
		
		return string;
	}

}
