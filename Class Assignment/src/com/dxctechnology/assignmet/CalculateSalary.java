package com.dxctechnology.assignmet;

public class CalculateSalary  {
	
	public double calculateSal (double salary, int shift) throws SalaryValidationException {
		if (salary > 8000) {
			throw new SalaryValidationException("Salary is too big");
		}else if (shift <= 0) {
			throw new SalaryValidationException("Shifts are too small");
		}else if (salary <= 0) {
			throw new SalaryValidationException("salary is too small");
		}
		double salary1 = salary + (salary/30) * (shift) * 0.02;
		double salary2 = salary1 - (salary1*0.2) - (salary1*0.3);
		return salary2;
	}

}
