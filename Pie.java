package hw4;

public abstract class Pie {
	
	static final int ZERO = 0;
	static final int FIVE = 5;
	
	public static final int MINUTES_OF_PIE_BAKING = FIVE;
	
	private int centimetersOfPie; // => z
	private int totalCapacity = ZERO;
	private int totalTime = ZERO;
	
	/**
     * Instantiates a new Pie with the specified centimeters of pie.
     *
     * @param aCentimetersOfPie the centimeters of pie
     */
	public Pie(int aCentimetersOfPie) {
		
		this.centimetersOfPie = aCentimetersOfPie;
		
		this.totalCapacity += this.centimetersOfPie;
		this.totalTime += MINUTES_OF_PIE_BAKING;
		
	}

	/**
     * Sets the centimeters of pie.
     *
     * @param newCentimetersOfPie the new centimeters of pie
     * @throws IllegalArgumentException if the newCentimetersOfPie is negative
     */
	public void setCentimetersOfPie(int newCentimetersOfPie) {
		
		if(newCentimetersOfPie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the centimeters of pie value!");
			
		}
		
		this.totalCapacity -= this.centimetersOfPie;
		
		this.centimetersOfPie = newCentimetersOfPie;
		
		this.totalCapacity += this.centimetersOfPie;
		
	}
	
	/**
     * Adds the specified centimeters to the total capacity of the pie.
     *
     * @param newCentimeters the centimeters to add
     */
	public void addCentimeters(int newCentimeters) {
		
		this.totalCapacity += newCentimeters;
		
	}
	
	 /**
     * Adds the specified minutes to the total time needed to bake the pie.
     *
     * @param newMinutes the minutes to add
     */
	public void addΜinutes(int newMinutes) {
		
		this.totalTime += newMinutes;
		
	}
	/**
     * Gets the centimeters of pie.
     *
     * @return the centimeters of pie
     */
	public int getCentimetersOfPie() {
		
		return (this.centimetersOfPie);
		
	}
	
	/**
     * Gets the total capacity of the pie.
     *
     * @return the total capacity of the pie
     */
	public int getTotalCapacity() {
		
		return (this.totalCapacity);
		
	}
	
	/**
     * Gets the total time needed to bake the pie.
     *
     * @return the total time needed to bake the pie
     */
	public int gettotalTime() {
		
		return (this.totalTime);
		
	}
	
	/**
     * Abstract method to be implemented by subclasses to generate a random baking time.
     *
     * @return the random baking time
     */
	public abstract int randomTime();
	
	/**
     * Abstract method to be implemented by subclasses to provide a string representation of the pie.
     *
     * @return a string representation of the pie
     */
	public abstract String toString();

}
