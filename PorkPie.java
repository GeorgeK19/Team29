package hw4;

public class PorkPie extends Pie{
	
	static final int ONE = 1;
	static final int TWO = 2;
	static final int TWENTY = 20;
	static final int TWENTY_FIVE = 25;
	
	public static final int ΝUMBER_OF_CHISELS = TWO;
	
	private Chisel[] chisels = new Chisel[ΝUMBER_OF_CHISELS + ONE];
	
	/**
     * Instantiates a new PorkPie with the specified centimeters of pie and skewer pie.
     *
     * @param aCentimetersOfPie the centimeters of pie
     * @param aCentimetersOfSkewerPie the centimeters of skewer pie
     */
	public PorkPie(int aCentimetersOfPie, int aCentimetersOfSkewerPie) { // acentimetersOfSkewerPie => x
		
		super(aCentimetersOfPie);
		this.chisels[ZERO] = new Chisel(this.getCentimetersOfPie(), FIVE);
		
		this.addCentimeters((TWO * aCentimetersOfSkewerPie));
		
		for(int i = ZERO; i < ΝUMBER_OF_CHISELS; i++) {
			
			this.chisels[i + ONE] = new Chisel(aCentimetersOfSkewerPie);
			
		}
		
		this.addΜinutes(this.randomTime());
		
	}
		
	/**
     * Gets the chisel at the specified position.
     *
     * @param aPosition the position of the chisel
     * @return the chisel at the specified position
     */
	public Chisel getElementTable(int aPosition) {
		
		return (this.chisels[aPosition]);
		
	}

	@Override
	public int randomTime() {
		
		int minutes = ZERO;
		
		for(int i = ZERO; i < ΝUMBER_OF_CHISELS; i++) {
			
			int number = StatisticalCharacteristics.randomTimeGrillingSkewerPie(TWENTY, TWENTY_FIVE);
			
			this.chisels[i + ONE].setTimes(number);
			
			minutes += (number);
		
		}
		
		return (minutes);
		
	}

	@Override
	public String toString() {
		
		return ("Skewer Pork Pie with " + this.getCentimetersOfPie() + " centimeters of pie and two chesels with "
				+ this.chisels[ONE].getCentimeters() + " centimeters of skewer pork, it will be ready in "
				+ this.gettotalTime() + " minutes!");
		
	}

}
