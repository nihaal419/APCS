public class BoxRunner {
	public static void main(String [] args){
		Box box1 = new Box( );  // this references the no-arg constructor
	    Box box2 = new Box( 20., 30., 40., "green" );
	    
	    Box box3 = new Box(18.,36.,18.,"blue");
	    
	    Box box4 = new Box(box3);
	    
	    box1.setColor("red");
	    box1.setWidth(24.);
	    
	    System.out.println(box1.getColor() + " Box. Area: " + box1.getArea());
	    System.out.println(box2.getColor() + " Box. Area: " + box2.getArea());
	    System.out.println(box3.getColor() + " Box. Area: " + box3.getArea());
	    System.out.println(box4.getColor() + " Box. Area: " + box4.getArea());
	    
	    double totalSurfaceArea = box1.getArea()+box2.getArea()+box3.getArea()+box4.getArea();
	    System.out.println("Total Surface Area: " + totalSurfaceArea);
	    
	    System.out.println("");
	    
	    System.out.println(box1.getColor() + " Box. Volume: " + box1.getVolume());
	    System.out.println(box2.getColor() + " Box. Volume: " + box2.getVolume());
	    System.out.println(box3.getColor() + " Box. Volume: " + box3.getVolume());
	    System.out.println(box4.getColor() + " Box. Volume: " + box4.getVolume());
	    
	    double totalStorageVolume = box1.getVolume()+box2.getVolume()+box3.getVolume()+box4.getVolume();
	    System.out.println("Total Storage Volume: "+totalStorageVolume);
	    
	    System.out.println("");
	    
	    box4.setColor("yellow");
	    box4.setHeight(15.);
	    
	    System.out.println(box1.toString());
	    System.out.println("");
	    System.out.println(box2.toString());
	    System.out.println("");
	    System.out.println(box3.toString());
	    System.out.println("");
	    System.out.println(box4.toString());
	}
}
