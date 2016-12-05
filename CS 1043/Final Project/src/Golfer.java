public class Golfer {
	private String name;
	private int [] strokes;
	
	public Golfer(String nm, int [] arr){
		name = nm;
		
		strokes = new int [arr.length];
		for(int i=0; i<strokes.length; i++){
			strokes[i] = arr[i];
		}
	}
	
	public int getStroke(int index){
		return strokes[index];
	}
	
	public String getName(){
		return name;
	}
	
	public int totalStrokes(){
		int total = 0;
		
		for(int i=0; i<strokes.length; i++){
			total += strokes[i]; 
		}
		return total;
	}
	
	public String toString(){
		String complete = "";
		complete += String.format("%s, ", name);
		for(int i=0; i<strokes.length; i++){
			complete += String.format("%d, ", strokes[i]);
		}
		return complete + String.format("%d", totalStrokes());
	}
}