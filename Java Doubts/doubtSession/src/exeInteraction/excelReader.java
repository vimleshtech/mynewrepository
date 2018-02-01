package exeInteraction;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excelReader {
	
	public HashMap<Integer, testcase> readExcel()
	{	
		HashMap<Integer, testcase> data = new HashMap<Integer, testcase>();
				
		try
		{
			FileInputStream fs = new FileInputStream("C:\\Users\\vkumar15\\Desktop\\test_data.xls");
			HSSFWorkbook book = new HSSFWorkbook(fs);
			HSSFSheet sheet = book.getSheetAt(0);
			
			int rc = sheet.getPhysicalNumberOfRows();
			
			int id;
			String name,pwd,desc;
			
			for(int i=1; i<rc; i++)
			{
				HSSFRow row = sheet.getRow(i);
								
				id = (int) row.getCell(0).getNumericCellValue(); //id				
				name = row.getCell(1).getStringCellValue(); //name				
				pwd= row.getCell(2).getStringCellValue(); //pwd						
				desc = row.getCell(3).getStringCellValue(); //desc
				
				data.put(id, new testcase(name,pwd,desc));		
				
			}
			// 1 , object-testcase
			// 2, object-testcase 
			
		
		}
		catch (Exception e) {
			e.printStackTrace();			
		}
		
		return data;
	}
}
