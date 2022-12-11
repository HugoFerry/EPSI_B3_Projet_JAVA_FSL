package projet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    		League league = new League("2002-2003",Club.Paris_Saint_Germain);
    		
    		
    		try {
    			reader = new BufferedReader(new FileReader(file));
    			while((line = reader.readLine()) != null) {
    				
    				String[] row = line.split(",");
    				
    				if(row[0].contains(league.season) && row[2].contains(league.club.getValue())) {
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
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    	}
    }

    
}