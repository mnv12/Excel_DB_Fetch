package com.example.spreadsheet.excel_dataDB.Entity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class Helper {

// check the file in excel format
	
	public static boolean checkFileExcel(MultipartFile file) {
		
		
		String loadFile=file.getContentType();
		
		if(loadFile.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	// convert excel into list
	
	public static List<EXcel_Entity> convert(InputStream stream){
		
		List<EXcel_Entity>  list=new ArrayList<EXcel_Entity>();
		
		
		try {
			
			XSSFWorkbook workbook=new XSSFWorkbook(stream);
			
			XSSFSheet sheet = workbook.getSheet("Loptop");
			int rowNum=0;
			Iterator<Row>  iterator=sheet.iterator();
			
			while(iterator.hasNext()) {
				
				Row next = iterator.next();
				
				if(rowNum==0) {
					
					rowNum++;
					continue;
				}
				
				
				Iterator<Cell>  iterator2=next.iterator();
				
				EXcel_Entity entity=new EXcel_Entity();
				int cID=0;
				while(iterator2.hasNext()) {
					
					Cell next2 = iterator2.next();
					
					switch(cID){
						
					case 0:
						entity.setHO_Sr_No((int)next2.getNumericCellValue());
						break;
						
					case 1:
						
						entity.setBranch_Sr_No((int)next2.getNumericCellValue());
						break;
					case 2:
						entity.setCOMPANY(next2.getStringCellValue());
					break;
					
					case 3:
						entity.setEmp_ID(next2.getNumericCellValue());
						break;
						
					case 4:
						entity.setEmployee_Name(next2.getStringCellValue());
						break;
					default:
						break;
					}
					cID++;
				}
				
				list.add(entity);
			}
			
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
		return list;
	}
	
	
	
	
}
