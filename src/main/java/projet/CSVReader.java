package projet;

import java.io.*;
import java.util.ArrayList;

public class CSVReader{
	
	public static void main(String[] args)
	{
		String file = "src\\league_france.csv";
		BufferedReader reader = null;
		String line = "";
				
		try {
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null) {
				
				String[] row = line.split(",");
				
				for (String index :  row) {
						System.out.printf("%-20s", index);						
					
				}
				System.out.println();

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
