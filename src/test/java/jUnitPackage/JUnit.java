package jUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import projet.Club;
import projet.League;

class JUnit {

	@Test
    public void test_All_Club_Numbers() {
		int club_numbers = 41;
        assertEquals(club_numbers, Club.allClubList().count());
    }

	@Test
    public void test_First_Club() {
		String first_club = "Lyon";
        assertEquals(first_club, Club.allClubList().findFirst().get().toString());
    }
	
}
