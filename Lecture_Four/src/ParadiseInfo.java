
public class ParadiseInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		displayInfo();
		SpaService mySpa = new SpaService();
		
		mySpa.displayInfo();
		
		mySpa.setServiceDescripton("Our service is awesome");
		mySpa.setPrice(199.99);
		
		System.out.println("Service Description: "+ mySpa.getServiceDescription());
		System.out.println("Price is: "+mySpa.getPrice());
	}
	


}
