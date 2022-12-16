package projet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Record {
	public static void Stats(String[] args)
	{
	String file = "src\\league_france.csv";
	String line = "";
	BufferedReader reader = null;
	
	try {
		reader = new BufferedReader(new FileReader(file));
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			for (String index :  row) {
				System.out.printf("%-23s", index);						
				}
				System.out.println();
				}
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			TimeUnit.SECONDS.sleep(5);
			Main.main(args);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
