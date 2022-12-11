package projet;

public class League {
	Club club;
	int ranking;
	String season;
	int match_played;
	int win;
	int lose;
	int draw;
	int points;
	
	League(String season){
		this.season = season;
	}
	
	League(String season, Club club){
		this.season = season;
		this.club = club;
	}
}
