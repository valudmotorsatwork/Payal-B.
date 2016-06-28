package inputoutput;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import com.itextpdf.text.BaseColor;

import dao.GetSet;


public class WriteToXLS {

	public void writeToXls(List<String> data)
	{
		List<String> list= data;
		Manipulate man=new Manipulate(); 
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet= workbook.createSheet("Bank Data");
		HSSFFont font = workbook.createFont();
        font.setItalic(false);
        //font.setColor(HSSFColor.BRIGHT_GREEN.index); 
       
       
       CellStyle style2= workbook.createCellStyle();
       style2.setFillForegroundColor(IndexedColors.RED.getIndex());
       style2.setFillPattern(CellStyle.SOLID_FOREGROUND);
       
       CellStyle style1= workbook.createCellStyle();
       style1.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
       style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
       
       CellStyle style= workbook.createCellStyle();
       style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
       style.setFillPattern(CellStyle.SOLID_FOREGROUND);
       
       
        		 try
        		 {
		
		            
		        int r = 0;
                Cell cell = null ;
                
                int i=0;
                for ( i = 0; i < 7; i++) {
                      
                      HSSFRow row = sheet.createRow(i);
                    
                      for (int j = 0; j < 6; j++) {
                      cell = row.createCell(j);
                       // Create a cell with a value and set style to it.
                   
                      cell.setCellValue(list.get(r));
                      if(i==0)
                      {                             
                          cell.setCellStyle(style);
                      }
                      else if ( i!=0 && (cell.getColumnIndex()==4))
                    	  {
                    	  		if(j==4 & Double.parseDouble(list.get(r))>3000.0)
                    		  cell.setCellStyle(style2);
                    	  }
                    	 
                    	  else 
                    	  {                          
                    		  	cell.setCellStyle(style1);
                    	  }
                      r++;
                      }
          
                      
                }
                System.out.println(list.get(42));
                System.out.println(list.get(43));
                HSSFRow row = sheet.createRow(i);
                cell = row.createCell(3);
                
                cell.setCellValue(list.get(42));
                cell.setCellStyle(style1);
                cell = row.createCell(4);
               
                cell.setCellValue(list.get(43));
                cell.setCellStyle(style1);

	            FileOutputStream out = new FileOutputStream(new File("./resource/Output.xls"));
	            workbook.write(out);
	            out.close();
	            System.out.println("Output.xlsx written successfully on disk.");
	     
		 
	}catch(Exception e)
	        {
				e.printStackTrace();
	        }
}
	
}
