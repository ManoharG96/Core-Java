package com.dxctechnology.assignment2;

public class Customer {

	private String cusNo;
	private String cusName;
	private String category;

	public Customer(String cusNo, String cusName, String category)  {
		try {
			if (cusNo.charAt(0) == 'c' ||  cusNo.charAt(0) == 'C') {
				this.cusNo = cusNo;
			} else {
				ValidateException ve = new ValidateException("Custmor number should start with C or c");
				throw ve;
			}

			if (cusName.length()>3) {
				this.cusName = cusName;
			} else {
				ValidateException ve = new ValidateException("Customer Name should be atleat 4 character");
				throw ve;
			}

			if (category.equals("Gold") || category.equals("Platinum") || category.equals("Silver"))
				this.category = category;
			else {
				ValidateException ve = new ValidateException("Customer Category should be either gold, platinum or silver");
				throw ve;
			}

		}catch (ValidateException e) {
			System.out.println(e.getMessage());
		}
	}


	@Override
	public String toString() {
		return "Customer [cusNo=" + cusNo + ", cusName=" + cusName + ", category=" + category + "]";
	}

}
