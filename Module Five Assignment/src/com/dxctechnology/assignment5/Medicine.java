package com.dxctechnology.assignment5;

public abstract class Medicine {

	private int price;
	private String expiryDate;
	
	public String getMedicineDetails(){
		return "price: " + price + "Expiry Date: "+ expiryDate;
	}
	
	public abstract void displayLabel();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


}
