package hw4;

public class KebabShop {
	
	static final int ZERO = 0;
	static final int THREE = 3;
	
	private int rotisserie; // => M
	private int timeCoals; // => T
	private int pans; // => N
	private int panCapacity; // => C
	private int centimetersOfSkewerPie; // => x
	private int centimetersOfSheftaliaPie; // => y
	private int centimetersOfPie; // => z
	private int algorithm;
	
	/**
	 * Default constructor initializing all parameters to zero.
	 */
	public KebabShop() {
		
		this.rotisserie = ZERO;
		this.timeCoals = ZERO;
		this.pans = ZERO;
		this.panCapacity = ZERO;
		this.centimetersOfSkewerPie = ZERO;
		this.centimetersOfSheftaliaPie = ZERO;
		this.centimetersOfPie = ZERO;
		this.algorithm = ZERO;
		
	}
	
	/**
	 * Parameterized constructor initializing all parameters.
	 * 
	 * @param aRotisserie                Length of the grill (M).
	 * @param aTimeCoals                 Time for ignition (T).
	 * @param aPans                      Number of pans (N).
	 * @param aPanCapasity               Capacity of each pan (C).
	 * @param aCentimetersOfSkewerPie   Size of skewer chisels (x).
	 * @param aCentimetersOfSheftaliaPie Size of sheftalia chisels (y).
	 * @param aCentimetersOfPie         Size of pies (z).
	 * @param anAlgorithm                Algorithm used.
	 * @throws IllegalArgumentException if any parameter is less than zero or if the size of the chisels or pies is larger than the grill.
	 */
	public KebabShop(int aRotisserie, int aTimeCoals, int aPans, int aPanCapasity,
			int aCentimetersOfSkewerPie, int aCentimetersOfSheftaliaPie, 
			int aCentimetersOfPie, int anAlgorithm) {
		
		this.rotisserie = aRotisserie;
		this.timeCoals = aTimeCoals;
		this.pans = aPans;
		this.panCapacity = aPanCapasity;
		
		if(aCentimetersOfSkewerPie > aRotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the shewer chisel is larger than the size of the grill!");
			
		}
		this.centimetersOfSkewerPie = aCentimetersOfSkewerPie;
		
		if(aCentimetersOfSheftaliaPie > aRotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the shiftalia chisel is larger than the size of the grill!");
			
		}
		this.centimetersOfSheftaliaPie = aCentimetersOfSheftaliaPie;
		
		if(aCentimetersOfPie > aRotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the pie is larger than the size of the grill!");
			
		}
		this.centimetersOfPie = aCentimetersOfPie;
		
		if((anAlgorithm <= ZERO) || (anAlgorithm > THREE)) {
			
			throw new IllegalArgumentException("Out of bounds number was entered for the algorithm value!");
			
		}
		this.algorithm = anAlgorithm;
		
	}
	
	/**
	 * Sets the length of the grill.
	 * 
	 * @param newRotisserie    The new length of the grill (M).
	 * @throws IllegalArgumentException if the new length is less than zero.
	 */
	public void setRotisserie(int newRotisserie) {
		
		if(newRotisserie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the rotisserie value!");
			
		}
		
		this.rotisserie = newRotisserie;
		
	}
	
	/**
	 * Sets the time for ignition.
	 * 
	 * @param newTimeCoals    The new time for ignition (T).
	 * @throws IllegalArgumentException if the new time is less than zero.
	 */
	public void setTimeCoals(int newTimeCoals) {

		if(newTimeCoals < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the time coals value!");
			
		}
		
		this.timeCoals = newTimeCoals;
		
	}
	
	/**
	 * Sets the number of pans.
	 * 
	 * @param newPans    The new number of pans (N).
	 * @throws IllegalArgumentException if the new number of pans is less than zero.
	 */
	public void setPans(int newPans) {

		if(newPans < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the pans value!");
			
		}
		
		this.pans = newPans;
		
	}
	
	/**
	 * Sets the capacity of each pan.
	 * 
	 * @param newPanCapacity    The new capacity of each pan (C).
	 * @throws IllegalArgumentException if the new capacity is less than zero.
	 */
	public void setPanCapacity(int newPanCapacity) {

		if(newPanCapacity < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the pan capacity value!");
			
		}
		
		this.panCapacity = newPanCapacity;
		
	}
	
	/**
	 * Sets the size of skewer chisels.
	 * 
	 * @param newCentimetersOfSkewerPie    The new size of skewer chisels (x).
	 * @throws IllegalArgumentException if the new size is less than zero or larger than the grill.
	 */
	public void setCentimetersOfSkewerPie(int newCentimetersOfSkewerPie) {

		if(newCentimetersOfSkewerPie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the centimeters of skewer pie value!");
			
		}
		
		if(newCentimetersOfSkewerPie > this.rotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the shewer chisel is larger than the size of the grill!");
			
		}
		
		this.centimetersOfSkewerPie = newCentimetersOfSkewerPie;
		
	}
	
	/**
	 * Sets the size of sheftalia chisels.
	 * 
	 * @param newCentimetersOfSheftaliaPie    The new size of sheftalia chisels (y).
	 * @throws IllegalArgumentException if the new size is less than zero or larger than the grill.
	 */
	public void setCentimetersOfSheftaliaPie(int newCentimetersOfSheftaliaPie) {

		if(newCentimetersOfSheftaliaPie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the centimeters of sheftalia pie value!");
			
		}
		
		if(newCentimetersOfSheftaliaPie > this.rotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the shiftalia chisel is larger than the size of the grill!");
			
		}
		
		this.centimetersOfSheftaliaPie = newCentimetersOfSheftaliaPie;
		
	}
	
	/**
	 * Sets the size of pies.
	 * 
	 * @param newCentimetersOfPie    The new size of pies (z).
	 * @throws IllegalArgumentException if the new size is less than zero or larger than the grill.
	 */
	public void setCentimetersOfPie(int newCentimetersOfPie) {

		if(newCentimetersOfPie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the centimeters of pie value!");
			
		}
		
		if(newCentimetersOfPie > this.rotisserie) {
			
			throw new IllegalArgumentException("Τhe size of the pie is larger than the size of the grill!");
			
		}
		
		this.centimetersOfPie = newCentimetersOfPie;
		
	}
	
	/**
	 * Sets the algorithm used.
	 * 
	 * @param newAlgorithm    The new algorithm used.
	 * @throws IllegalArgumentException if the new algorithm number is less than or equal to zero, or greater than three.
	 */
	public void setAlgorithm(int newAlgorithm) {

		if((newAlgorithm <= ZERO) || (newAlgorithm > THREE)) {
			
			throw new IllegalArgumentException("Out of bounds number was entered for the algorithm value!");
			
		}
		
		this.algorithm = newAlgorithm;
		
	}
	
	/**
	 * Gets the length of the grill.
	 * 
	 * @return The length of the grill (M).
	 */
	public int getRotisserie() {
		
		return (this.rotisserie);
		
	}
	
	/**
	 * Gets the time for ignition.
	 * 
	 * @return The time for ignition (T).
	 */
	public int getTimeCoals() {
		
		return (this.timeCoals);
		
	}
	
	/**
	 * Gets the number of pans.
	 * 
	 * @return The number of pans (N).
	 */
	public int getPans() {
		
		return (this.pans);
		
	}
	
	/**
	 * Gets the capacity of each pan.
	 * 
	 * @return The capacity of each pan (C).
	 */
	public int getPanCapacity() {
		
		return (this.panCapacity);
		
	}
	
	/**
	 * Gets the size of skewer chisels.
	 * 
	 * @return The size of skewer chisels (x).
	 */
	public int getCentimetersOfSkewerPie() {
		
		return (this.centimetersOfSkewerPie);
		
	}
	
	/**
	 * Gets the size of sheftalia chisels.
	 * 
	 * @return The size of sheftalia chisels (y).
	 */
	public int getCentimetersOfSheftaliaPie() {
		
		return (this.centimetersOfSheftaliaPie);
		
	}
	
	/**
	 * Gets the size of pies.
	 * 
	 * @return The size of pies (z).
	 */
	public int getCentimetersOfPie() {
		
		return (this.centimetersOfPie);
		
	}
	
	/**
	 * Gets the algorithm used.
	 * 
	 * @return The algorithm used.
	 */

	public int getAlgorithm() {
		
		return (this.algorithm);
		
	}
	
	/**
	 * Returns a string representation of the Kebab Shop.
	 * 
	 * @return A string describing the Kebab Shop and its parameters.
	 */
	public String toString() {
		
		return ("A Kebab Shop, with a " + this.rotisserie + " cm long grill that takes " + this.timeCoals + " minutes to "
				+ "ignition, " + this.pans + " pans that hold " + this.panCapacity + " portions of fried potatoes,"
				+ this.centimetersOfSkewerPie + " centimeters skewer chisels," + this.centimetersOfSheftaliaPie + " centimeters "
				+ "sheftalia chisels," + this.centimetersOfPie + " centimeter pies and using algorithm " + this.algorithm + ".");
	
	}

}
