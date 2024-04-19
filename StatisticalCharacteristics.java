package hw4;

import java.util.Random;

public class StatisticalCharacteristics implements UsefulNumbers{
	
	/**
     * Generates a random number following a normal Gaussian distribution.
     * @return A random number.
     */
	public static int normalGaussianDistribution() {
		
		int average = ONE_HUNDRED_AND_EIGHTY;
		int dispersion = SIXTY;
		
		// create random object 
        Random random = new Random();
		
		return ((int)(Math.sqrt(dispersion) * random.nextGaussian() + average));
		
	}
	
	/**
     * Generates a random time requirement for an order.
     * @return A random time requirement.
     */
	public static int randomTimeRequirement() {
		
		int start = THIRTY;
		int end = ONE_HUNDRED_AND_EIGHTY;
		
		Random random = new Random();
		int number = random.nextInt((end - start) + ONE) + start; // see explanation below
		    
		return (number);
		
	}
	
	/**
     * Generates a random number of pies for an order.
     * @return A random number of pies.
     */
	public static int randomΝumberOfPie() {
		
		Random random = new Random();
	    int next = random.nextInt(101);

	    if (next <= TWENTY) {
	    	
	        // this will happen 20% of the time
	        return (ONE);
	        		
	    } else if (next <= FIFTY_FIVE) {
	    	
	        // this will happen 35% of the time
	        return (TWO);
	    	
	    } else if (next <= SIXTY_FIVE) {
	    	
	        // this will happen 10% of the time
	        return (THREE);
	        
	    } else if (next <= EIGHTY_FIVE){
	    	
	        // this will happen 20% of the time
	        return (FOUR);
	        
	    } 
	    
	    int min = FIVE;
	    int max = TWENTY;
	    
	    // else this will happen 15% of the time
	    return ((int) (Math. floor(Math. random() *(max - min + ONE) + min)));	
	    		    
	}
	
	/**
     * Generates a random array of pie species for an order.
     * @return A random array of pie species.
     */
	public static int[] randomPieSpecies() {
		
		int[] spacies = {ZERO, ZERO, ZERO, ZERO};
		//String[] pies = {"Pork", "Chicken", "Sheftalia", "Mix"}; //parallel table
		
		String[] randomPies = {"Pork", "Chicken", "Sheftalia", "Mix", "Pork", "Chicken", "Sheftalia", "Mix",
						   "Pork", "Chicken", "Sheftalia", "Mix", "Pork", "Chicken", "Sheftalia", "Mix"};
		
		int min = ZERO;
		int max = FIFTEEN;
		
		int randomΝumberOfPie = randomΝumberOfPie();
		
		int random;
		
		for(int i = ZERO; i < randomΝumberOfPie; i++) {
			
			random = ((int) (Math. floor(Math. random() *(max - min + ONE) + min)));
			
			if (randomPies[random] == ("Pork")){
				
				spacies[ZERO]++;
				
			} else if (randomPies[random] == ("Chicken")) {
				
				spacies[ONE]++;
				
			} else if (randomPies[random] == ("Sheftalia")) {
				
				spacies[TWO]++;
				
			} else if (randomPies[random] == ("Mix")){
				
				spacies[TWO]++;
				
			}	
			
		}
		
		return (spacies);
		
	}
	
	/**
     * Generates a random number of fries for an order.
     * @return A random number of fries.
     */
	public static int randomΝumberOfFries() {
		
		Random random = new Random();
	    int next = random.nextInt(101);

	    if (next <= SIXTY) {
	    	
	        // this will happen 60% of the time
	        return (ONE);
	        		
	    } else if (next <= NINETY_FIVE) {
	    	
	        // this will happen 35% of the time
	        return (ZERO);
	    	
	    }
	    
	    // else this will happen 5% of the time
	    return (TWO);
		
	}
	
	/**
     * Generates a random time for grilling skewer pie.
     * @return A random number of fries.
     */
	public static int randomTimeGrillingSkewerPie(int start, int end) {
		
		Random random = new Random();
		int number = random.nextInt((end - start) + ONE) + start; // see explanation below
		    
		return (number);
		
	}

}
