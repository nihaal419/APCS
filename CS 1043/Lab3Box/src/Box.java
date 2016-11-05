public class Box {
	private String boxColor;
	private double boxHeight;
	private double boxWidth;
	private double boxDepth;
	
	public Box(){
		boxColor = "White";
		boxHeight = 12.;
		boxWidth = 12.;
		boxDepth = 12.;
	}
	
	public Box(double height, double width, double depth, String color){
		boxColor = color;
		boxHeight = height;
		boxWidth = width;
		boxDepth = depth;
	}
	
	public Box(Box box){
		boxColor = box.getColor();
		boxHeight = box.getHeight();
		boxWidth = box.getWidth();
		boxDepth = box.getDepth();
	}
	
	public String getColor(){
		return boxColor;
	}
	
	public double getHeight(){
		return boxHeight;
	}
	
	public double getWidth(){
		return boxWidth;
	}
	
	public double getDepth(){
		return boxDepth;
	}
	
	public void setColor(String color){
		boxColor = color;
	}
	
	public void setHeight(double height){
		boxHeight = height;
	}
	
	public void setWidth(double width){
		boxWidth = width;
	}
	
	public void setDepth(double depth){
		boxDepth = depth;
	}
	
	public double getArea(){
		double area = 2*((boxHeight*boxWidth)+(boxHeight*boxDepth)+(boxWidth*boxDepth));
		return area;
	}
	
	public double getVolume(){
		double volume = boxWidth*boxHeight*boxDepth;
		return volume;
	}
	
	public String toString(){
		String str = "Color: " + getColor() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nDepth: " + getDepth() + "\nArea: " + getArea() + "\nVolume: " + getVolume();
		return str;
	}
}
