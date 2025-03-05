package week4.day1;

public class Amazon extends CanaraBank{

	
	public static void main(String[] args) {
		Amazon paymentType=new Amazon();
		
		paymentType.cardPayment();
		paymentType.cashOnDelivery();
		paymentType.internetBanking();
		paymentType.internetBanking();
		paymentType.recordPaymentDetails();
		paymentType.homeLoan();

	}

	@Override
	public void homeLoan() {
		System.out.println("10%");
		
	}

}
