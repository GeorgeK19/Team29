package hw4;

public class Days {
	
	static final int ZERO = 0;
	static final int ONE = 1;
	
	private int numberOfDays;
	private String[] filesNames;
	private int counter = ZERO;
	
	/**
     * Constructs a Days object with the given number of days.
     * @param anArgsLength The number of days for which filenames will be stored.
     */
	public Days(int anArgsLength) {
		
		this.numberOfDays = anArgsLength;
		
		this.filesNames = new String[this.numberOfDays];
		
	}
	
	/**
     * Sets the number of days.
     * @param newNumberOfDays The new number of days.
     * @throws IllegalArgumentException if the new number of days is negative.
     */
	public void setNumberOfDays(int newNumberOfDays) {
		
		if(newNumberOfDays < ZERO) {
			
			throw new IllegalArgumentException("A negative number was entered for the number of days!");
			
		}
		
		this.numberOfDays = newNumberOfDays;
		
		String[] newTable = new String[this.numberOfDays];
		
		for(int i = ZERO; i < newTable.length; i++) 
			
			newTable[i] = this.filesNames[i];
		
		this.filesNames = new String[this.numberOfDays];
		
		for(int i = ZERO; i < this.filesNames.length; i++) 
			
			this.filesNames[i] = newTable[i];
		
	}
	
	/**
     * Adds a filename to the list of filenames.
     * @param newFile The filename to be added.
     */
	public void addFileName(String newFile) {
		
		this.filesNames[this.counter] = newFile;
		this.counter++;
		
	}
	
	/**
     * Gets the number of days.
     * @return The number of days.
     */
	public int getNumberOfDays() {
		
		return (this.numberOfDays);
		
	}
	
	/**
     * Gets the filename at the specified position.
     * @param aPosition The position of the filename to retrieve.
     * @return The filename at the specified position.
     * @throws IndexOutOfBoundsException if the position is out of bounds.
     */
	public String getElementOfFilesName(int aPosition) {
		
		if((aPosition >= this.numberOfDays) || (aPosition < ZERO)) {
			
			throw new IndexOutOfBoundsException("Index " + aPosition + " is out of bounds for the number of days!");
			
		}
		
		return (this.filesNames[aPosition]);
		
	}
	
	/**
     * Gets the length of the file
     * @return The length of the file
     */
	public int getLength() {
		
		return (this.filesNames.length);
		
	}
	
	/**
     * Returns a string representation of the filenames for all days.
     * @return A string containing all filenames for all days.
     */
	public String toString() {
		
		String allDays = ("Filenames containing orders for " + this.numberOfDays + " days" + "\n" + "\n");
		
		for(int i = ZERO; i < this.numberOfDays; /*or i < this.filesNames.length;*/ i++) {
			
			allDays += this.filesNames[i];
			
			if(i < (this.numberOfDays - ONE))
				
				allDays += "\n";	
			
		}
		
		return (allDays);
		
	}
	
}
