package com.TheMasterMindGroup.TextInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteIntoFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File ("C:\\Users\\Accountant DE\\Desktop\\output.txt");
		
		if(file.exists()) {
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		output.print("Winter is coming");
		output.println("John snow is the king of the north");
		
		output.print("J s slept with this aunt");
		output.println("If I had such an aunt I would do");
	
		output.close();
	}

}
