package week3.day2;

public class Browser {

	public void openURL() {
		
System.out.println("Load the URL");
	}

	public void closeBrowser() {
		
System.out.println("Close The Browser");
	}
	public void navigateBack() {
		
System.out.println("Navigate to the Back");
	}
	public static void main(String[] args) {
		Browser access=new Browser();
		access.openURL();
		access.closeBrowser();
		access.navigateBack();

	}

}
