package main.java.com.caso2;

import java.util.Scanner;

public class Main {
	
	public void print(String texto)
	{
        System.out.println(texto);
	}
	
	public void initialize() 
	{
		
		print("banana");
		
	}

    public static void main(String[] args) 
    {
    	
        System.out.println("\nWelcome to the game of life!\n");
        System.out.print("Please choose the number of generations: ");
        Scanner input = new Scanner(System.in);
        //int number = input.nextInt();

        Main mainExecution = new Main();
        mainExecution.initialize();

    }
    
}
