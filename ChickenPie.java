package hw4;

/**
 * Class representing a Chicken Pie, extending the Pie class.
 */
public class ChickenPie extends Pie{
	
	static final int ONE = 1;
	static final int TWO = 2;
	static final int FIFTEEN = 15;
	static final int TWENTY = 20;
	
	public static final int ΝUMBER_OF_CHISELS = TWO;
	
	private Chisel[] chisels = new Chisel[ΝUMBER_OF_CHISELS + ONE];
	
	/**
     * Constructor for ChickenPie class.
     * 
     * @param aCentimetersOfPie    The centimeters of pie for the Chicken Pie.
     * @param aCentimetersOfSkewerPie    The centimeters of skewer pie for the Chicken Pie.
     */
	public ChickenPie(int aCentimetersOfPie, int aCentimetersOfSkewerPie) { // acentimetersOfSkewerPie => x
		
		super(aCentimetersOfPie);
		this.chisels[ZERO] = new Chisel(this.getCentimetersOfPie(), FIVE);
		
		this.addCentimeters((TWO * aCentimetersOfSkewerPie));
		
		for(int i = ZERO; i < ΝUMBER_OF_CHISELS; i++) {
			
			this.chisels[i + ONE] = new Chisel(aCentimetersOfSkewerPie);
			
		}
		
		this.addΜinutes(this.randomTime());
		
	}
	
	/**
     * Gets the Chisel object at the specified position in the Chicken Pie.
     * 
     * @param aPosition    The position of the Chisel in the Chicken Pie.
     * @return The Chisel object at the specified position.
     */
	public Chisel getElementTable(int aPosition) {
		
		return (this.chisels[aPosition]);
		
	}

	@Override
	public int randomTime() {
		
		int minutes = ZERO;
		
		for(int i = ZERO; i < ΝUMBER_OF_CHISELS; i++) {
			
			int number = StatisticalCharacteristics.randomTimeGrillingSkewerPie(FIFTEEN, TWENTY);
			
			this.chisels[i + ONE].setTimes(number);
			
			minutes += (number);
		
		}
		
		return (minutes);
		
	}

	@Override
	public String toString() {
		
		return ("Skewer Chicken Pie with " + this.getCentimetersOfPie() + " centimeters of pie and two chesels with "
				+ this.chisels[ONE].getCentimeters() + " centimeters of skewer chicken, it will be ready in "
				+ this.gettotalTime() + " minutes!");
		
	}

}
