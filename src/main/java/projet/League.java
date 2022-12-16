package projet;

import java.util.HashMap;
import java.util.Map;

public class League {
	Club club;
	int ranking;
	String season;
	int match_played;
	int win;
	int lose;
	int draw;
	int points;

	public static Map < Integer, Integer > map_league = new HashMap <> ();
   
	
	League(String season){
		this.season = season;
	}
	
	League(Club club){
		this.club = club;
	}
	
	League(String season, Club club){
		this.season = season;
		this.club = club;
	}
	
	League(String season, int ranking){
		this.season = season;
		this.ranking = ranking;
	}
}
