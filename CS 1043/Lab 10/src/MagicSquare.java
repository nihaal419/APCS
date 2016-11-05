
public class MagicSquare {
	private int [][] classArray;
	
	public static void main(String [] args){
		int [][] square3 = { {1, 6, 4}, {8, 2, 9}, {5, 7, 3} };
		int [][] square4 = {{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
		
		MagicSquare case1 = new MagicSquare(square3);
		MagicSquare case2 = new MagicSquare(square4);
		
		if(case1.isMagicSq()){
			System.out.println(case1.toString() + "\n" + "Case 1 is a magic square");
		}
		else{
			System.out.println("Case 1 is not a magic square\n\n");
		}
		
		if(case2.isMagicSq()){
			System.out.println(case2.toString() + "\n" + "Case 2 is a magic square");
		}
		else{
			System.out.println("Case 2 is not a magic square\n\n");
		}
		
//		System.out.println(case1.isMagicSq());
//		System.out.println(case2.isMagicSq());
//		
//		System.out.println(case1.toString());
//		System.out.println(case2.toString());
	}
	
	public MagicSquare(int [][] array){
		//classArray = array.clone();
		classArray = new int [array.length][array.length];
		for(int i=0;i<classArray.length;i++){
			for(int x=0;x<classArray[i].length;x++){
				classArray[i][x] = array[i][x];
			}
		}
	}
	
	public Boolean isMagicSq(){
		int sum = 0;
		int tempSum = 0;
		int counter = 0;
		for(int i=0;i<classArray.length;i++){
			for(int x=0;x<classArray[i].length;x++){
				tempSum += classArray[i][x];
			}
			if(counter == 0 && sum == 0){
				sum = tempSum;
				tempSum = 0;
				counter += 1;
			}
			else if(counter > 0 && tempSum == sum){
				counter += 1;
				tempSum = 0;;
			}
			else return false;
		}
		return true;
	}
	
	public String toString(){
		String z = "";
		for(int i=0;i<classArray.length;i++){
			for(int x=0;x<classArray[i].length;x++){
				z = z + " " + Integer.toString(classArray[i][x]);
			}
			z = z + "\n";
		}
		return z;
	}
}
