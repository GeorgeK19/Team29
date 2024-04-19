package hw4;

public class SheftaliaPie extends Pie{

	static final int ONE = 1;
	static final int TWO = 2;
	static final int TWENTY_FIVE = 25;
	
	public static final int ΝUMBER_OF_CHISELS = TWO;
	
	private Chisel[] chisels = new Chisel[ΝUMBER_OF_CHISELS + ONE];
	
	/**
     * Constructs a SheftaliaPie object with the specified parameters.
     *
     * @param aCentimetersOfPie the centimeters of pie for the SheftaliaPie
     * @param aCentimetersOfSheftaliaPie the centimeters of Sheftalia skewer for the SheftaliaPie
     */
	public SheftaliaPie(int aCentimetersOfPie, int aCentimetersOfSheftaliaPie) { // aCentimetersOfSheftaliaPie  => y
		
		super(aCentimetersOfPie);
		this.chisels[ZERO] = new Chisel(this.getCentimetersOfPie(), FIVE);
			
		this.addCentimeters((TWO * aCentimetersOfSheftaliaPie));
		
		for(int i = ZERO; i < ΝUMBER_OF_CHISELS; i++) {
			
			this.chisels[i + ONE] = new Chisel(aCentimetersOfSheftaliaPie);
			
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
			
			this.chisels[i + ONE].setTimes(TWENTY_FIVE);
			
			minutes += (TWENTY_FIVE);
			
		}
		
		return (minutes);
		
	}


	@Override
	public String toString() {
		
		return ("Sheftalia Pie with " + this.getCentimetersOfPie() + " centimeters of pie and two chesels with "
				+ this.chisels[ONE].getCentimeters() + " centimeters of sheftalia, it will be ready in "
				+ this.gettotalTime() + " minutes!");
		
	}
	
}
