package javaTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import resources.R;

public class TestFile {

	public static void main(String[] args) {
		
		
		String file = R.LogConst.LOG_PROPERTIES_FILE;
		
		File f = new File(file);
		
		String readLine = "";
		try {
		      BufferedReader br = new BufferedReader(new FileReader( f ));
		      while ((readLine = br.readLine()) != null) { 
		        System.out.println(readLine);
		      } // end while 
		    } // end try
		    catch (IOException e) {
		      System.err.println("Error Happened: " + e);
		    }
		
		
	}

}
