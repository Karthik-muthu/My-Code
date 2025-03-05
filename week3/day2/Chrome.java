package week3.day2;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Open the incognito");

	}
	public void clearCache() {
		System.out.println("Clear the cache");

	}
	
	public static void main(String[] args) {
		Chrome cache=new Chrome();
		cache.closeBrowser();
		cache.openIncognito();
		cache.navigateBack();

	}

}
