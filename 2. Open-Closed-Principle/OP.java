class Employee {
	String name;
	int age;
	String employeeType;
	
	public Employee(String name, int age, String employeeType) {
		this.name = name;
		this.age = age;
		this.employeeType = employeeType;
	}
	
	// Problem - If you want to add some more employeeType (else-if check), then need to modify existing code which breaks Open-Close Principle.
	public void calculateBonus() {
		if(employeeType == "Contract") {
			System.out.println("Only 5% hike");
		} else if(employeeType == "Permanment") {
			System.out.println("Only 10% hike");
		}
	}
}

class Untitled {
	public static void main(String[] args) {
		Employee emp = new Employee("Yesh", 23, "Permanment");
		Employee emp2 = new Employee("Jason", 24, "Contract");
		
		emp.calculateBonus();
		emp2.calculateBonus();
		
		Employee2 emp3 = new PermanmentEmpType();
		Employee2 emp4 = new ContractEmpType();
		
		emp3.calculateBonus2();
		emp4.calculateBonus2();
	}
}

// Solution - You can add multiple employeeType just extending employee2 abstract or interface class without modifying existing code.

abstract class Employee2 {
	abstract void calculateBonus2();
}

class PermanmentEmpType extends Employee2 {
	
	void calculateBonus2() {
		System.out.println("Only 10% hike");
	}	
}

class ContractEmpType extends Employee2 {
	
	void calculateBonus2() {
		System.out.println("Only 5% hike");
	}	
}

