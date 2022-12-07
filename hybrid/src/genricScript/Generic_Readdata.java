package genricScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Readdata {
	public static String getData (String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./exel/selenium.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
		String value = cel.toString();
		
		return value;
			
		
	}

}
