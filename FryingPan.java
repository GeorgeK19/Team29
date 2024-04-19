package hw4;

public class FryingPan extends Pan{
	
	static final int ZERO = 0;
	
	private int numberOfPans;
	private int capacity;

	/**
	 * Constructs a FryingPan object with the capacity based on the kebab shop's pan capacity.
	 * 
	 * @param aKebabShop    The kebab shop from which to get the pan capacity.
	 * @throws IllegalArgumentException if the number of pans in the kebab shop is less than zero.
	 */
	public FryingPan(KebabShop aKebabShop) {
		
		super(aKebabShop.getPanCapacity());
		
		if(aKebabShop.getPans() < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the number of pans value!");
			
		}
		this.numberOfPans = aKebabShop.getPans();
		
		this.capacity = (this.numberOfPans * this.getNumberOfPortions());
		
	}
	
	/**
	 * Sets the number of pans in the frying pan.
	 * 
	 * @param newNumberOfPans    The new number of pans in the frying pan.
	 * @throws IllegalArgumentException if the new number of pans is less than zero.
	 */
	public void setNumberOfPans(int newNumberOfPans) {
		
		if(newNumberOfPans < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the number of pans value!");
			
		}
		
		this.numberOfPans = newNumberOfPans;
		
		this.capacity = (this.numberOfPans * this.getNumberOfPortions());
		
	}
	
	/**
	 * Adds capacity to the frying pan.
	 * 
	 * @param oldCapacity    The amount of capacity to add.
	 * @throws IllegalArgumentException if the old capacity is less than zero.
	 */
	public void addCapacity(int oldCapacity) {
		
		if(oldCapacity < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the old capacity value in the Flying Pan!");
			
		}
		
		this.capacity += oldCapacity;
		
	}
	
	/**
	 * Removes capacity from the frying pan.
	 * 
	 * @param newCapacity    The amount of capacity to remove.
	 * @throws IllegalArgumentException if the new capacity is less than zero.
	 */
	public void removeCapacity(int newCapacity) {
		
		if(newCapacity < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new capacity value in the Flying Pan!");
			
		}
		
		this.capacity -= newCapacity;
		
	}
	
	/**
	 * Gets the number of pans in the frying pan.
	 * 
	 * @return The number of pans in the frying pan.
	 */
	public int getNumberOfPans() {
		
		return (this.numberOfPans);
		
	}
	
	/**
	 * Gets the total capacity of the frying pan in portions.
	 * 
	 * @return The total capacity of the frying pan in portions.
	 */
	public int getCapacity() {
		
		return (this.capacity);
		
	}

	@Override
	public String toString() {
		
		return ("The Flying Pan contains " + this.numberOfPans + " pans that hold " 
				+ this.getNumberOfPortions() + " servings, with total capacity " + this.capacity + " portions.");
		
	}
	
}
