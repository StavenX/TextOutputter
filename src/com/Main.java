package com;

import java.util.Formatter;
import java.util.Random;

/**
 * Program that adds a bunch of random text to a text-file. This is just for fun, 
 * and not a serious project
 * 
 * @author Staven
 * @since 20/06/2018
 *
 */

public class Main 
{
	static private Random rand = new Random();
	static private Formatter x;
	
	public static void main(String[] args) {
		
		Main g = new Main();
		
		g.openFile();
		g.addSuperLongRecords();
		g.closeFile();
	}
	
	/**
	 * Opens a file to use as a destination. Uses the file specified,
	 * and if the path does not exists; creates a new one
	 */
	public void openFile() {
		try {
			x = new Formatter("chinese.txt");
		}
		catch(Exception e) {
			System.out.println("Something wrong happened while attempting to open the file.");
		}
	}
	
	/**
	 * Adds text to the file. Will make a new entry each iteration
	 * in the for-loop. Therefore, the amount of entries added can be 
	 * decided by tweaking the value "amount"
	 */
	public void addSuperLongRecords() {
		
		int amount = 10000;
		
		for (int i = 0; i < amount; i++) {
			x.format("%s, %n", getRandomPosNum());
			
		}
	}
	
	/**
	 * Gets a random (positive number) 
	 * 
	 * @return n The positive, random number
	 */
	public int getRandomPosNum() {
		int n = rand.nextInt(); 
		
		if (n < 0) {
			n *= -1;
		}
		return n; 
	}
	
	/**
	 * Closes the file that was previously opened
	 */
	public void closeFile() {
		x.close();
	}
}










