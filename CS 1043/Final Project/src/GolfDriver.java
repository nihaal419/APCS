import java.util.Scanner;
public class GolfDriver {
	public static void main(String [] args){
		Scanner console = new Scanner(System.in);
		Scanner fields = null;
		
		final int MAX_STROKES = 9;
		int count = 0;
		Golfer [] strokes = new Golfer [5];
		
		while(count<5){
			System.out.println("Please enter the golfer's name: ");
			String name = console.next();
			int [] score = new int [MAX_STROKES];
			for(int x=0; x<MAX_STROKES; x++){
				System.out.println("Please enter a score: ");
				score[x] = console.nextInt();
				//count++;
			}
			for(int i=0; i<5; i++){
				Golfer a = new Golfer(name, score);
				strokes[i] = a;
			}
			count++;
		}
		console.close();
		
		System.out.printf("%-7s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-5s%-7s%-5s\n", "Name", "H-1", "H-2", "H-3", "H-4", "H-5", "H-6", "H-7", "H-8", "H-9", "Total", "+-Par");
		for(int num=0; num<65; num++){
			System.out.printf("%s", "-");
		}
		System.out.printf("\n");
		
		int par1,par2,par3,par4,par5,par6,par7,par8,par9;
		
		for(int row=0; row<5; row++){
			Golfer run = strokes[row];
			String gname = run.getName();
			int total = run.totalStrokes();
			for(int col=0; col<5; col++){
				System.out.printf("%-9s", gname);
				for(int z=0; z<MAX_STROKES; z++){
					System.out.printf("%-5d", run.getStroke(z));	
				}
				System.out.printf("%-6d\n", total);
			}
			break;
		}
	}
}