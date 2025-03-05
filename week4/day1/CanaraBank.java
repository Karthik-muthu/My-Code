package week4.day1;

public abstract class CanaraBank implements Payments {

	public static void main(String[] args) {
		
		
		
	}
	
	public abstract void homeLoan();
	
	public void recordPaymentDetails() {
		System.out.println("Record the payment details");

	}

	

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("DO upi payments");
		
	}

	@Override
	public void cardPayment() {
		System.out.println("Card payment accepted");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Proceed with internet banking");
		
	}

}


