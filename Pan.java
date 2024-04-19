package hw4;

public abstract class Pan {
	
	static final int ZERO = 0;
	
	private int numberOfPortions;
	
	/**
     * Instantiates a new Pan with the specified capacity.
     *
     * @param aPanCapacity the capacity of the pan (number of portions)
     * @throws IllegalArgumentException if the specified capacity is negative
     */
	public Pan(int aPanCapacity) {
		
		if(aPanCapacity < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the pan capacity value!");
			
		}
		this.numberOfPortions = aPanCapacity;
		
	}
	
	/**
     * Sets the number of portions for the pan.
     *
     * @param newPanCapacity the new number of portions for the pan
     * @throws IllegalArgumentException if the newPanCapacity is negative
     */
	public void setNumberOfPortions(int newPanCapacity) {
		
		if(newPanCapacity < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new pan capacity value!");
			
		}
		
		this.numberOfPortions = newPanCapacity;
		
	}
	
	/**
     * Gets the number of portions the pan can hold.
     *
     * @return the number of portions the pan can hold
     */
	public int getNumberOfPortions() {
		
		return (this.numberOfPortions);
		
	}
	
	/**
     * Abstract method to be implemented by subclasses to provide a string representation of the pan.
     *
     * @return a string representation of the pan
     */
	public abstract String toString();

}
