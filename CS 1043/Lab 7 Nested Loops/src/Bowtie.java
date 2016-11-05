/* Name: Nihaal Manesia
 * Lab Time: 2:00 PM Thursday
 * Instructor: Childress
 * Lab 7
 */
import java.util.Scanner;

public class Bowtie {
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter an odd-number of output-lines (enter zero to exit the program):");
		
		int nrows = console.nextInt();
		int nblanks = nrows;
		int nstars = 2;
		int nnblanks = 0;
		int nnstars = (nrows/2)+1;
		
		if(!((nrows%2==0)||(nrows==0))){
			for(int a=1;a<(nrows/2)+1;a++){
				for(int d=1;d<nstars;d++){
					System.out.print("*");
				}
				for(int b=1;b<nblanks;b++){
					System.out.print(" ");
				}
				nblanks-=2;
				for(int c=1;c<nstars;c++){
					System.out.print("*");
				}
				nstars++;
				System.out.println();
			}
			for(int e=1;e<=(nrows/2)+1;e++){
				for(int f=1;f<=nnstars;f++){
					System.out.print("*");
				}
				for(int g=1;g<=nnblanks;g++){
					System.out.print(" ");
				}
				nnblanks+=2;
				for(int h=1;h<=nnstars;h++){
					System.out.print("*");
				}
				nnstars--;
				System.out.println();
			}
		}
		else{
			System.out.println("You done messed up. Peace out.");
		}
	}
}
