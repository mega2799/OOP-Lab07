/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
    BASKET(Place.INDOOR,5,"basket"),
    TENNIS(Place.INDOOR,1,"tennis"),
    VOLLEY(Place.INDOOR,8,"volley"),
    BIKE(Place.OUTDOOR,1,"bike"),
    F1(Place.OUTDOOR,1,"f1"),
    MOTOGP(Place.INDOOR,1,"motogp"),
    SOCCER(Place.INDOOR,11,"soccer");

    private final Place place; 
	private int noTeamMembers;
	private String actualName; 
	/**
	 * @param place noTeamMembers actualName 
	 *
	 *
	 * */
	Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.place = place;
        this.noTeamMembers = noTeamMembers;
        this.actualName = actualName;
	}
	/**
	 * @return {@link Boolean} 
	 *			returns true if the sport is an individual sport
	 *
	 * */
	public boolean isIndividualSport(){
		return this.noTeamMembers == 1;	
	}
	
	
	public boolean isIndoorSport(){
		return this.place == Place.INDOOR;
	}

	
	public Place getPlace(){
		return this.place;
	}
	
	public String toString() {
		return "place:" + this.place + "team: " + this.noTeamMembers + 
				"actual name: " + this.actualName;
	}
    
}
