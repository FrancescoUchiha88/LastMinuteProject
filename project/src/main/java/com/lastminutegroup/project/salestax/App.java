package com.lastminutegroup.project.salestax;

import java.util.ArrayList;

//import com.lastminutegroup.project.salestax.engine.Engine;
import com.lastminutegroup.project.salestax.entity.EvaluateProduct;
import com.lastminutegroup.project.salestax.entity.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static javafx.scene.input.KeyCode.J;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class App {
	
	
    public static void main(String[] args) throws FileNotFoundException, IOException {
 /*      
        ArrayList<Product> order =new ArrayList<Product>();

        order.add(EvaluateProduct.evaluateProduct(1,"Book", 57.99, "The Castle",2, "book", false));
        order.add(EvaluateProduct.evaluateProduct(2,"CD Music", 18.99, "Nirvana",2, "other", false));
        order.add(EvaluateProduct.evaluateProduct(3,"Wine", 57.99, "The Castle",2, "medical", true));
        order.add(EvaluateProduct.evaluateProduct(4,"Imported Rum", 18.99, "Nirvana",2, "other", true));
        
    
        for (int i =0 ; i<order.size();i++)
        	System.out.println("Prodotto :"+ (i+1) +"\n -Nome: " + order.get(i).getName() + " \n -Quantità: "+ order.get(i).getQuantity() +"\n -Prezzo: " + order.get(i).getTotalPrice() + 
        			"\n -Tasse: "+ order.get(i).calculateTax() +"\n -Totale: " + (float)(order.get(i).getTotalPrice() + order.get(i).calculateTax()));
    
    
    FileInputStream in = new FileInputStream("/Users/Lucci/Documents/Project/project/src/DB/Database.xls");
    POIFSFileSystem fs = new POIFSFileSystem(in);
    HSSFWorkbook wb = new HSSFWorkbook(fs);
    HSSFSheet sheet = wb.getSheetAt(0);
    HSSFRow row;
    HSSFCell cell;
    
    int rows; 
    rows = sheet.getPhysicalNumberOfRows();
    
    for (int i=1 ; i< rows; i++){
        System.out.println("Product :" + i);
        for (int j=0; j<6; j++)
            System.out.println("  " + sheet.getRow(0).getCell(j) + ": " + sheet.getRow(i).getCell(j));
        }
    
    
    //add record
    cell =sheet.createRow(rows+1).createCell(0);
    cell.setCellValue("Hello, World");
    
     
    HSSFSheet sheet = wb.createSheet("Database");
    HSSFPatriarch patr = sheet.createDrawingPatriarch();
    HSSFCell cell1 = sheet.createRow(3).createCell(1);
    cell1.setCellValue(new HSSFRichTextString("Hello, World"));
    
   
    FileOutputStream out = new FileOutputStream("/Users/Lucci/Documents/Project/project/src/DB/Database.xls");
    wb.write(out);
    out.close();
        
    wb.close();
*/
    }
}