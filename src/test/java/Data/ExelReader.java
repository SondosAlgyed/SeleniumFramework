package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExelReader {
	
	static FileInputStream fis =null;
	 
	//for read file
	public FileInputStream getfileinputStream()
	{
			String filePath=System.getProperty("user.dir")+"/src/test/java/Data/UserData.xlsx";
			File srcFile =new File(filePath);
			try {
				fis =new FileInputStream(srcFile);
			} catch (FileNotFoundException e) {
				System.out.print("Test Data file not found : ckeck path of file data");
				System.exit(0);
			}
			return 	fis;
	}
	
	//for read data in file
	public Object [ ][ ] getExcelData() throws IOException
	{
		 fis = getfileinputStream();
		 XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
	
		int totalNumberofRows=(sheet.getLastRowNum()+1);
		int totalNamberofColm =4;
		
		String ArrayExcelData[][] =new String[totalNumberofRows][totalNamberofColm];
		
		for(int i=0;i<totalNumberofRows;i++)
		{
			for(int j=0;j<totalNamberofColm;j++)
			{
				 XSSFRow row =sheet.getRow(i);
				 ArrayExcelData[i][j]=row.getCell(j).toString();
			}
		}
		
		wb.close();
		return ArrayExcelData;
	}

}
