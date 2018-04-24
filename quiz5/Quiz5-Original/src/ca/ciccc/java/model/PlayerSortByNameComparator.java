package ca.ciccc.java.model;

import java.util.Comparator;

/**
 * This comparator class should be used anytime you need to sort Players by
 * name. The sort must be in alphabetical order.
 */
public class PlayerSortByNameComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		// 2 Points
		// TODO Write your code here
		Colletions.sort(list, String.CASE_INSENSITIVE_ORDER);
		return 0;
	}
}
