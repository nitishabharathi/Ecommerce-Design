
public class Order {
		public String orderId;
		public String orderStatus;
	  	public int totalCost = 0;
	    public Date orderDate;
	    

	    public void processOrder(PayStrategy strategy) {
	        strategy.collectPaymentDetails();
	     
	    }

	    public void setTotalCost(int cost) {
	        this.totalCost += cost;
	    }

	    public int getTotalCost() {
	        return totalCost;
	    }

	  
}
