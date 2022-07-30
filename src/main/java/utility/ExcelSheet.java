package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static String getdata(String sheetName,int row,int cell) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\JavaPrograms\\ZerodhaProject\\src\\test\\resources\\ExcelData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	
	}


