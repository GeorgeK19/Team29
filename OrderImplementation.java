package hw4;

public class OrderImplementation {
	
	static final int ZERO = 0;
	static final int THREE = 3;
	static final int TWENTY = 20;
	
	private Chisel[] chisels;
	
	private int numberOrder;
	private int totalGrillCapacityOrder = ZERO;
	private int totalGrillTimeOrder = ZERO;
	private int totalPanCapacityOrder = ZERO;
	private int totalPanTimeOrder = ZERO;
	private int dynamicTime = ZERO;

	/**
     * Constructor for OrderImplementation class.
     * 
     * @param aKebabShop    The kebab shop.
     * @param aOrder        The order.
     */
	public OrderImplementation(KebabShop aKebabShop, Order aOrder) {
		
		this.numberOrder = aOrder.getNum();
		
		int sum = (aOrder.getNumberpPork() + aOrder.getNumberpChicken() + aOrder.getNumberpSheftalia() + aOrder.getNumberpMix());
		this.chisels = new Chisel[sum];
		int counter = ZERO;
		
		if(aOrder.getNumberpPork() > ZERO) {
			
			PorkPie porkPies;
			
			for(int i = ZERO; i < aOrder.getNumberpPork(); i++) {
				
				porkPies = new PorkPie(aKebabShop.getCentimetersOfPie(), aKebabShop.getCentimetersOfSkewerPie());
				
				for(int j = ZERO; j < THREE; j++) {
					
					this.chisels[counter] = porkPies.getElementTable(j);
					counter++;
					
				}
				
				this.totalGrillCapacityOrder += porkPies.getTotalCapacity();
				this.totalGrillTimeOrder += porkPies.gettotalTime();
				
			}
			
		}
		
		if(aOrder.getNumberpChicken() > ZERO) {
			
			ChickenPie chickenPies;
			
			for(int i = ZERO; i < aOrder.getNumberpChicken(); i++) {
				
				chickenPies = new ChickenPie(aKebabShop.getCentimetersOfPie(), aKebabShop.getCentimetersOfSkewerPie());
				
				for(int j = ZERO; j < THREE; j++) {
					
					this.chisels[counter] = chickenPies.getElementTable(j);
					counter++;
					
				}
			
				this.totalGrillCapacityOrder += chickenPies.getTotalCapacity();
				this.totalGrillTimeOrder += chickenPies.gettotalTime();
				
			}
			
		}
		
		if(aOrder.getNumberpSheftalia() > ZERO) {
			
			SheftaliaPie sheftaliaPies;
			
			for(int i = ZERO; i < aOrder.getNumberpSheftalia(); i++) {
				
				sheftaliaPies = new SheftaliaPie(aKebabShop.getCentimetersOfPie(), aKebabShop.getCentimetersOfSheftaliaPie());
			
				for(int j = ZERO; j < THREE; j++) {
					
					this.chisels[counter] = sheftaliaPies.getElementTable(j);
					counter++;
					
				}
				
				this.totalGrillCapacityOrder += sheftaliaPies.getTotalCapacity();
				this.totalGrillTimeOrder += sheftaliaPies.gettotalTime();
				
			}
			
		}
		
		if(aOrder.getNumberpMix() > ZERO) {
			
			MixPie mixPies;
			
			for(int i = ZERO; i < aOrder.getNumberpMix(); i++) {
				
				mixPies = new MixPie(aKebabShop.getCentimetersOfPie(), aKebabShop.getCentimetersOfSkewerPie(), aKebabShop.getCentimetersOfSheftaliaPie());
			
				for(int j = ZERO; j < THREE; j++) {
					
					this.chisels[counter] = mixPies.getElementTable(j);
					counter++;
					
				}
				
				this.totalGrillCapacityOrder += mixPies.getTotalCapacity();
				this.totalGrillTimeOrder += mixPies.gettotalTime();
				
			}
			
		}
		
		if(aOrder.getNumberpFries() > ZERO) {
			
			this.totalPanCapacityOrder += aOrder.getNumberpFries();
			
			for(int i = ZERO; i < aOrder.getNumberpFries(); i++)
			
				this.totalPanTimeOrder += TWENTY;
			
		}
		
	}
	
	/**
	 * Sets the total grill capacity for the order.
	 * 
	 * @param newGrillCapacity  The new total grill capacity.
	 */
	public void setTotalGrillCapacityOrder(int newGrillCapacity) {
		
		this.totalGrillCapacityOrder = newGrillCapacity;
		
	}
	
	/**
	 * Sets the total grill time for the order.
	 * 
	 * @param newGrillTime  The new total grill time.
	 */
	public void setTotalGrillTimeOrder(int newGrillTime) {
		
		this.totalGrillTimeOrder = newGrillTime;
		
	}
	
	/**
	 * Removes the given time from the total grill time for the order.
	 * 
	 * @param newGrillTime  The time to be removed from the total grill time.
	 */
	public void removeTotalGrillTimeOrder(int newGrillTime) {
		
		this.totalGrillTimeOrder -= newGrillTime;
		
	}
	
	/**
	 * Sets the total pan capacity for the order.
	 * 
	 * @param newPanCapacity  The new total pan capacity.
	 */
	public void setTotalPanCapacityOrder(int newPanCapacity) {
		
		this.totalPanCapacityOrder = newPanCapacity;
		
	}
	
	/**
	 * Sets the total pan time for the order.
	 * 
	 * @param newPanTime  The new total pan time.
	 */
	public void setTotalPanTimeOrder(int newPanTime) {
		
		this.totalPanTimeOrder = newPanTime;
		
	}
	
	/**
	 * Removes the given time from the total pan time for the order.
	 * 
	 * @param newPanTime  The time to be removed from the total pan time.
	 */
	public void removeTotalPanTimeOrder(int newPanTime) {
		
		this.totalPanTimeOrder -= newPanTime;
		
	}
	
	/**
     * Method to add time.
     */
	public void addTime() {
		
		this.dynamicTime++;
		
	}
	
	/**
     * Retrieves an element from the chisels array.
     * 
     * @param aPosition     The position of the element.
     * @return              The chisel element.
     */
	public Chisel getElementTable(int aPosition) {
		
		return (this.chisels[aPosition]);
		
	}
	
	/**
     * Gets the length of the chisels array.
     * 
     * @return  The length of the chisels array.
     */
	public int getLengthChiselTable() {
		
		return (this.chisels.length);
		
	}
	
	/**
     * Gets the order number.
     * 
     * @return  The order number.
     */
	public int getNumberOrder() {
		
		return (this.numberOrder);
		
	}
	
	/**
     * Gets the total grill capacity for the order.
     * 
     * @return  The total grill capacity.
     */
	public int getTotalGrillCapacityOrder() {
		
		return (this.totalGrillCapacityOrder);
		
	}
	
	/**
     * Gets the total grill time for the order.
     * 
     * @return  The total grill time.
     */
	public int getTotalGrillTimeOrder() {
		
		return (this.totalGrillTimeOrder);
		
	}
	
	/**
     * Gets the total pan capacity for the order.
     * 
     * @return  The total pan capacity.
     */
	public int getTotalPanCapacityOrder() {
		
		return (this.totalPanCapacityOrder);
		
	}
	
	/**
     * Gets the total pan time for the order.
     * 
     * @return  The total pan time.
     */
	public int getTotalPanTimeOrder() {
		
		return (this.totalPanTimeOrder);
		
	}
	
	/**
     * Gets the dynamic time.
     * 
     * @return  The dynamic time.
     */
	public int getDynamicTime() {
		
		return (this.dynamicTime);
		
	}
	
	/**
     * Converts the object to a string representation.
     * 
     * @return  The string representation of the object.
     */
	public String toString() {
		
		return ("The order with number (" + this.numberOrder + ") he needs, total capacity in the grill " 
				+ this.totalGrillCapacityOrder + "centimeters, total time in the grill " + this.totalGrillTimeOrder
				+ " minutes, total capacity in the pan " + this.totalPanCapacityOrder
				+ " portions and total time in the pan " + this.totalPanTimeOrder + " minutes!");
		
	}
	
}
