package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToHashMap {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Gt\\Trainer's_Report_Avadi.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		
		HashMap<String,String> data=new HashMap<String,String>();
		
		//Reading data from excel to HashMap
		for(int r=0;r<=rows;r++)
		{
			XSSFCell cell1=sheet.getRow(r).getCell(0);
			DataFormatter dataform = new DataFormatter();
			String key = dataform.formatCellValue(cell1);
			XSSFCell cell2=sheet.getRow(r).getCell(1);
			String value = dataform.formatCellValue(cell2);
			data.put(key, value);
		

			
		}
		
		//Read data from HashMap
		
		for(Map.Entry entry:data.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}








