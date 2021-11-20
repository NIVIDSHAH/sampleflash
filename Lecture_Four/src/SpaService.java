
public class SpaService {
	
	final double HIGH = 199.99;
	private String serviceDescription;   //Private because we don't want others to read it
	private double price;
	
	//Default Constructor
	public SpaService() { 			//Constructor
		serviceDescription = "XXX";
		price = 0;
	}
	
	
	public void setServiceDescripton(String service) {	//Set the value
		serviceDescription = service;
	}
	
	public String getServiceDescription() {
		return serviceDescription;
	}
	
	public void setPrice(double servicePrice) {
		if(servicePrice>HIGH) {
			System.out.println("Your price is too high");
			price = HIGH;
					
		}
		else {
			price = servicePrice;
		}
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public static void displayInfo() {
		System.out.println("Paradise Spa is very nice");
		System.out.println("We will make you look good");
	}

}
