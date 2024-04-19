package hw4;

//import java.util.ArrayList;

public class Grille {
	
	static final int ZERO = 0;
	
	private int dynamicCentimeters;
	//private ArrayList<Chisel> chisels = new ArrayList<Chisel>();
	
	/**
	 * Constructs a Grille object with dynamic centimeters based on the kebab shop's rotisserie size.
	 * 
	 * @param aKebabShop    The kebab shop from which to get the rotisserie size.
	 */
	public Grille(KebabShop aKebabShop) {
		
		this.dynamicCentimeters = aKebabShop.getRotisserie();
		
	}
	
	/**
	 * Adds centimeters to the dynamic size of the grille.
	 * 
	 * @param oldCentimetersRotisserie    The amount of centimeters to add.
	 * @throws IllegalArgumentException if the old centimeters rotisserie value is less than zero.
	 */
	public void addCentimetersRotisserie(int oldCentimetersRotisserie) {
		
		if(oldCentimetersRotisserie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the old centimeters rotisserie value!");
			
		}
		
		this.dynamicCentimeters += oldCentimetersRotisserie;
		
	}
	
	/**
	 * Removes centimeters from the dynamic size of the grille.
	 * 
	 * @param newCentimetersRotisserie    The amount of centimeters to remove.
	 * @throws IllegalArgumentException if the new centimeters rotisserie value is less than zero.
	 */
	public void removeCentimetersRotisserie(int newCentimetersRotisserie) {
		
		if(newCentimetersRotisserie < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the new centimeters rotisserie value!");
			
		}
		
		this.dynamicCentimeters -= newCentimetersRotisserie;
		
	}
	
	/*public void addChisel(Chisel newChisel) {
		
		this.chisels.add(newChisel);
		
	}*/
	
	/*public void removeChisel(Chisel oldChisel) {
		
		this.chisels.remove(oldChisel);
		
	}*/
	
	/**
	 * Gets the dynamic size of the grille in centimeters.
	 * 
	 * @return The dynamic size of the grille in centimeters.
	 */
	public int getDynamicCentimeters() {
		
		return (this.dynamicCentimeters);
		
	}
	
	/*public int getSizeArrayList() {
		
		return (this.chisels.size());
		
	}*/

}
