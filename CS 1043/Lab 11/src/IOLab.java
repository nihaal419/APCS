import java.util.*;
import java.io.*;

public class IOLab {
	private double [][] data;
	
	public static void main(String [] args){
		IOLab fileTest = new IOLab();
		fileTest.readData();
		System.out.println("\n" + fileTest.toString() );
		fileTest.writeData();
	}
	
	public void readData(){
		boolean tryAgain;
		Scanner tokens = null;
		
		do{
			Scanner console = new Scanner( System.in );
			System.out.print( "Please enter a file name to read: " );
			String inFile = console.next();
			tryAgain = false;
			
			try{
				File file = new File(inFile);
				tokens = new Scanner( file );
				
				int nrows = tokens.nextInt();
				int ncols = tokens.nextInt();
				
				data = new double [nrows][ncols];
				
				for(int i=0;i<nrows;++i){
					for(int x=0;x<ncols;++x){
						double value = tokens.nextDouble();
						data[i][x] = value;
						System.out.printf("%10.4f", value);
					}
					System.out.println();
				}
			}
			catch(FileNotFoundException er){
				System.out.printf("Error opening file %s, %s\n", inFile, er);
				tryAgain = true;
			}
			catch(Exception er){
				System.out.printf("Unrecoverable exception, exiting program %s\n", er);
			}
			finally{
				if(tokens!=null) tokens.close();
			}
		} while(tryAgain);
	}
	
	public void writeData(){
		final int NROWS = 6;
		final int NCOLS = 4;
		
		Scanner console = new Scanner(System.in);
		
		System.out.printf("Enter a file name for writing data: ");
		String outputfile = console.next();
		
		try{
			FileWriter writeIt = new FileWriter(outputfile);
			PrintWriter out = new PrintWriter(writeIt);
			
			out.printf("%d\n", NROWS);
			out.printf("%d\n", NCOLS);
			
			
			for(int i=0;i<NROWS;i++){
				for(int x=0;x<NCOLS;x++){
					out.printf("%12.4f", data[i][x]);
				}
				out.println();
			}
			out.printf("Nihaal Manesia");
			
			out.close();
		}
		catch(IOException e){
			System.out.printf("IOException error %s\n.", e);
		}
	}
	
	public String toString(){
		String z = "";
		for(int i=0;i<data.length;i++){
			for(int x=0;x<data[i].length;x++){
				z += String.format("%12.4f", data[i][x]);
			}
			z += String.format("\n");
		}
		return z;
	}
}
