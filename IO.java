import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IO {

	public static void main(String[] args) throws FileNotFoundException {
		
		InputStream input =  null;
		OutputStream output = null;
		byte[] array = new byte[100];
		
		try {
			
			// InputStream
			input = new FileInputStream("Sample.txt");
			System.out.println("Available bytes in the file: " + input.available());
			// Read byte from the input stream
			input.read(array);
			System.out.println("Data read from the file: ");
			// Convert byte array into string
			String data = new String(array);
			System.out.println(data);
			// Close the input stream
			input.close();
			
			// OutputStream
			output = new FileOutputStream("Sample.txt");
			data = "Happy learning, JAVA ";
			array = data.getBytes();
			//write into file 
			output.write(array);
			//close the output stream
			output.close();
			
			//Buffered Input Stream 
			input = new FileInputStream("Sample.txt");
			BufferedInputStream bis = new BufferedInputStream(input);
			// read the first char
			int x = bis.read();
			//use while loop to print all characters
			System.out.println("Output using BufferedInputStream");
			while(x!=-1) {
				System.out.print((char)x);
				x = bis.read();
			}
			bis.close();
			
			//BufferedOutputStream 
			output = new FileOutputStream("Sample.txt");
			data = "Happy learning, Welcome to JAVA Programming";
			BufferedOutputStream bos = new BufferedOutputStream(output);
			array = data.getBytes();
			//write into file 
			output.write(array);
			//close the output stream
			output.close();
			
			System.out.println();
			//FileReader 
			char[] arr = new char[100];
			FileReader fr = new FileReader("Sample.txt");
			fr.read(arr);
			System.out.println((arr));
			fr.close();
			
			//FileWriter
			FileWriter fw = new FileWriter("Sample.txt");
			data = "Nice to see you back";
			fw.write(data);;
			fw.close();
			
			//Read data from Properties file 
			FileReader reader = new FileReader("db.properties");
			Properties p = new Properties();
			p.load(reader);
			System.out.println("Admin password from properties file: "+p.getProperty("password"));
			
			//Read data from excel file
			FileInputStream file = new FileInputStream(new File("C:\\Users\\HP\\Desktop\\JALA INTERNSHIP\\student.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while(itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellitr = row.cellIterator();
				while(cellitr.hasNext()) {
					Cell cell = cellitr.next();
					switch(cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue()+" ");
						break;
						
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+" ");
						break;
					}
				}
				System.out.println();
			}
			

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
