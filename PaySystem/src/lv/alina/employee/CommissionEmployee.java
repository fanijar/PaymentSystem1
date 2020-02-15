package lv.alina.employee;

public class CommissionEmployee extends Employee {
	private Double grossCommission = 0.0;
	private static final Double BONUS_MULTIPLIER = 1.5;
	
	
	public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
		super (name, bankAccount, grossWage);
	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentCommission() + doCurrentBonus();
	}
	
	private Double doCurrentCommission(){
		Double commission = grossCommission;
		grossCommission = 0.0;
		return commission;
	}
	
	public void giveCommission(Double amount){
		grossCommission += amount;
		
	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100) * BONUS_MULTIPLIER;
		

	}
	
	
	

}
