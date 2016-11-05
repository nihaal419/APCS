/**
 * Nihaal Manesia
 * Childress
 * 10/20/16
 */
public class ArrayOps {
	int [] data = new int[10];
	
	public ArrayOps(int [] arg){
		for(int x=0;x<arg.length;x++){
			data[x] = arg[x];
		}
	}
	
	public int findMin(){
		int minIndex = 0;
		int arrayMin = data[minIndex];
		for(int x=0;x<data.length;x++){
			if(data[x]<arrayMin){
				arrayMin = data[x];
				minIndex = x;
			}
		}
		return minIndex;
	}
	
	public void reverse(){
		for(int x=0;x<data.length/2;x++){
			int temp = data[x];
		    data[x] = data[data.length - x - 1];
		    data[data.length - x - 1] = temp;
		}
	}
	
	public String toString(){
		String completeArray = "";
		for(int x=0;x<data.length;x++){
			completeArray = completeArray + " " + Integer.toString(data[x]);
		}
		return completeArray;
	}
	
	public static void main(String [] args){
		int [] input = {0, 1, -2, -3, 4, 5, -6, -7, 8, 9};
		ArrayOps testObj = new ArrayOps( input );
		
		System.out.println("\nObject's index for the smallest value is: " + testObj.findMin() + "\n" );
		
		System.out.println(testObj.toString());
		testObj.reverse();
		System.out.println(testObj.toString());
		int mindex = testObj.findMin();
		
		System.out.println("\nObject's index for the smallest value after reverse is : " + mindex + "\n" );
		
	}
}
