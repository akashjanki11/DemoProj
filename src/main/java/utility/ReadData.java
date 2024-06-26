package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	public static String readFile(String value) throws IOException
	{	
	Properties proper=new Properties();
	FileInputStream file = new FileInputStream("F:\\Software sql\\Amazon\\src\\main\\java\\config\\config_properties");
	proper.load(file);
	return proper.getProperty(value);
}
	
	public static String readExcelFile(int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\Software sql\\Amazon\\ExcelFile01\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}
}