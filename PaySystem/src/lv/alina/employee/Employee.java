package lv.alina.employee;

import lv.alina.paysystem.Payee;

public abstract class Employee implements Payee {
	private String name;
	private Integer bankAccount;
	protected Double grossWage;
	protected Double currentBonus;

	public Employee(String name, Integer bankAccount, Double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
		currentBonus = 0.0;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	}
	public abstract void giveBonus(Double percentage);
	
	protected Double doCurrentBonus(){
		Double bonus = currentBonus;
		currentBonus = 0.0;
		return bonus;
	}

}
