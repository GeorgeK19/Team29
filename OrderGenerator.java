package hw4;

import java.io.*;
import java.util.*;

public class OrderGenerator {
	
	public static void main(String args[]) {
		
		if (args.length<1) {
            System.err.println("Error on args");
            return;
        }
		
		int numberOfOrders=Integer.parseInt(args[0]);
		
		try {
			OutputStream target=new FileOutputStream("orders.txt");
			
			String output="Number of orders:"+numberOfOrders;
			
			int c;
			
			for(int i=0;i<output.length();i++) {
				c=output.charAt(i);
				target.write(c);
			}
			
			Order[] orders=new Order[numberOfOrders];

            //Generate and add orders to the array
            for (int i=0;i<numberOfOrders; i++) {
                Order order=new Order(i);
                order.generate();
                orders[i]=order;
            }

            //Bubble sort
            for(int i=0;i<orders.length-1;i++){
                for(int j=0;j<orders.length-i-1;j++){
                    if(orders[j].getTReq()>orders[j+1].getTReq()){
                        Order temp=orders[j];
                        orders[j]=orders[j+1];
                        orders[j+1]=temp;
                    }
                }
            }
			
			for(int i=0;i<numberOfOrders;i++) {
				
				String s="\n"+"<"+orders[i].getNum()+" , "+orders[i].getTOrder()+" , "+orders[i].getTReq()+" , "+orders[i].getNpp()+" , "+orders[i].getNpc()+" , "+orders[i].getNps()+" , "+orders[i].getNpm()+" , "+orders[i].getNpf()+">";
				
				for(int k=0;k<s.length();k++) {
					c=s.charAt(k);
					target.write(c);
				}
			}
				
		}
		catch(IOException e) {
			System.err.println("Error");
		}
		
	}

}
