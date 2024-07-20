package employeePayrollSystem;
import java.util.ArrayList;


abstract class Employee{
	private String name;
	private int id;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public abstract double salaryCalculate();
	
	@Override
	public String toString() {
		return "Employee [name = "+name+" ,id = "+id+" ,salary = "+salaryCalculate()+" ]";
	}
}

class FullTimeEmployee extends Employee{
	private double monthlySalary;
	
	FullTimeEmployee(String name, int id, double monthlySalary){
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double salaryCalculate() {
		return monthlySalary;
	}
}

class PartTimeEmployee extends Employee{
	private int hourWorked;
	private double hourlyRate;
	
	PartTimeEmployee(String name, int id, int hourWorked, double hourlyRate){
	super(name, id);
	this.hourlyRate = hourlyRate;
	this.hourWorked = hourWorked;
	}
	
	@Override
	public double salaryCalculate() {
		return hourWorked * hourlyRate;
	}
}

class PayrollSystem{
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem() {
		employeeList = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for(Employee employee: employeeList) {
			if(employee.getId()==id){
				employeeToRemove = employee;
				break;
			}
		}
		if(employeeToRemove != null) {
			employeeList.remove(employeeToRemove);
		}
	}
	public void displayEmployee() {
		for(Employee employee: employeeList) {
			System.out.println(employee);
		}
	}
	
	
}

public class EmployeePayroll {

	public static void main(String[] args) {
		PayrollSystem payrollsystem = new PayrollSystem();
		FullTimeEmployee emp1 = new FullTimeEmployee("Vivek", 1, 70000);
		PartTimeEmployee emp2 = new PartTimeEmployee("Bidyut", 2, 45, 100);
		
		
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		System.out.println("Initial employee details: ");
		payrollsystem.displayEmployee();
		payrollsystem.removeEmployee(2);
		System.out.println("Remaining employee details: ");
		payrollsystem.displayEmployee();

	}

}
