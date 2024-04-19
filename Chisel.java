package hw4;

public class Chisel {
	
	static final int ZERO = 0;
	
	private int centimeters;
	private int minutes;
	
	/**
	 * Constructs a Chisel object with specified centimeters and minutes.
	 * 
	 * @param aCentimeters    The size of the chisel in centimeters.
	 * @param aMinutes    The time needed to bake using the chisel in minutes.
	 * @throws IllegalArgumentException if aCentimeters or aMinutes is less than or equal to zero.
	 */
	public Chisel(int aCentimeters, int aMinutes) {
		
		if(aCentimeters <= ZERO) {
			
			throw new IllegalArgumentException("A negative number (including zero) was entered for the centimeters value!");
			
		}
		this.centimeters = aCentimeters;
		
		if(aMinutes <= ZERO) {
			
			throw new IllegalArgumentException("A negative number (including zero) was entered for the minutes value!");
			
		}
		this.minutes = aMinutes;
		
	}
	
	/**
	 * Constructs a Chisel object with specified centimeters and default minutes set to zero.
	 * 
	 * @param aCentimeters    The size of the chisel in centimeters.
	 * @throws IllegalArgumentException if aCentimeters is less than or equal to zero.
	 */
	public Chisel(int aCentimeters) {
		
		if(aCentimeters <= ZERO) {
			
			throw new IllegalArgumentException("A negative number (including zero) was entered for the centimeters value!");
			
		}
		this.centimeters = aCentimeters;
		
		this.minutes = ZERO;
		
	}
	
	/**
	 * Sets the size of the chisel.
	 * 
	 * @param newCentimeters    The new size of the chisel in centimeters.
	 * @throws IllegalArgumentException if newCentimeters is less than or equal to zero.
	 */
	public void setCentimeters(int newCentimeters) {
		
		if(newCentimeters <= ZERO) {
			
			throw new IllegalArgumentException("A negative number (including zero) was entered for the centimeters value!");
			
		}
		
		this.centimeters = newCentimeters;
		
	}
	
	/**
	 * Sets the time needed to bake using the chisel.
	 * 
	 * @param newMinutes    The new time needed to bake using the chisel in minutes.
	 * @throws IllegalArgumentException if newMinutes is less than or equal to zero.
	 */
	public void setTimes(int newMinutes) {
		
		if(newMinutes <= ZERO) {
			
			throw new IllegalArgumentException("A negative number (including zero) was entered for the minutes value!");
			
		}
		
		this.minutes = newMinutes;
		
	}
	
	/**
	 * Gets the size of the chisel.
	 * 
	 * @return The size of the chisel in centimeters.
	 */
	public int getCentimeters() {
		
		return (this.centimeters);
		
	}
	
	/**
	 * Gets the time needed to bake using the chisel.
	 * 
	 * @return The time needed to bake using the chisel in minutes.
	 */
	public int getMinutes() {
		
		return (this.minutes);
		
	}
	
	/**
	 * Returns a string representation of the Chisel object.
	 * 
	 * @return A string describing the size of the chisel and the time needed to bake using it.
	 */
	public String toString() {
		
		return ("The chisel size is " + this.centimeters + " and he needs " 
				+ this.minutes + " minutes to be baked.");
		
	}

}
