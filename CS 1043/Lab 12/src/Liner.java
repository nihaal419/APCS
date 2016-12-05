public class Liner extends Ship{
	private int passengers;
	
	public Liner(int cr, String nm, int pass){
		super(cr, nm);
		passengers = pass;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int pass) {
		passengers = pass;
	}
	
	public String toString(){
		return String.format("Name = %s\nCrew = %d\nPassengers = %d\n\n", super.getName(), super.getCrew(), passengers);
	}
}
