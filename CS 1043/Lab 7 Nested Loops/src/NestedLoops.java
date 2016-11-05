/* Name: Nihaal Manesia
 * Lab Time: 2:00 PM Thursday
 * Instructor: Childress
 * Lab 7
 */
import java.util.Scanner;

public class NestedLoops {
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter an odd-number of output-lines (enter zero to exit the program):");
		
		int nrows = console.nextInt();
		int nblanks = 0;
		int nstars = nrows;
		int nnblanks = nrows - 5;
		int nnstars = 1;
	
		if(!((nrows%2==0)||(nrows==0))){
			for(int x=1;x<=nrows/2;x++){
				for(int y=1;y<=nblanks;y++){
					System.out.print(" ");
				}
				nblanks++;
				for(int z=1;z<=nstars;z++){
					System.out.print("*");
				}
				nstars-=2;
				System.out.println();
			}
			for(int b=1;b<=(nrows/2)+1;b++){
				for(int c=1;c<=nnblanks;c++){
					System.out.print(" ");
				}
				for(int d=1;d<=nnstars;d++){
					System.out.print("*");
				}
				System.out.println();
				nnblanks--;
				nnstars +=2;
			}
		}
		else{
			System.out.println("You done messed up. Peace out.");
		}
	}
}
