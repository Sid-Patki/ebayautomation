package automation.ebay.utilities;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {
	
	XSSFWorkbook  exeldata;
	
	public Readexcelfile() {
		
		try {
			FileInputStream excelfile = new FileInputStream ("./Excelfile/Exceldata.xlsx");
			exeldata= new XSSFWorkbook(excelfile);
		} catch (Exception e) {
			System.out.println("unable to find the data from excel"+e.getMessage());
			
		}
	}
	
	public String getstringdata(int SheetIndex,int row, int col) {
		
		return exeldata.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
	}

	public String getstringdata(String Sheetname, int row, int col) {
		
	return exeldata.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		
	}
	
}
