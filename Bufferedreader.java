package java_Project2;
import java.io.*;
public class Bufferedreader {
	   public static void main(String[] args){
	        
	        try{
	            BufferedReader reader = new BufferedReader
	            		(
	                new FileReader("sample.txt"));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	            reader.close();
	        }
	        catch (IOException e) {
	            System.out.println(
	                "An error occurred while reading the file: "
	                + e.getMessage());
	        }
	    }
	}