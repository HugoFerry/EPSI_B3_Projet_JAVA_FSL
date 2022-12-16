package projet;

import java.util.stream.Stream;

public enum Club {
	Lyon("Lyon"),
	Monaco("Monaco"),
	Marseille("Marseille"),
	Bordeaux("Bordeaux"),
	Sochaux("Sochaux"),
	Auxerre("Auxerre"),
	Guingamp("Guingamp"),
	Lens("Lens"),
	Nantes("Nantes"),
	Nice("Nice"),
	Paris_Saint_Germain("Paris_Saint_Germain"),
	Bastia("Bastia"),
	Strasbourg("Strasbourg"),
	Lille("Lille"),
	Rennes("Rennes"),
	Montpellier("Montpellier"),
	Ajaccio("Ajaccio"),
	Le_Havre("Le_Havre"),
	Sedan("Sedan"),
	Troyes("Troyes"),
	Metz("Metz"),
	Toulouse("Toulouse"),
	Le_Mans("Le_Mans"),
	Saint_Etienne("Saint_Etienne"),
	Caen("Caen"),
	Istres("Istres"),
	Nancy("Nancy"),
	Lorient("Lorient"),
	Valenciennes("Valenciennes"),
	Grenoble_Foot("Grenoble_Foot"),
	Boulogne("Boulogne"),
	Brest("Brest"),
	Arles_Avignon("Arles_Avignon"),
	Evian("Evian"),
	Dijon("Dijon"),
	Reims("Reims"),
	Angers("Angers"),
	Gazelec_Ajaccio("Gazelec_Ajaccio"),
	Amiens("Amiens"),
	Nimes("Nimes"),
	Clermont_Foot("Clermont_Foot");

	private String club;
	
    private Club(String s) {
    	club = s;
    }
    
    public String getValue() {
        return club;
    }
    
    @Override
    public String toString() {
        return this.getValue();
    }
    
    public static Stream<Club> allClubList() {
        return Stream.of(Club.values()); 
    }

    
}
