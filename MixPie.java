package hw4;

public class MixPie extends Pie{
	
	static final int ONE = 1;
	static final int TWO = 2;
	static final int TWENTY = 20;
	static final int TWENTY_FIVE = 25;

	public static final int ΝUMBER_OF_CHISELS = TWO;
	
	private Chisel[] chisels = new Chisel[ΝUMBER_OF_CHISELS + ONE];
	
	/**
	 * Constructs a Mix Pie with specified dimensions.
	 * 
	 * @param aCentimetersOfPie         The size of the pie.
	 * @param aCentimetersOfSkewerPie   The size of the skewer pork.
	 * @param aCentimetersOfSheftaliaPie The size of the sheftalia.
	 */
	public MixPie(int aCentimetersOfPie, int aCentimetersOfSkewerPie, int aCentimetersOfSheftaliaPie) { // centimetersOfSkewerPie => x , centimetersOfSheftaliaPie =>y
		
		super(aCentimetersOfPie);
		this.chisels[ZERO] = new Chisel(this.getCentimetersOfPie(), FIVE);
		
		this.addCentimeters((aCentimetersOfSkewerPie + aCentimetersOfSheftaliaPie));
		
		this.chisels[ONE] = new Chisel(aCentimetersOfSkewerPie);
		this.chisels[TWO] = new Chisel(aCentimetersOfSheftaliaPie);
		
		this.addΜinutes(this.randomTime());
		
	}
	
	/**
	 * Retrieves a Chisel object from the specified position in the Mix Pie.
	 * 
	 * @param aPosition The position of the Chisel to retrieve.
	 * @return The Chisel object at the specified position.
	 */
	public Chisel getElementTable(int aPosition) {
		
		return (this.chisels[aPosition]);
		
	}

	@Override
	public int randomTime() {
		
		int minutes = ZERO;
		
		minutes += (StatisticalCharacteristics.randomTimeGrillingSkewerPie(TWENTY, TWENTY_FIVE)); // for pork chisel
		this.chisels[ONE].setTimes(minutes);
		
		minutes += (TWENTY_FIVE); // for sheftalia chisel
		this.chisels[TWO].setTimes(TWENTY_FIVE);
		
		return (minutes);
		
	}

	@Override
	public String toString() {
		
		return ("Skewer Mix Pie with " + this.getCentimetersOfPie() + " centimeters of pie, one chesel with "
				+ this.chisels[ONE].getCentimeters() + " centimeters of skewer pork and one chesel " + this.chisels[TWO].getCentimeters()
				+ " centimeters of sheftalia, it will be ready in " + this.gettotalTime() + " minutes!");
		
	}
	
}
