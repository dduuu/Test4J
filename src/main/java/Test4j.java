

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class Test4j {
	public static void main(String[] args) {
		 
		
	    File imageFile = new File("E:/Scan_pdf/dishani-im.pdf");
	    Tesseract instance = Tesseract.getInstance(); 
	    //Tesseract instance =  Tesseract.getInstance(); // JNA Interface Mapping
	    instance.setDatapath("C:/Users/WIN8.1PRO/Downloads/Tess4J-3.4.0-src/Tess4J/tessdata");
	    instance.setLanguage("eng");


	    try {
	        String result = instance.doOCR(imageFile);
	        System.out.println(result);
	    } catch (TesseractException e) {
	        System.err.println(e.getMessage());
	    }
	}

}
