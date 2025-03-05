package week3.day2.assignment;

public class APIClient {

	
	public void sendRequest(String endPoint) {
		System.out.println("This is the endpoint");
		
		System.out.println(endPoint);
		}
	
	public void sendRequest(String endPoint,String requestBody, boolean requestStatus) {
		System.out.println("Get the request");
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);

	}
	public static void main(String[] args) {
		APIClient excute= new APIClient();
		excute.sendRequest("Close the code");
		excute.sendRequest("The end", "Request the body", true);

	}

}
