
public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(salary > 1000) {
			return (salary / 100)*3; 
		}
		return 0;
	}
	
	double bonus() {
		if (workHours > 40) {
			return (workHours - 40)*30;
		}
		return 0;
	}
	
	
	double raiseSalary() {
		int tempYear = 2021 - hireYear;
		if (tempYear < 10) {
			return (salary/100)*5;
		}
		if (tempYear > 9 && tempYear < 20) {
			return (salary/100)*10;
		}
		
		if (tempYear > 19) {
			return (salary/100)*15;
		}
		return 0;
	}
	
	double withTaxesAndBonus() {
		return salary - tax() + bonus();
	}
	
	double sum() {
		return salary + raiseSalary() - tax() + bonus();
	}
		
	@Override
	public String toString() {
		return "Adı : " + name + 
				"\nMaaşı : " + salary + 
				"\nÇalışma Saati : " + workHours + 
				"\nBaşlangıç Yılı : " + hireYear + 
				"\nVergi : " + tax() + 
				"\nBonus : " + bonus() +
				"\nMaaş Artışı : " + raiseSalary() +
				"\nVergi ve Bonuslar ile birlikte maaş : " + withTaxesAndBonus() +
				"\nToplam Maaş : " + sum();
	}
}
