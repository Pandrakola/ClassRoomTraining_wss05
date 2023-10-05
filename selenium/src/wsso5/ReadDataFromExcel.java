package wsso5;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws RuntimeException, IOException {
		//step: create Fis
				FileInputStream fis = new FileInputStream("C:\\Users\\mtech\\eclipse-workspace\\selenium\\resource\\Microsoft Excel Worksheet.test.xlsx");
				//step2:create workbook object
				Workbook workbook=WorkbookFactory.create(fis);
				
				//step3: read method
				String s1data = workbook.getSheet("Sheet1").getRow(5).getCell(3).toString();
				System.out.println(s1data);
			}

		

	

	
	}

	


