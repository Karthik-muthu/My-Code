package week3.day2.assignment;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("This the override method-childclass");
        super.performCommonTasks();
	}

	public static void main(String[] args) {
		LoginPage child =new LoginPage();
		child.clickElement();
		child.performCommonTasks();
		child.findElement();
		child.enterText();

	}

}
