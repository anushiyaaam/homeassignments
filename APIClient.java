package week3.day1.homeassignments.polymorphism;

public class APIClient {

	public void sendRequest(int versions, String endpoint) {

		System.out.println("Request is successful\n" + versions + "\n" + endpoint);

		// TODO Auto-generated method stub

	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {

		System.out.println("Request is successful \n" + endpoint +"\n" + requestBody);
		System.out.println("Request is successful"   + requestStatus);

		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		APIClient apiclient = new APIClient();
		apiclient.sendRequest(0, "test");
		apiclient.sendRequest("endpoint", "testmsg", true);

	}

}
