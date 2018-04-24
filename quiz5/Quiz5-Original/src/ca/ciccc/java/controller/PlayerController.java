package ca.ciccc.java.controller;

import java.util.ArrayList;
import java.util.Collections;

import ca.ciccc.java.model.Player;

public final class PlayerController {

	private ArrayList<Player> topFivePlayers;

	/**
	 * Constructor that initializes the attribute
	 */
	public PlayerController() {
		// 1 Point
		// TODO Write your code here
		int players = 5;
		
		System.out.println(topFivePlayers);
		
	}

	/**
	 * Method to add a Player reference into the ArrayList topFivePlayers
	 * 
	 * @param player
	 *            to add
	 */
	public void addPlayer(Player player) {
		// 1 Point
		// TODO Write your code here
		obj.add(leo)
		obj.add(melissa)
		obj.add(maria)
		obj.add(amanda)
		obj.add(john)
		for (int i=1; i<=n; i++;)
			topFivePlayers(i);
	}

	/**
	 * Sort the list of players ordered by name. Alphabetical order.
	 * 
	 * topFivePlayers ArrayList ordered ascendant by name
	 */
	public void sortByName() {
		// 2 Points
		// TODO Execute the sort by name here
		Colletions.sort(list, String.CASE_INSENSITIVE_ORDER);
	}

	/**
	 * Sort the list of players ordered by points. Players with more points are the
	 * highest.
	 * 
	 * topFivePlayers ArrayList ordered descendant by points
	 */
	public void sortByPoints() {
		// 2 Points
		// TODO Execute the sort by points here
		Collections.sort(list, int);
	}

	/**
	 * Get the ArrayList topFivePlayers
	 * 
	 * @return topFivePlayers list
	 */
	public ArrayList<Player> getTopFivePlayers() {
		return topFivePlayers;
	}

}
