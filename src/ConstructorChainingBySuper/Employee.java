package ConstructorChainingBySuper;

public class Employee extends Person {
	float Salary;

	public Employee(int Age, String Name, String Address, float Salary) {
		super(Age, Name, Address);
		this.Salary = Salary;

	}

}
