package ca.ciccc.java.controller;

import Profession.hockeyplayer;

/*
 * QUIZ #5
 * 
 * Main Instructions:
 * 
 * 1) Create 5 players objects with the follow data:
 * 		Player 1 - Name: Leo      Points: 100
 * 		Player 2 - Name: Melissa  Points: 200
 * 		Player 3 - Name: Maria    Points: 315
 * 		Player 4 - Name: Amanda   Points: 120
 * 		Player 5 - Name: John     Points: 50
 *  
 *    Add these five players references into the ArrayList topFivePlayers
 * 
 * 2) Implement all methods that contain a TODO comment
 * 
 * 3) DO NOT change any method without a TODO comment. 
 *    Also DO NOT add, remove, or change any instance variable from any class.
 * 
 * 4) It is NOT necessary to create any new class, or any new method or change any method signature. 
 *    Just implement the body from methods with a TODO comment 
 *    
 * 5) At the end the program MUST compile, run and print the players before and after sort
 * 
 * 6) Write your name right below in the Driver class comment
 * 
 * 7) Zip the entire project and send by email
 * 
 */

/**
 * Driver Class
 * 
 * @author TODO Robson
 *
 */
public class Driver {

	private PlayerController pController;

	/**
	 * Constructor that initializes the attribute
	 */
	public Driver() {
		// 1 Point
		// TODO Write your code here
		player1 leo = new player1("Leo",100);
		player2 melissa = new player2("Melissa",200);
		player3 maria = new player3("Maria",315);
		player4 amanda = new player4("Amanda",120);
		player5 john = new player5("John",50);
		
	}

	/**
	 * Method to print players from the ArrayList topFivePlayers
	 */
	public void printPlayers() {
		/*
		 * 3 Points
		 * 
		 * TODO - Get the ArrayList topFivePlayers from PlayerController class and use
		 * Iterator to go through the list and print each Player object
		 */
		System.out.println("Player Names");
        for(PlayerController PlayerController : PlayerController){
            System.out.println(PlayerController);
		
	}

	/**
	 * Run method that call all other methods in order to execute the program
	 */
	public void run() {
		/*
		 * 1 Point
		 * 
		 * TODO Create 5 player objects and add into the ArrayList topFivePlayers from
		 * PlayerController class
		 */

		System.out.println("Before sort by name\n");
		printPlayers();

		pController.sortByName(Player player);

		System.out.println("\nAfter sort by name\n");
		printPlayers();

		System.out.println("\nBefore sort by points\n");
		printPlayers();

		pController.sortByPoints(Player player);

		System.out.println("\nAfter sort by points\n");
		printPlayers();
	}

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.run();
	}

}
