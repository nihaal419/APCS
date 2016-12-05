public class Ship {
	private int crew;
	private String name;
	
	public Ship(int cr, String nm){
		crew = cr;
		name = nm;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int cr) {
		crew = cr;
	}

	public String getName() {
		return name;
	}

	public void setName(String nm) {
		name = nm;
	}
	
	public String toString(){
		return String.format("Name = %s\nCrew = %d\n\n", name, crew);
	}
}
