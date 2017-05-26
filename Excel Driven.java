package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	public static FileInputStream files;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		String value = getcelldata(0,2);
		System.out.println(value);
		value = setcelldata(1,2,"yuva1");
		System.out.println(value);
	/*	for(int i=0;;i++){
			for(int j=0;;j++){
				try{
					value=getcelldata(j,i);
					System.out.println(value);
				}catch(Exception e){
					
				}
			}
		}*/
	}

	public static String getcelldata(int rownum,int cellnum) throws IOException{
		files = new FileInputStream("E:\\QA\\workspace\\git\\Seleniumintro\\data.xlsx");
		wb = new XSSFWorkbook(files);
		sheet= wb.getSheet("script");
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		wb.close();
		return cell.getStringCellValue();
	}
	
	public static String setcelldata(int rownum,int cellnum,String data) throws IOException{
		files = new FileInputStream("E:\\QA\\workspace\\git\\Seleniumintro\\data.xlsx");
		wb = new XSSFWorkbook(files);
		sheet= wb.getSheet("script");
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(data);
		 FileOutputStream os = new FileOutputStream("E:\\QA\\workspace\\git\\Seleniumintro\\data.xlsx");
         wb.write(os);
		return cell.getStringCellValue();
	}

}
