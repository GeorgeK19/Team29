package hw4;

public class ReadyOrder implements UsefulNumbers{
	
	private int num;
	private int timeOrder;
	private int timeDelivery;
	private int timeDelay;;
	private int numberPies;
	private int numberFries;
	
	/**
     * Instantiates a new ReadyOrder with the specified parameters.
     *
     * @param aNumber the order number
     * @param aTimeOrder the time the order was placed
     * @param aTimeDelivery the time the order is delivered
     * @param aTimeDelay the delay time for the order
     * @param aNumberPies the number of pies in the order
     * @param aNumberFries the number of fries in the order
     */
	public ReadyOrder(int aNumber, int aTimeOrder, int aTimeDelivery, int aTimeDelay,
			int aNumberPies, int aNumberFries) {
		
		if(aNumber < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the increment value!");
			
		}
		this.num = aNumber;
		
		if(aTimeOrder < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the time order value!");
			
		}
		this.timeOrder = aTimeOrder;
		
		if(aTimeDelivery < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the time delivery value!");
			
		}
		this.timeDelivery = aTimeDelivery;
		
		this.timeDelay = aTimeDelay;
		
		if(aNumberPies < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the number of pies value!");
			
		}
		this.numberPies = aNumberPies;
		
		if(aNumberFries < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the number of fries value!");
			
		}
		this.numberFries = aNumberFries;
		
	}
	
	 /**
     * Sets the order number.
     *
     * @param newNum the new order number
     */
	public void setNum(int newNum) {
		
		if(newNum < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new increment value!");
			
		}
		
		this.num = newNum;
		
	}
	
	/**
     * Sets the time the order was placed.
     *
     * @param newTimeOrder the new time order
     */
	public void setTimeOrder(int newTimeOrder) {
		
		if(newTimeOrder < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new time order value!");
			
		}
		
		this.timeOrder = newTimeOrder;
		
	}
	
	/**
     * Sets the time the order is delivered.
     *
     * @param newTimeDelivery the new time delivery
     */
	public void setTimeDelivery(int newTimeDelivery) {
		
		if(newTimeDelivery < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new time delivery value!");
			
		}
		
		this.timeDelivery = newTimeDelivery;
		
	}
	
	/**
     * Sets the delay time for the order.
     *
     * @param newTimeDelay the new time delay
     */
	public void setTimeDelay(int newTimeDelay) {
		
		this.timeDelay = newTimeDelay;
		
	}
	
	/**
     * Sets the number of pies in the order.
     *
     * @param newNumberPies the new number of pies
     */
	public void setNumberPies(int newNumberPies) {
		
		if(newNumberPies < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new number of pies value!");
			
		}
		
		this.numberPies = newNumberPies;
		
	}
	
	/**
     * Sets the number of fries in the order.
     *
     * @param newNumberFries the new number of fries
     */
	public void setNumberFries(int newNumberFries) {
		
		if(newNumberFries < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for new the number of fries value!");
			
		}
		
		this.numberFries = newNumberFries;
		
	}
	
	 /**
     * Gets the order number.
     *
     * @return the order number
     */
	public int getNum() {
		
		return (this.num);
		
	}
	
	/**
     * Gets the time the order was placed.
     *
     * @return the time order
     */
	public int getTimeOrder() {

		return (this.timeOrder);
		
	}
	
	/**
     * Gets the time the order is delivered.
     *
     * @return the time delivery
     */
	public int getTimeDelivery() {
		
		return (this.timeDelivery);
		
	}
	
	/**
     * Gets the delay time for the order.
     *
     * @return the time delay
     */
	public int getTimeDelay() {

		return (this.timeDelay);
		
	}
	
	/**
     * Gets the number of pies in the order.
     *
     * @return the number of pies
     */
	public int getNumberPies() {

		return (this.numberPies);
		
	}
	
	/**
     * Gets the number of fries in the order.
     *
     * @return the number of fries
     */
	public int getNumberFries() {

		return (this.numberFries);
		
	}
	
	public String toString() {
		
		return (this.num + " " + this.timeOrder + " " + this.timeDelivery + " "
				+ this.timeDelay + " " + this.numberPies + " " + this.numberFries);
		
	}

}
