package Assignment2;

abstract class paymentMethod{
	
	int money;
	public paymentMethod(int money) {
		this.money=money;
	}
	abstract void processPayment();
}
class CreditCard extends paymentMethod{
	
	static double Fee = 2;
	public CreditCard(int money) {
		super(money);
		
	}
	void processPayment() {
		
		double processFee = (money*(Fee/100));
		double total=money+(money*(processFee/100));
		System.out.println("Transaction using CreditCard");
		System.out.println("Money sent : "+money);
		System.out.println("Process Fee : "+processFee);
		System.out.println("Total Debit Money : "+total);
		System.out.println("Transaction Successfully Completed");
	}
}
class PayPal extends paymentMethod{
	
	public PayPal(int money) {
		super(money);
	}
	void processPayment() {
		
		System.out.println("Transaction using PayPal");
		System.out.println("Money sent : "+money);
		System.out.println("Transaction Successfully Completed");
	}
}
public class Ques5 {
	
	public static void processTransaction(paymentMethod pm) {
		
		pm.processPayment();
	}

	public static void main(String[] args) {
		
		paymentMethod CreditCard = new CreditCard(100);
		paymentMethod PayPal = new PayPal(300);
		
		processTransaction(CreditCard);
		processTransaction(PayPal);
		

	}

}

