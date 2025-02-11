package week2.day1;

public class Browser {

	public void launchBrowser() {
		System.out.println("Browser launched successfully");
	}

	public String loadUrl( ) {
		
		return "Url loaded successfully";

	}
	
	public String Yahoo(String m) {
		
		return m;

	}
	
	public static void main(String[] args) {
		
		Browser result=new Browser();
		result.launchBrowser();
		System.out.println(result.loadUrl());
		System.out.println(result.Yahoo("Login into Yahoo"));
	}

}
