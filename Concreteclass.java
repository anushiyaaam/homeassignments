package week3.day3.list;

public  class Concreteclass implements DatabseConnection{
	
	public void connect() {
		
		System.out.println("Connect Method is from interface class");
		
		
	}
	public void disconnect() {
		System.out.println("Disconnect Method is from interface class");
		
		
	}
	public void executeupdate() {
		
		System.out.println("Executeupdate method is from interface class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Concreteclass object=new Concreteclass();
		object.connect();
		object.disconnect();
		object.executeupdate();
	}

}
