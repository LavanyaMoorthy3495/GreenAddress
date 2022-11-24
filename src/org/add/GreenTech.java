package org.add;

public class GreenTech {
	
	public void greenOmr() {
		
		System.out.println("GreenTech Omr : Balamurugan Garden, Okkiam,"
				+ "Landmark: ICICI Bank Upstairs, Plot No.19, "
				+ "Rajiv Gandhi Salai, Opposite to Sankeetha hotel, "
				+ "Thoraipakkam-600097");
	}
	private void greenAdayar() {
		
		System.out.println("GreenTech Adayar : 10/15, 1st St,"
				+ " Padmanabha Nagar, Adyar, "
				+ "Chennai-600020");
		
	}
	private void greenTambaram() {
	
		System.out.println("GreenTech Tambaram : 1,Chennai - Theni Hwy,near HP Petrol Bulk,"
				+ "Opposite Arulmigu Sri Rama Anjaneyar Temple, "
				+ "Apparao Colony, Tambaram Sanatoruim, Chennai-600047");

	}

	private void greenVelacherry() {
		
		System.out.println("GreenTech Velacherry : #28, Nagendra Nagar, "
				+ "opposite Phoenix Market City,"
				+ "Velachery, Chennai-600042");

	}
	private void greenAnnaNagar() {
		
		System.out.println("GreenTech AnnaNagar : 4th floor, W122, 3rd Ave, "
				+ "W Block, Annanagar East, Chennai-600040");
	}
	public static void main(String[] args) {
		
		//object creation
		//ClassName objRefName = new ClassName();
		GreenTech address = new GreenTech();
		
		//method calling 
		//objRefName.methodName();
		address.greenOmr();
		address.greenAdayar();
		address.greenTambaram();
		address.greenVelacherry();
		address.greenAnnaNagar();
	}
}
