package hw4;

public class Order implements UsefulNumbers{
	
	private int num;
	private int timeOrder;
	private int timeRequirement;
	private int numberpPork;
	private int numberpChicken;
	private int numberpSheftalia;
	private int numberpMix;
	private int numberpFries;
	
	/**
     * Constructs an Order object with default values.
     */
	public Order() {
		
		this(ZERO, ZERO, ZERO, ZERO, ZERO, ZERO, ZERO, ZERO);
		
	}
	
	/**
     * Constructs an Order object with the specified values.
     * @param aNumber The order number.
     * @param aTimeOrder The time when the order was received.
     * @param aTimeRequirement The desired collection time.
     * @param aNumberpPork The quantity of pork skewer pies.
     * @param aNumberpChicken The quantity of chicken skewer pies.
     * @param aNumberpSheftalia The quantity of sheftalia skewer pies.
     * @param aNumberpMix The quantity of mix skewer pies.
     * @param aNumberpFries The quantity of servings for French fries.
     */
	public Order(int aNumber, int aTimeOrder, int aTimeRequirement, int aNumberpPork, 
			int aNumberpChicken, int aNumberpSheftalia, int aNumberpMix, int aNumberpFries) {
		
		if(aNumber < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the increment value!");
			
		}
		this.num = aNumber;
		
		if(aTimeOrder < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for when the order was received!");
			
		}
		if(aTimeOrder > THREE_HUNDRED_ONE) { // 18:00 => aTimeOrder = 0 and aTimeOrder = 23:00 => (1 + (5 * 60)) = 301
			
			throw new IllegalArgumentException("The order has been placed after the permitted telephone order time!");
			
		}
		this.timeOrder = aTimeOrder;
		
		if(aTimeRequirement < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for when the order was received!");
			
		}
		if(aTimeRequirement > THREE_HUNDRED_SIXTY_ONE) { // 18:00 => aTimeOrder = 0 , aTimeOrder = 23:00 => (1 + (5 * 60)) = 301 and aTimeOrder = 24:00 = 361
			
			throw new IllegalArgumentException("The desired time at which the customer wants to receive his order, "
					+ "exceeds the time that the shop is available!");
			
		}
		this.timeRequirement = aTimeRequirement;
		
		if((aNumberpPork < ZERO) || (aNumberpChicken < ZERO) || (aNumberpSheftalia < ZERO)
				|| (aNumberpMix < ZERO) || (aNumberpFries < ZERO)) {
			
			throw new IllegalArgumentException("A negative number was entered for the pie type quantity value" + 
					"(pork skewer, chicken, sheftalia or a mix) or the amount of servings for French fries" + "/n" + 
					"Please check the values ​​of the above variables which are defined as standard variables in the constructor!");
			
		}
		/*if((aNumberpPork == ZERO) || (aNumberpChicken == ZERO) || (aNumberpSheftalia == ZERO)
				|| (aNumberpMix == ZERO) || (aNumberpFries == ZERO)){
			
			throw new IllegalArgumentException("Τhere is no order." + "/n"
					+ " The user did not order anything" + "/n" + "Please check the values ​​"
					+ "of the above variables which are defined as standard variables in the constructor!");
			
		}*/
		this.numberpPork = aNumberpPork;
		this.numberpChicken = aNumberpChicken;
		this.numberpSheftalia = aNumberpSheftalia;
		this.numberpMix = aNumberpMix;
		
		this.numberpFries = aNumberpFries;
		
		int sum = (this.numberpPork + this.numberpChicken + this.numberpSheftalia + this.numberpMix);
		
		if((sum > TEN) && ((this.timeOrder - this.timeRequirement) < SIXTY)) {
			
			throw new IllegalArgumentException("On orders over 10 pies, the desired time "
					+ "collection time cannot be less than one hour");
			
		}
		
	}
	
	/**
     * Constructs an Order object with the specified values and a randomly generated collection time.
     * @param aNumber The order number.
     * @param aTimeOrder The time when the order was received.
     * @param aNumberpPork The quantity of pork skewer pies.
     * @param aNumberpChicken The quantity of chicken skewer pies.
     * @param aNumberpSheftalia The quantity of sheftalia skewer pies.
     * @param aNumberpMix The quantity of mix skewer pies.
     * @param aNumberpFries The quantity of servings for French fries.
     */
	public Order(int aNumber, int aTimeOrder, int aNumberpPork, int aNumberpChicken, 
			int aNumberpSheftalia, int aNumberpMix, int aNumberpFries) {
		
		if(aNumber < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the increment value!");
			
		}
		this.num = aNumber;
		
		if(aTimeOrder < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for when the order was received!");
			
		}
		if(aTimeOrder > THREE_HUNDRED_ONE) { // 18:00 => aTimeOrder = 0 and aTimeOrder = 23:00 => (1 + (5 * 60)) = 301
			
			throw new IllegalArgumentException("The order has been placed after the permitted telephone order time!");
			
		}
		this.timeOrder = aTimeOrder;
		
		int aTimeRequirement = (this.timeOrder + StatisticalCharacteristics.randomTimeRequirement());
		while(aTimeRequirement > THREE_HUNDRED_SIXTY_ONE){// 18:00 => aTimeOrder = 0 , aTimeOrder = 23:00 => (1 + (5 * 60)) = 301 and aTimeOrder = 24:00 = 361
			
			aTimeRequirement = (this.timeOrder + StatisticalCharacteristics.randomTimeRequirement());
			
		} //There is no need to check with zero because it is done for the timeOrder and since StatisticalCharacteristics.randomTimeRequirement() takes values ​​from 30 - 180
		  // aTimeRequirement = addition of two non-zero numbers
		this.timeRequirement = aTimeRequirement;
		
		if((aNumberpPork < ZERO) ||  (aNumberpChicken < ZERO) || (aNumberpSheftalia < ZERO)
				|| (aNumberpMix < ZERO) || (aNumberpFries < ZERO)) {
			
			throw new IllegalArgumentException("A negative number was entered for the pie type quantity value" + 
					"(pork skewer, chicken, sheftalia or a mix) or the amount of servings for French fries" + "/n" + 
					"Please check the values ​​of the above variables which are defined as standard variables in the constructor!");
			
		}
		if((aNumberpPork == ZERO) || (aNumberpChicken == ZERO) || (aNumberpSheftalia == ZERO)
				|| (aNumberpMix == ZERO) || (aNumberpFries == ZERO)){
			
			throw new IllegalArgumentException("Τhere is no order." + "/n"
					+ " The user did not order anything" + "/n" + "Please check the values ​​"
					+ "of the above variables which are defined as standard variables in the constructor!");
			
		}
		this.numberpPork = aNumberpPork;
		this.numberpChicken = aNumberpChicken;
		this.numberpSheftalia = aNumberpSheftalia;
		this.numberpMix = aNumberpMix;
		
		this.numberpFries = aNumberpFries;
		
		
		int sum = (this.numberpPork + this.numberpChicken + this.numberpSheftalia + this.numberpMix);
		
		if((sum > TEN) && ((this.timeOrder - this.timeRequirement) < SIXTY)) {
			
			throw new IllegalArgumentException("On orders over 10 pies, the desired time "
					+ "collection time cannot be less than one hour");
			
		}
		
	}
	
	/**
     * Constructs an Order object with the specified order number and randomly generated values.
     * @param aNumber The order number.
     */
	public Order(int aNumber) {
		
		if(aNumber < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the increment value!");
			
		}
		this.num = aNumber;
		
		this.timeOrder = StatisticalCharacteristics.normalGaussianDistribution();
		
		int aTimeRequirement = (this.timeOrder + StatisticalCharacteristics.randomTimeRequirement());
		while(aTimeRequirement > THREE_HUNDRED_SIXTY_ONE){// 18:00 => aTimeOrder = 0 , aTimeOrder = 23:00 => (1 + (5 * 60)) = 301 and aTimeOrder = 24:00 = 361
			
			aTimeRequirement = (this.timeOrder + StatisticalCharacteristics.randomTimeRequirement());
			
		} //There is no need to check with zero because it is done for the timeOrder and since StatisticalCharacteristics.randomTimeRequirement() takes values ​​from 30 - 180
		  // aTimeRequirement = addition of two non-zero numbers
		this.timeRequirement = aTimeRequirement;
		
		int[] array = new int[FOUR];
		int sum = ZERO;
		do{
			array = StatisticalCharacteristics.randomPieSpecies();
			int number = ZERO;
			
			this.numberpPork = array[number];
			this.numberpChicken = array[++number];
			this.numberpSheftalia = array[++number];
			this.numberpMix = array[++number];
			
			sum = (this.numberpPork + this.numberpChicken + this.numberpSheftalia + this.numberpMix);
			
		}while((sum > TEN) && ((this.timeOrder - this.timeRequirement) < SIXTY)) ;
		
		this.numberpFries = StatisticalCharacteristics.randomΝumberOfFries();
		
	}
	
	/**
     * Sets the order number.
     * @param newNum The new order number.
     * @throws IllegalArgumentException if the new order number is negative.
     */
	public void setNum(int newNum) {
		
		if(newNum < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the increment value!");
			
		}
		
		this.num = newNum;
		
	}
	
	/**
     * Sets the time when the order was received.
     * @param newTimeOrder The new time when the order was received.
     * @throws IllegalArgumentException if the new time order is negative or exceeds the permitted telephone order time.
     */
	public void setTimeOrder(int newTimeOrder) {
		
		if(newTimeOrder < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for when the order was received!");
			
		}
		
		if(newTimeOrder > THREE_HUNDRED_ONE) { // 18:00 => aTimeOrder = 0 and aTimeOrder = 23:00 => (1 + (5 * 60)) = 301
			
			throw new IllegalArgumentException("The order has been placed after the permitted telephone order time!");
			
		}
		
		this.timeOrder = newTimeOrder;
		
	}
	
	/**
     * Sets the desired collection time.
     * @param newTimeRequirement The new desired collection time.
     * @throws IllegalArgumentException if the new time requirement is negative or exceeds the shop's available time.
     */
	public void setTimeRequirement(int newTimeRequirement) {
		
		if(newTimeRequirement < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for when the order was received!");
			
		}
		
		int sum = (this.numberpPork + this.numberpChicken + this.numberpSheftalia + this.numberpMix);
		
		if((sum > TEN) && ((this.timeOrder - this.timeRequirement) < SIXTY)) {
			
			throw new IllegalArgumentException("On orders over 10 pies, the desired time "
					+ "collection time cannot be less than one hour");
			
		}
		
		if(newTimeRequirement > THREE_HUNDRED_SIXTY_ONE) { // 18:00 => aTimeOrder = 0 , aTimeOrder = 23:00 => (1 + (5 * 60)) = 301 and aTimeOrder = 24:00 = 361
			
			throw new IllegalArgumentException("The desired time at which the customer wants to receive his order, "
					+ "exceeds the time that the shop is available!");
			
		}
		
		this.timeRequirement = newTimeRequirement;
		
	}
	
	/**
     * Sets the quantity of pork skewer pies.
     * @param newNumberpPork The new quantity of pork skewer pies.
     * @throws IllegalArgumentException if the new quantity is negative.
     */
	public void setNumberpPork(int newNumberpPork) {
		
		if(newNumberpPork < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the desired amount of pork skewer pie!");
			
		}
		
		this.numberpPork = newNumberpPork;
		
	}
	
	/**
     * Sets the quantity of chicken skewer pies.
     * @param newNumberpChicken The new quantity of chicken skewer pies.
     * @throws IllegalArgumentException if the new quantity is negative.
     */
	public void setNumberpChicken(int newNumberpChicken) {
		
		if(newNumberpChicken < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the desired amount of chicken skewer pie!");
			
		}
		
		this.numberpChicken = newNumberpChicken;
		
	}
	
	public void setNumberpSheftalia(int newNumberpSheftalia) {
		
		if(newNumberpSheftalia < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the desired amount of sheftalia skewer pie!");
			
		}
		
		this.numberpSheftalia = newNumberpSheftalia;
		
	}
	
	/**
     * Sets the quantity of sheftalia skewer pies.
     * @param newNumberpSheftalia The new quantity of sheftalia skewer pies.
     * @throws IllegalArgumentException if the new quantity is negative.
     */
	public void setNumberpMix(int newNumberpMix) {
		
		if(newNumberpMix < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the desired amount of mix skewer pie!");
			
		}
		
		this.numberpMix = newNumberpMix;
		
	}
	
	/**
     * Sets the quantity of servings for French fries.
     * @param newNumberpFries The new quantity of servings for French fries.
     * @throws IllegalArgumentException if the new quantity is negative.
     */
	public void setNumberpFries(int newNumberpFries) {
		
		if(newNumberpFries < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the desired amount of fries!");
			
		}
		
		this.numberpFries = newNumberpFries;
		
	}
	
	
	/**
     * Gets the order number.
     * @return The order number.
     */
	public int getNum() {
		
		return (this.num);
		
	}
	
	/**
     * Gets the time when the order was received.
     * @return The time when the order was received.
     */
	public int getTimeOrder() {
		
		return (this.timeOrder);
		
	}
	
	/**
     * Gets the desired collection time.
     * @return The desired collection time.
     */
	public int getTimeRequirement() {
		
		return (this.timeRequirement);
		
	}
	
	/**
     * Gets the quantity of pork skewer pies.
     * @return The quantity of pork skewer pies.
     */
	public int getNumberpPork() {
		
		return (this.numberpPork);
		
	}
	
	/**
     * Gets the quantity of chicken skewer pies.
     * @return The quantity of chicken skewer pies.
     */
	public int getNumberpChicken() {
		
		return (this.numberpChicken);
		
	}
	
	/**
     * Gets the quantity of sheftalia skewer pies.
     * @return The quantity of sheftalia skewer pies.
     */
	public int getNumberpSheftalia() {
		
		return (this.numberpSheftalia);
		
	}
	
	/**
     * Gets the quantity of mix skewer pies.
     * @return The quantity of mix skewer pies.
     */
	public int getNumberpMix() {
		
		return (this.numberpMix);
		
	}
	
	/**
     * Gets the quantity of servings for French fries.
     * @return The quantity of servings for French fries.
     */
	public int getNumberpFries() {
		
		return (this.numberpFries);
		
	}

	/**
     * Compares this Order to the specified object.
     * @param anObject The object to compare to.
     * @return true if the Orders are equal, false otherwise.
     */
	public boolean equals(Object anObject) {
		
		if(anObject == null)
			
			return false;
		
		if(this.getClass() != anObject.getClass())
			
			return false;
		
		Order newOrder = (Order)anObject;
		
		return ((this.num == newOrder.getNum()) && (this.timeOrder == newOrder.getTimeOrder())
				&& (this.timeRequirement == newOrder.getTimeRequirement()) && (this.numberpPork == newOrder.getNumberpPork())
				&& (this.numberpChicken == newOrder.getNumberpChicken()) && (this.numberpSheftalia == newOrder.getNumberpSheftalia())
				&& (this.numberpMix == newOrder.getNumberpMix()) && (this.numberpFries == newOrder.getNumberpFries()));
		
	}
	
	/**
     * Returns a string representation of this Order.
     * @return A string representation of this Order.
     */
	public String toString() {
		
		return (this.num + " " + this.timeOrder + " " + this.timeRequirement + " "
				+ this.numberpPork + " " + this.numberpChicken + " " + this.numberpSheftalia
				+ " " + this.numberpMix + " " +this.numberpFries);
		
	}
	
	
}
