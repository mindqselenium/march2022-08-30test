package datadrivenscenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("F:\\830AM ONLINE\\SELENIUMSCENARIOS\\testdata\\ReadExcelData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis); //it will call fis location and open the workbook
		XSSFSheet sheet=workbook.getSheet("test"); // it will open worksheet
		
		//XSSFSheet sheet=workbook.getSheetAt(0);
		for (int i=0;i<=sheet.getLastRowNum();i++){
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
						
		}
		
		
		
	}

}

