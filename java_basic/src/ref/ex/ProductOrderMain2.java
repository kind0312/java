package ref.ex;

public class ProductOrderMain2 {
	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];
		
//		ProductOrder order1 = createOrder("두부", 2000, 2);
		orders[0] = createOrder("두부", 2000, 2);
		
//		ProductOrder order2 = createOrder("김치", 5000, 1);
		orders[1] = createOrder("김치", 5000, 1);
		
//		ProductOrder order3 = createOrder("콜라", 1500, 2);
		orders[2] = createOrder("콜라", 1500, 2);
		
		/*
		 * int totalAmount = 0; for(ProductOrder order : orders) {
		 * System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price +
		 * ", 수량 : " + order.quantity); totalAmount += order.price * order.quantity; }
		 * System.out.println("총 결제 금액 : " + totalAmount);
		 */
		
		printOrders(orders);
		
		int totalAmount = getTotalAmount(orders); //-> 이클립스가 아닌 인텔리제이에서는 컨트롤+알트+V 하면 totalAmount 자동으로 만들어줌 
		System.out.println("총 결제 금액 : " + totalAmount);
		
	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}
	
	static void printOrders(ProductOrder[] orders) {
		for(ProductOrder order : orders) {
			System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
		}
	}
	
	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for(ProductOrder order : orders) {
			totalAmount += order.price*order.quantity;
		}
		return totalAmount;
	}
}
