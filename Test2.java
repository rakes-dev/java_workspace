class Employee{
	public void work(){
		System.out.println("Employee Working!");
	}
	public void getSalary(){
		System.out.println("Salary Credited!");	
	}
}
class HRManager extends Employee{
	public void work(){
		System.out.println("HR Manager Working!");
	}
	public void addEmployee(){
		System.out.println("Employee Added!");
	}
}

class Test2{
	public static void main(String[] args){
		 HRManager hr = new HRManager();
		 
		 hr.work();
		 hr.addEmployee();
		 hr.getSalary();
		 
	}
}
