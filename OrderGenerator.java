package hw4;

import java.io.*;

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
			
			for(int i=0;i<numberOfOrders;i++) {
			
				Order order=new Order(i);
				
				order.generate();
				
				String s="\n"+"<"+order.getNum()+" , "+order.getTOrder()+" , "+order.getTReq()+" , "+order.getNpp()+" , "+order.getNpc()+" , "+order.getNps()+" , "+order.getNpm()+" , "+order.getNpf()+">";
				
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
