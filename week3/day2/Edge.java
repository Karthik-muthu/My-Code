package week3.day2;

public class Edge extends Chrome{

	public void takeSnap() {
		System.out.println("Take the Snap");

	}
	public void clearCookies() {
		System.out.println("Clear the cookies");

	}
	public static void main(String[] args) {
		Edge surf= new Edge();
		surf.closeBrowser();
		surf.navigateBack();
		surf.clearCache();
		surf.openIncognito();
		surf.clearCookies();

	}

}
