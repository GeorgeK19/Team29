package hw4;

public class Order {
	int num;
	int torder;
	int treq;
	int npp=0;
	int npc=0;
	int nps=0;
	int npm=0;
	int npf=0;
	int p=1;
	int numberOfOrders;
	
	public Order(int numberOfOrders) {
		this.numberOfOrders=numberOfOrders;
	}
	
	public void generateTOrder() {
		int min=0;
		int max=300;
		
		int random=min+(int)(Math.random()*(max-min));
		
		this.torder=random;
	}
	
	public void generateTReq() {
		int min=0;
		int max=300;
		
		int random=min+(int)(Math.random()*(max-min));
		
		this.treq=random;
	}
	
	public void generate() {
		generateTOrder();
		generateTReq();
		
		for(int i=0;i<numberOfOrders;i++) {
			
			double random=Math.random();
			this.num=p;
			
			if(random>=0 && random<0.2)
				this.npp++;
			else if(random>=0.2 && random<0.4)
				this.npc++;
			else if(random>=0.4 && random<0.6)
				this.nps++;
			else if(random>=0.6 && random<0.8)
				this.npm++;
			else if(random>=0.8 && random<=1.0)
				this.npf++;			
			
			p++;
		}
	}
	
	public int getNum() {
		return this.num;
	}
	
	public int getTOrder() {
		return this.torder;
	}
	
	public int getTReq() {
		return this.treq;
	}
	
	public int getNpp() {
		return this.npp;
	}
	
	public int getNpc() {
		return this.npc;
	}
	
	public int getNps() {
		return this.nps;
	}
	
	public int getNpm() {
		return this.npm;
	}
	
	public int getNpf() {
		return this.npf;
	}

}
