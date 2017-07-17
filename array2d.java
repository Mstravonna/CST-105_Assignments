//Travonna Wilson 
//this is my own work
//7/16/17
//CST-105

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class array2d {
	

	@SuppressWarnings("resource")
	public static void main (String[] args)  {
		
		Scanner reader = null;
		try {
			reader = new Scanner(new File("C:/Users/Derrick/Desktop/hi.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (reader.hasNext()){
		String str = reader.nextLine();
		 System.out.println(str);
		
		char[][] getarray = new char[20][45];
		
		java.util.Scanner input = new Scanner(System.in);
		System.out.println("Enter" + getarray.length + "rows and " + getarray[0].length + "colums: ");
		 for (char row = 0; row < getarray.length; row++) {
			 for (char column = 0; column < getarray[row].length; column ++) {
				 getarray [row][column] = (char) input.nextInt();
				 
				 
				 for (char row1 = 0; row1 < getarray.length; row1 ++) {
					 for (char column1 = 0; column1 < getarray[row1].length; column1 ++){
						 getarray [row1][column1] = (char) (Math.random() *100);
						 
						 for (int row2 = 0; row2 < getarray.length; row2++) {
							 for (int column2 = 0; column2 < getarray[row2].length; column2++) { 
							 System.out.print(getarray[row2][column2] + " "); } 
							 System.out.println();
							 }
					 }
			
				 }
			 }
		 }
		
		
		   
		 
		
	}
}
}
	
	

