package projet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
    	{
    		String file = "src\\league_france.csv";
    		BufferedReader reader = null;
    		String line = "";
    		
    		String season_result ="";
    		String club_result="";
    		String rk_result="";
    		String mp_result="";
    		String w_result="";
    		String d_result="";
    		String l_result="";
    		String pts_result="";
    		Scanner chooseMenu = new Scanner(System.in);
       		
    
    		// Program Part
    		League league_season_club = new League("2002-2003",Club.Paris_Saint_Germain);
    		
    		System.out.println("-------------------------------------------------------");
    		System.out.println("-        Welcome to Ligue1 Stats (2002 - 2022)        -");
    		System.out.println("-------------------------------------------------------");
    		System.out.println();
    		System.out.println("Choose a number that you want to know about");
    		System.out.println();

    		System.out.println("<MENU>-----------------------------------------");
    		System.out.println("| 1. All Clubs List in Ligue1 for 2002 - 2022 |");
    		System.out.println("| 2. All Stats                                |");
    		System.out.println("| 3. Specific Club Stat                       |");
    		System.out.println("| 4. Specific Club Stat in Specific Season    |");
    		System.out.println("| 5. The Highest Points                       |");
    		System.out.println("| 6. The Least Lost Club                      |");
    		System.out.println("| 7. The Most Won Club                        |");
    		System.out.println("-----------------------------------------------");

    		System.out.printf("-> ");
    		try {
        		int chosenNum = chooseMenu.nextInt();
        		

        		
        		switch (chosenNum) {
        			case 1:
        				System.out.println("///////////////////////");
        				Club.allClubList().forEach(System.out::println);
        				System.out.println("///////////////////////");
        				TimeUnit.SECONDS.sleep(20);
        				main(args);
        				
        			case 2:
        				try {
        	    			reader = new BufferedReader(new FileReader(file));
        	    			while((line = reader.readLine()) != null) {
        	    				String[] row = line.split(",");
        	    				for (String index :  row) {
        							System.out.printf("%-25s", index);						
        	    					}
        	    					System.out.println();
        	    					}
        						System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

                				TimeUnit.SECONDS.sleep(600);
                				main(args);
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
        				
        				
        			case 3:
        				
	
        			}
        		
        		}
        		
  			
  			catch(Exception e) {
  			  System.out.println("ERROR >>> Please insert only number, not string");
  			  System.out.println("Program Restarted ...");
  			  main(args);
  			}
    		

 
    		
    		
    		try {
    			reader = new BufferedReader(new FileReader(file));
    			while((line = reader.readLine()) != null) {
    				
    				String[] row = line.split(",");
    				
    				if(row[0].contains(league_season_club.season) && row[2].contains(league_season_club.club.getValue())) {
    					season_result = row[0];
    					rk_result = row[1];
    					club_result = row[2];
    					mp_result = row[3];
    					w_result = row[4];
    					d_result = row[5];
    					l_result = row[6];
    					pts_result = row[7];
    				}
    			}
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

    		// Program Part
    		System.out.println("In " + league_season_club.season + " season, " + league_season_club.club.getValue() + " was ranked in " + rk_result);

    	}
    	
    }

    
}