package ca.ciccc.java.model;

/**
 * Model class Player
 * 
 * Nothing to do here
 */
public class Player {

	private String name;
	private int points;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param points
	 */
	public Player(String name, int points) {
		setName(name);
		setPoints(points);
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	/**
	 * @return the points
	 */
	public final int getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public final void setPoints(int points) {
		if (points > 0) {
			this.points = points;
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", points=" + points + "]";
	}

}
