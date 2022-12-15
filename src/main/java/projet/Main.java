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
        				TimeUnit.SECONDS.sleep(5);
        				main(args);
        				
        			case 2:
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
        				try {
        	        		System.out.println("Type the Club name that you want (Lyon, Monaco, Bordeaux, Paris_Saint_Germain...)");
        	        		System.out.println("-> ");

        	        		Scanner chooseClub = new Scanner(System.in);
        	        		String chosenClub = chooseClub.next();
        	  
        	        		
        	        		League specific_club = new League(Club.valueOf(chosenClub));
            	        			
        	        		
        	        		System.out.println(specific_club);
        	        	        	        		
        	    			reader = new BufferedReader(new FileReader(file));
    	    				
        	    			float sum_rank =0;
        	    			float total_appearance=0;
        	    			float sum_win =0;
        	    			float sum_draw =0;
        	    			float sum_lose =0;
        	    			
        	    			System.out.println("STATS---------------------------------------------------------");
        	    			while((line = reader.readLine()) != null) {
        	    				
        	    				String[] row = line.split(",");
        	    				
        	    				if(row[2].contains(specific_club.club.getValue())) {
        	    					season_result = row[0];
        	    					rk_result = row[1];
        	    					club_result = row[2];
        	    					mp_result = row[3];
        	    					w_result = row[4];
        	    					d_result = row[5];
        	    					l_result = row[6];
        	    					pts_result = row[7];
        	    					
        	    					total_appearance+=1;
        	    					sum_rank+=Float.parseFloat(rk_result);
        	    					sum_win+=Float.parseFloat(w_result);
        	    					sum_draw+=Float.parseFloat(d_result);
        	    					sum_lose+=Float.parseFloat(l_result);
        	    					
        	    					System.out.println("In " + season_result + " season, " +specific_club.club.getValue() + " was ranked in " + rk_result +". During " + mp_result + " games, " + specific_club.club.getValue() + " won " + w_result + " games," + d_result + " games in draw, and " + l_result +" games lost");
        	    				}
        	    			}
        	    			float rank_average =sum_rank/total_appearance;
        	    			float win_average = sum_win/total_appearance;
        	    			float draw_average = sum_draw/total_appearance;
        	    			float lose_average = sum_lose/total_appearance;
        	    			System.out.println("--------------------------------------------------------------");
        	    			
        	        		System.out.println("-------------------");
        	        		System.out.println("|     Summary     |");        	        		
        	        		System.out.println("-------------------");
        	        		System.out.println("For 20 seasons, " + specific_club.club.getValue() + " had appeared " + (int)(total_appearance) + " times in Ligue 1");
        	        		System.out.println("The average rank is " + rank_average + " th");
        	        		System.out.println("The average won games are " + win_average + " games");
        	        		System.out.println("The average drawn games are " + draw_average + " games");
        	        		System.out.println("The average lost games are " + lose_average + " games");
        	        		
            				TimeUnit.SECONDS.sleep(5);
            				main(args);

        	    		}
        	    		catch(Exception e) {
        	    			System.out.println("<"+e.toString()+">" + " error occured. Please write the correct club name. Put '1' if you want to show all the clubs");
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
        		
  			
  			catch(Exception e) {
  			  System.out.println("ERROR >>> Please insert only number, not string");
  			  System.out.println("Program Restarted ...");
  			  main(args);
  			}
    	}
    	
    }


    
}