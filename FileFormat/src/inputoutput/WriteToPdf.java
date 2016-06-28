package inputoutput;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.util.Iterator;
import java.util.List;

public class WriteToPdf {

	public void writeToPdf(List<String> data) {
		//Manipulate man= new Manipulate();
		try {
			List<String> list= data;
			FileInputStream ipdoc = new FileInputStream(new File("./resource/Output.xls"));
			HSSFWorkbook wb = new HSSFWorkbook(ipdoc);
			HSSFSheet sheet = wb.getSheetAt(0);

			

			Iterator<Row> rowIt = sheet.iterator();
			HSSFFont font1 = wb.createFont();
	        HSSFFont font2 = wb.createFont();
	        HSSFCellStyle style1= wb.createCellStyle();
	   
	        style1.setFillBackgroundColor(HSSFColor.GREY_40_PERCENT.index);
	        //style1.setFillPattern(style1.ALIGN_FILL);
	        font1.setColor(HSSFColor.GREY_50_PERCENT.index);
        
	        font2.setColor(HSSFColor.RED.index);
	        style1.setFont(font1);
	        

			
	        CellStyle style2= wb.createCellStyle();
	        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
	        style2.setFillPattern(CellStyle.SOLID_FOREGROUND);
	        

			Document pdf = new Document();
			PdfWriter.getInstance(pdf, new FileOutputStream("./resource/Output.pdf"));
			pdf.open();
			PdfPTable tb = new PdfPTable(6);
			PdfPCell pcell;
			
			int i=0;
			int r=0;
			while (rowIt.hasNext()) {
				Row row = rowIt.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					int cellCounter=0;
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						pcell = new PdfPCell(new Phrase(cell.getStringCellValue()));
						if(i==0)
					   pcell.setBackgroundColor(new BaseColor(0,200,0));
						
					
						else if(i!=0 && cellCounter==3 && Double.parseDouble(list.get(r).valueOf(r))>3000.0)
						{
							//System.out.println(Double.parseDouble(list.get(i)));
							//if(Double.parseDouble(list.get(i))>3000.0)
							//{	
							//pcell.setBackgroundColor(new BaseColor(200,0,0));
							((Cell) pcell).setCellStyle(style2);
							tb.addCell(pcell);
							//}
						}
						else
						pcell.setBackgroundColor(new BaseColor(128,128,128));
						tb.addCell(pcell);
						break;
					
					
					}
					cellCounter++;
				}
				i++;
				r++;
			}
			
	       Paragraph summaryParagraph=new Paragraph(" Summary   "+ " Recon Diff:: "+list.get(42)+ " Total Recon Diff::   " + list.get(43));
	       //tb.add(Double.parseDouble(list.get(42)));
	       pdf.add(tb);
	       
	       
	       pdf.add(summaryParagraph);
			

			pdf.close();
			ipdoc.close();

			System.out.println("Output.pdf written successfully on disk.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
