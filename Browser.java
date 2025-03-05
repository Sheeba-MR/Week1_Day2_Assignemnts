package week2.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser launch = new Browser();
		Browser load = new Browser();
		System.out.println(launch.launchBrowser("Chrome"));
		load.loadUrl();
		

	}
	public static String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public static void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

}
