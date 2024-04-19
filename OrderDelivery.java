package hw4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderDelivery implements UsefulNumbers{
	
	private int numberOrders;
	private double averageDeviation;
	private int success;
	
	/**
     * Constructor for OrderDelivery class.
     * 
     * @param aNumberOrders     The number of orders.
     * @param anAverageDeviation    The average deviation.
     * @param aSuccess          The success count.
     */
	public OrderDelivery(int aNumberOrders, double anAverageDeviation, int aSuccess) {
		
		this.numberOrders = aNumberOrders;
		this.averageDeviation = anAverageDeviation;
		this.success = aSuccess;
		
	}
	
	/**
     * Sets the number of orders.
     * 
     * @param newNumberOrders   The new number of orders.
     */
	public void setNumberOrders(int newNumberOrders) {
		
		this.numberOrders = newNumberOrders;
		
	}
	
	/**
     * Sets the average deviation.
     * 
     * @param newAverageDeviation   The new average deviation.
     */
	public void setAverageDeviation(double newAverageDeviation) {
		
		this.averageDeviation = newAverageDeviation;
		
	}
	
	/**
     * Sets the success count.
     * 
     * @param newSuccess    The new success count.
     */
	public void setSuccess(int newSuccess) {
		
		this.success = newSuccess;
		
	}
	
	/**
     * Gets the number of orders.
     * 
     * @return  The number of orders.
     */
	public int getNumberOrders() {
		
		return (this.numberOrders);
		
	}
	
	/**
     * Gets the average deviation.
     * 
     * @return  The average deviation.
     */
	public double getAverageDeviation() {
		
		return (this.averageDeviation);
		
	}
	
	 /**
     * Gets the success count.
     * 
     * @return  The success count.
     */
	public int getSuccess() {
		
		return (this.success);
		
	}
	
	/**
     * Converts the object to a string representation.
     * 
     * @return  The string representation of the object.
     */
	public String toString() {
		
		return (this.numberOrders + " " + this.averageDeviation + " " + this.success);
		
	}

	 /**
     * Main method to run the OrderDelivery program.
     * 
     * @param args  Command-line arguments.
     */
	public static void main(String[] args) {
		
		if(args.length == ZERO) {
			
			System.out.println("Usage : java OrderGenerator number of orders");
			System.exit(1);
			
		}
		
		boolean stop = false;
		
		for (int i = ZERO; i < args.length; i++) 
			
			for(int j = ZERO; j < args[i].length(); j++) 
				
				if((args[i].charAt(j) < '0') || (args[i].charAt(j) > '9'))
					
					stop = true;
		
		if(stop) {
			
			System.out.println("Values ​​in command arguments do not contain only characters - numbers!");
			System.out.println("Usage : java OrderGenerator only characters - numbers!");
			System.exit(1);
			
		}
		
		if((args.length % EIGHT) != ZERO ) {
			
			System.out.println("Usage : java OrderGenerator the correct number of data (i.e. a multiple of eight)!");
			System.exit(1);
			
		}
		
		int numberKebabShop = (args.length / EIGHT);
		
		KebabShop[] shops = new KebabShop[numberKebabShop];
		int counter = ZERO;
		Grille[] grill = new Grille[numberKebabShop];
		FryingPan[] pans = new FryingPan[numberKebabShop];
		
		for (int i = SEVEN; i < args.length; i+=EIGHT) {
			
			int num1 = Integer.parseInt(args[i - SEVEN]);
			int num2 = Integer.parseInt(args[i - SIX]);
			int num3 = Integer.parseInt(args[i - FIVE]);
			int num4 = Integer.parseInt(args[i - FOUR]);
			int num5 = Integer.parseInt(args[i - THREE]);
			int num6 = Integer.parseInt(args[i - TWO]);
			int num7 = Integer.parseInt(args[i - ONE]);
			int num8 = Integer.parseInt(args[i]);
			
			shops[counter] = new KebabShop(num1, num2, num3, num4, num5, num6, num7, num8);
			
			grill[counter] = new Grille(shops[counter]);
			pans[counter] = new FryingPan(shops[counter]);
					
			counter++;
			
		}
		
		Days days;
		
		/*try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Write the numbers of the order files you would like the program to process.");
			int size =  scan.nextInt();  // Read user input
			days = new Days(size + ONE);
			
			System.out.println("Αdd the name of the order files you want the program to process.");
			for(int i = ZERO; i < (size + ONE); i++) {
				
				String file = scan.nextLine();
				
				days.addFileName(file);
				
			}
			
		}*/
		
		days = new Days(SIX);
		
		days.addFileName("orders1.txt");
		days.addFileName("orders2.txt");
		days.addFileName("orders3.txt");
		days.addFileName("orders4.txt");
		days.addFileName("orders5.txt");
		
		for(int i = ZERO; i < days.getLength(); i++) {
			
			String file = ("deliveries" + (i + ONE));
			
			Order[] orders;
			int length;
			
			ArrayList<String> elements = new ArrayList<String>();
			
			try {
				
				InputStream is = new FileInputStream(days.getElementOfFilesName(i));
				
				Reader source = new InputStreamReader(is);
				
				int c;
				String str = "";
				
				while((c = source.read()) >= 0) {
					
					if((c == ' ') || (c == '\n') && (str.length() != ZERO)) {
						
						elements.add(str);
						
						str = "";
						
					}
					
						
					if((c != ' ') && (c != '\n'))
						
						str += c;
						
				}
				
				length = Integer.parseInt(elements.get(ZERO));
				orders = new Order[length];
				
				for(int z = ZERO; z < orders.length; z++) {
					
					int[] numbers = new int[EIGHT];
					int metritis = ZERO;
					int start = ONE + (z * EIGHT);
					int end = ((z + ONE) * EIGHT);
					
					for(int k = start; k <= end; k++) 
						
						numbers[metritis] = Integer.parseInt(elements.get(k));
							
					orders[z] = new Order(numbers[ZERO], numbers[ONE], numbers[TWO], numbers[THREE],
								numbers[FOUR], numbers[FIVE], numbers[SIX], numbers[SEVEN]);
					
				}
					
				source.close();
		
				for(int j = ZERO; j < numberKebabShop; j++) {
			
					file += ((j + ONE) + ".txt");
					
					ArrayList <OrderImplementation> reparations = new ArrayList <OrderImplementation>();
					
					ReadyOrder[] ready = new ReadyOrder[orders.length];
					int counter3 = ZERO;
					
					int[] numbers = null;
					
					for(int w = ZERO; w < orders.length; w++)
						
						reparations.add(new OrderImplementation(shops[j], orders[w]));
				
					int counter2 = ZERO;
					
					int difference = (shops[j].getTimeCoals() - THIRTY); // THIRTY = 18:00 - 17:30 !
					
					if(difference < ZERO)
						
						difference = ZERO;
					
					//This loop represents the clock.
					for(int w = difference; w < THREE_HUNDRED_SIXTY_ONE; w++) {
						
						ArrayList <OrderImplementation> dynamicOrders = new ArrayList <OrderImplementation>();
						
						boolean stop2 = false;
						while((grill[j].getDynamicCentimeters() > ZERO)  && (pans[j].getCapacity() > ZERO)
								&& (stop2 == false)) {
							
							boolean step1 = false;
							boolean step2 = false;
							
							if((reparations.get(counter2).getTotalGrillCapacityOrder()) <= grill[j].getDynamicCentimeters())
								
								step1 = true;
							
							if((reparations.get(counter2).getTotalPanCapacityOrder()) <= pans[j].getCapacity())
								
								step2 = true;
								
							if((step1 == true) && (step2 == true)) {
								
								grill[j].removeCentimetersRotisserie(reparations.get(counter2).getTotalGrillCapacityOrder());
								pans[j].removeCapacity(reparations.get(counter2).getTotalPanCapacityOrder());
								
								dynamicOrders.add(reparations.get(counter2));
								
								counter2++;
							}
							
							else
								
								stop2 = true;
							
						}
						
						for(int k = ZERO; k < dynamicOrders.size(); k++) {
							
							dynamicOrders.get(k).addTime();
							
							if(dynamicOrders.get(k).getTotalGrillTimeOrder() != ZERO) {
							
								for(int p = ZERO; p < dynamicOrders.get(k).getLengthChiselTable(); p++) {
								
									if(dynamicOrders.get(k).getDynamicTime() == dynamicOrders.get(k).getElementTable(p).getMinutes()) {
									
										dynamicOrders.get(k).removeTotalGrillTimeOrder(dynamicOrders.get(k).getElementTable(p).getMinutes());
									
										grill[j].removeCentimetersRotisserie(dynamicOrders.get(k).getElementTable(p).getCentimeters());
									
									}
										
								}
							
							}
							
							if(dynamicOrders.get(k).getTotalPanTimeOrder() != ZERO) {
								
								if(dynamicOrders.get(k).getDynamicTime() == TWENTY)
									
									dynamicOrders.get(k).setTotalPanTimeOrder(ZERO);
								
							}
							
							if((dynamicOrders.get(k).getTotalGrillTimeOrder() == ZERO) 
									&& (dynamicOrders.get(k).getTotalPanTimeOrder() == ZERO)) {
								
								int[] newArray = new int[FOUR];
								
								int numberOrder = dynamicOrders.get(k).getNumberOrder();
								for(int q = ZERO; q < orders.length; q++)
									
									if(orders[q].getNum() == numberOrder) {
										
										newArray[ZERO] = orders[q].getTimeOrder();
										newArray[ONE] = orders[q].getTimeRequirement();
										newArray[TWO] = (orders[q].getNumberpPork() + orders[q].getNumberpChicken()
														+ orders[q].getNumberpSheftalia() + orders[q].getNumberpMix());
										newArray[THREE] = orders[q].getNumberpFries();
										
									}
								
								int delay = (dynamicOrders.get(k).getDynamicTime() - newArray[ONE]);
								
								ready[counter3] = new ReadyOrder(numberOrder, newArray[ZERO], 
										dynamicOrders.get(k).getDynamicTime(), delay, newArray[TWO], newArray[THREE]);
								counter3++;
								
								dynamicOrders.get(k).setTotalGrillTimeOrder(MINUS_ONE);
								dynamicOrders.get(k).setTotalPanTimeOrder(MINUS_ONE);
								
							}
							
						}
						
						numbers = new int[dynamicOrders.size()];
						for(int q = ZERO; q < dynamicOrders.size(); q++)
							
							numbers[ZERO] = dynamicOrders.get(q).getNumberOrder();
					
					}
					
					boolean exists;
					
					for(int q = ZERO; q < orders.length; q++) {
						
						exists = false;
						
						 for(int p = ZERO; p < numbers.length; p++)
							 
							 if(orders[q].getNum() == numbers[p])
								 
								 exists = true;
						
						 if(exists == false) {
							 
							 int sum = (orders[q].getNumberpPork() + orders[q].getNumberpChicken()
										+ orders[q].getNumberpSheftalia() + orders[q].getNumberpMix()); 
							 
							 ready[counter3] = new ReadyOrder(orders[q].getNum(), orders[q].getTimeOrder(), 
										ZERO, (THREE_HUNDRED_SIXTY_ONE - orders[q].getTimeRequirement()),
										sum, orders[q].getNumberpFries());
							counter3++; 
							 
						 }
						
					}
					
					double averageDeviation = ZERO;
					int counter4 = ZERO;
					int success = ZERO;
					
					for(int q = ZERO; q < ready.length; q++) {
						
						if(ready[q].getTimeDelay() <= ZERO) 
							
							success++;
						
						else {
							
							averageDeviation += ready[q].getTimeDelay();
							counter4++;
							
						}
						
					}
					
					OutputStream target = new FileOutputStream(file);
					
					OrderDelivery orderDelivery = new OrderDelivery(orders.length, averageDeviation, success);
					
					String output = orderDelivery.toString();
					
					int d;
					
					for(int q = ZERO; q < output.length(); q++) {
						
						d = output.charAt(q);
						
						target.write(d);
						
					}
					
					target.close();
					
				}
	
			}
			
			catch (IOException e) {
				
				System.err.println("Error:" + e.getMessage());
				
			}
			
		}
		
	}

}
