public class Freighter extends Ship{
	private double capacity;
	
	public Freighter(int cr, String nm, double cap){
		super(cr,nm);
		capacity = cap;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double cap) {
		capacity = cap;
	}
	
	public String toString(){
		return String.format("Name = %s\nCrew = %d\nCapacity = %.2f\n\n", super.getName(), super.getCrew(), capacity);
	}
}
